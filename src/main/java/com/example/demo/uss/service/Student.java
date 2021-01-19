package com.example.demo.uss.service;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.cmm.enm.Path;

import javax.persistence.*;


@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_num") private int stuNum;
	@Column(name = "mgrNum") private int mgrNum;
	@Column(name = "userid") private String userid;
	@Column(name = "password") private String password;
	@Column(name = "name") private String name;
	@Column(name = "birthday") private String birthday;
	@Column(name = "gender") private String gender;
	@Column(name = "reg_date") private String regDate;
	@Column(name = "profile_image") private String profileImage;


	public Student(String userid,
				   String password,
				   String name,
				   String birthday,
				   String gender,
				   String regDate,
				   String profileImage,int mgrNum) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.regDate = regDate;
		this.profileImage = profileImage;
		this.mgrNum = mgrNum;
	}

	@Builder
	private Student(int mgrNum,
					String userid,
					String password,
					String name,
					String birthday,
					String regDate,
					String profileImage){
		this.mgrNum = mgrNum;
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.regDate = regDate;
		this.birthday = birthday;
		this.profileImage = profileImage;
	}


}