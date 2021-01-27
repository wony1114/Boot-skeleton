package com.example.demo.uss.service;

import com.example.demo.sts.service.Grade;
import com.example.demo.sym.service.Manager;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_num") private int stuNum;
	@Column(name = "userid") private String userid;
	@Column(name = "password") private String password;
	@Column(name = "name") private String name;
	@Column(name = "birthday") private String birthday;
	@Column(name = "gender") private String gender;
	@Column(name = "reg_date") private String regDate;
	@Column(name = "profile_image") private String profileImage;

	@ManyToOne
	@JoinColumn(name = "mgr_num")
	private Manager manager;

	@OneToMany(mappedBy = "student")
	private List<Grade> gradeList = new ArrayList<>();

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
	}

	@Builder
	private Student(String userid,
					String password,
					String name,
					String birthday,
					String regDate,
					String profileImage){
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.regDate = regDate;
		this.birthday = birthday;
		this.profileImage = profileImage;
	}


}