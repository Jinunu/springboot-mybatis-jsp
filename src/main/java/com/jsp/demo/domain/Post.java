package com.jsp.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {

	private Long id;
	private String title;
	private String content;
	private Long memberId;
}
