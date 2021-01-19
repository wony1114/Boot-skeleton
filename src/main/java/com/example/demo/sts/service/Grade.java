package com.example.demo.sts.service;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.uss.service.Student;

import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="grades")
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grd_num") private int grdNum;
	@Column(name = "score") private int score;
	@Column(name = "stu_num") private int stuNum;
	@Column(name = "sub_num") private int subNum;
	@Column(name = "grade") private String grade;
	@Column(name = "exam_date") private String examDate;
	@Column(name = "pass_exam") private String passExam;


	public Grade(int stuNum, int subNum, String examDate, int score) {
		this.subNum = subNum;
		this.examDate = examDate;
		this.score = score;
		this.stuNum = stuNum;
	}
	@Builder
	private Grade(int stuNum,
				  int subNum,
				  int score,
				  String grade,
				  String examDate,
				  String passExam){
		this.stuNum = stuNum;
		this.subNum = subNum;
		this.score = score;
		this.grade = grade;
		this.examDate = examDate;
		this.passExam = passExam;
	}

}