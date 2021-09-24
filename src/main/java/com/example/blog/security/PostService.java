package com.example.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.example.blog.dto.PostDto;
import com.example.blog.model.Post;
import com.example.blog.service.AuthService;

@Service
public class PostService {
	 
	@Autowired
	private AuthService authService;
	
	public void createPost(PostDto postDto) {
		Post post=new Post();
       // post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        User username= authService.getCurrentUser().orElseThrow(()->new IllegalArgumentException("No User Logged In"));
        post.setUsername(username.getUsername());
        
	}
}


//Part-6 time 11:27