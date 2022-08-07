DROP TABLE IF EXISTS Member;
DROP TABLE IF EXISTS Bord;


create table Member
(
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(255) NOT NULL,
 password VARCHAR(255) NOT NULL,
 email VARCHAR(255) NOT NULL
);

insert into Member(name, password, email) values('member1', '1234567', 'email1@email.com');
insert into Member(name, password, email) values('member2', '1234567', 'email2@email.com');
insert into Member(name, password, email) values('member3', '1234567', 'email3@email.com');

create table Post
(
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 title VARCHAR(255) NOT NULL,
 content VARCHAR(255) NOT NULL,
 member_id BIGINT NOT NULL
);

insert into Post(title, content, member_id) values('첫번째 게시글', '첫번째 게시글 내용', 1);