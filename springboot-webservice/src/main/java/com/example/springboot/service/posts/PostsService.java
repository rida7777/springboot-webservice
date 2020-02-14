package com.example.springboot.service.posts;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.springboot.domain.posts.PostsRepository;
import com.example.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostsService {
	
	private final PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		return postsRepository.save(requestDto.toEntity()).getId();
	}
	

}
