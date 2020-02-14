package com.example.springboot.web;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.posts.PostsService;
import com.example.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
	
	private final PostsService postsService;
	
	@PutMapping("/api/v1/posts")
	public Long sava(@RequestBody PostsSaveRequestDto requestDto) {
		return postsService.save(requestDto);
	}

}
