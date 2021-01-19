package com.example.demo.sts.service;

import lombok.*;
import javax.persistence.*;
@Getter
@Entity
@ToString
@Table(name = "subjects")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sub_num") private int subNum;
	@Column(name = "subject") private String subject;
	@Column(name = "description") private String description;

	@Builder
	private Subject(String subject, String description){
		this.subject = subject;
		this.description = description;
	}
	public Subject(){}
}

