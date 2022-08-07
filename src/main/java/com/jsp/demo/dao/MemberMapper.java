package com.jsp.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jsp.demo.domain.Member;

@Mapper
public interface MemberMapper {
	void save(Member member);
	Member findById(Long id);
	Member findByEmail(String email);
	List<Member> selectAll();
}
