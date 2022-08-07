package com.jsp.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jsp.demo.domain.Post;
import com.jsp.demo.dto.PostDto;

@Mapper
public interface PostMapper {
	void save(Post post);
	PostDto findById(Long id);
	Post findOne(Long id);
	Post findByWriterId(Long writerId);
	List<Post> selectAll();
}
