package com.jsp.demo.member.dao;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.jsp.demo.dao.MemberMapper;
import com.jsp.demo.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberDaoTest {
	
	@Autowired
	MemberMapper mapper;
	
	@Test
	public void saveMember() throws Exception{
		//given
		Member member = new Member();
		member.setName("member1");
		member.setPassword("123456");
		member.setEmail("member@member.com");
		//when
		mapper.save(member);
		
		//then
		
	} 
	
	@Test
	public void selectById() throws Exception{
		 Long id = 1L;
		 
		 Member findMember = mapper.findById(id);
		 log.info(findMember.getName());
		
	}
	
	@Test
	public void selectAll() throws Exception{
		List<Member> members = mapper.selectAll();
		for (Member member : members) {
			log.info(member.getName());
		}
	}
	
	
	

}
