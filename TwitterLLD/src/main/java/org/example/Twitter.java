package org.example;

import java.util.*;

public class Twitter {
    Map<Integer,Set<Integer>> followList=new HashMap<>();
    Map<Integer,List<UserPostPair>> postList= new HashMap<>();;

    UsesController usesController;
    PostsController postsController;
    int cnt=0;
    public Twitter(PostsController postsController, UsesController usesController) {
        this.postsController = postsController;
        this.usesController = usesController;
    }

    public void followUser(int userId1, int userId2){
        followList.putIfAbsent(userId1, new HashSet<>());
        followList.get(userId1).add(userId2);
    }

    public void unFollowUser(int user1,int user2){
        if (followList.containsKey(user1)) {
            followList.get(user1).remove(user2);
        }
    }

    public void addPost(int userId,int postId){
        postList.putIfAbsent(userId,new ArrayList<>());
        postList.get(userId).add(new UserPostPair(cnt++,postId));
    }

    public List<Post> getPost(User user){
        List<Post> posts=new ArrayList<>();
        List<UserPostPair> userPostPairs = postList.get(user.userId);
        if (userPostPairs != null) {
            System.out.println("User "+user.userId+" follows ->");
            for (UserPostPair userPostPair : userPostPairs) {
                posts.add(postsController.getPost(userPostPair.postId));
                //System.out.println("User Post Pair : Post cnt " + userPostPair.idCnt + " Post Id " + userPostPair.postId);
            }
        } else {
            System.out.println("No posts found for user " + user.userId);
        }

        Set<Integer> set = followList.get(user.userId);

        if (set != null) {
            for (Integer userId : set) {
                //System.out.println("Following " + userId);
                List<UserPostPair> userPostPairList = postList.get(userId);
                if(userPostPairList!=null && !userPostPairList.isEmpty()){
                    for(UserPostPair post : userPostPairList ){
                        posts.add(postsController.getPost(post.postId));
                    }
                }
            }
        }
        else {
            System.out.println("User " + user.userId + " is not following anyone.");
        }
        return posts;
    }

    public void getKPost(User user,int k){

    }
    public List<Post> getAllPost(){
        return postsController.getAllPosts();
    }
    public List<User> getAllUser(){
         return usesController.getAllUser();
    }

}
