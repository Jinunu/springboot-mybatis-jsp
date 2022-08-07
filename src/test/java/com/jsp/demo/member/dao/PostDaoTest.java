package com.jsp.demo.member.dao;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.jsp.demo.dao.PostMapper;
import com.jsp.demo.domain.Member;
import com.jsp.demo.domain.Post;
import com.jsp.demo.dto.PostDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PostDaoTest {
	
	@Autowired
	PostMapper mapper;
	
	@Test
	public void save() throws Exception{
		Post newPost = new Post();
		newPost.setTitle("첫번째 게시글");
		newPost.setContent("첫번째 게시글 내용");
		newPost.setMemberId(1L);
		mapper.save(newPost);
		
	}
	
	@Test
	public void findById() throws Exception{
		Long memberId = 1L;
		Long postId = 1L;
		PostDto postDto = mapper.findById(postId);
		log.info( postDto.getMemberName());
	}
	
	
	@Test
	public void findOne() throws Exception{
	
		Long id = 1L;
		Post findPost = mapper.findOne(id);
		log.info(findPost.getContent());
	}
	
	

}
