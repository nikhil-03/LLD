package org.example;

import java.util.List;

public class PostsController {
    List<Post> postList;

    public PostsController(List<Post> postList) {
        this.postList = postList;
    }

    public void addPosts(Post post){
        postList.add(post);
    }
    public void removePost(int id){
        postList.remove(id);
        return;
    }
    public List<Post> getAllPosts(){
        return postList;
    }
    public Post getPost(int id){
        for(Post post : postList){
            if(post.postId==id){
                return post;
            }
        }
        return new Post(0,"Not found");
    }
}
