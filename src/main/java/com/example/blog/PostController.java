package com.example.blog;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.dto.PostDto;

@RestController
@RequestMapping("/api/posts/")
public class PostController {
	
	@PostMapping
	public void createPost(@RequestBody PostDto postDto) {
		
	}
}
