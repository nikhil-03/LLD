package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList=new ArrayList<>();
        User user1 = new User("Nikhil", 1); userList.add(user1);
        User user2 = new User("Akshat", 2); userList.add(user2);
        User user3 = new User("Sneha", 3);  userList.add(user3);
        User user4 = new User("Rahul", 4);  userList.add(user4);
        User user5 = new User("Priya", 5);  userList.add(user5);

        List<Post> postList=new ArrayList<>();
        Post post1=new Post(1,"Best sunrise in India");  postList.add(post1);
        Post post2 = new Post(2, "Exploring the hidden beaches of Goa"); postList.add(post2);
        Post post3 = new Post(3, "Trekking through the Himalayas");  postList.add(post3);
        Post post4 = new Post(4, "Delicious street food in Delhi");  postList.add(post4);
        Post post5 = new Post(5, "Peaceful evenings at Dal Lake");  postList.add(post5);
        Post post6 = new Post(6, "Architectural wonders of Jaipur");  postList.add(post6);
        Post post7 = new Post(7, "Backwaters of Kerala are magical");  postList.add(post7);
        Post post8 = new Post(8, "Rann of Kutch under the full moon");  postList.add(post8);
        Post post9 = new Post(9, "Best places to visit in Manali");  postList.add(post9);
        Post post10 = new Post(10, "Cultural festivals of Tamil Nadu"); postList.add(post10);
        Post post11 = new Post(11, "A road trip through Ladakh");  postList.add(post11);

        UsesController usesController=new UsesController(userList);
        PostsController postsController=new PostsController(postList);

        usesController.addUser(new User("TestUser",6));

        Twitter twitter = new Twitter(postsController,usesController);


        twitter.addPost(user1.userId,post2.postId);
        twitter.addPost(user1.userId,post3.postId);

        twitter.addPost(user3.userId,post5.postId);
        twitter.addPost(user3.userId,post6.postId);
        twitter.addPost(user3.userId,post7.postId);

        List<Post> PostId1 = twitter.getPost(user1);
        for(Post x : PostId1)System.out.println(x.title+"-");

        twitter.followUser(user1.userId, user3.userId);
        twitter.followUser(user1.userId, user4.userId);

        twitter.addPost(user4.userId, post11.postId);


        List<Post> PostId2 = twitter.getPost(user1);
        for(Post x : PostId2)System.out.println(x.title+"-");
    }
}