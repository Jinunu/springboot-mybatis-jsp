package com.jsp.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {

	private Long id;
	private String title;
	private String content;
	private String memberName;
	private String memberId;
}
