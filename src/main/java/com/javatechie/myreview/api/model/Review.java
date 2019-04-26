package com.javatechie.myreview.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="MYReview")
public class Review {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int experience;
	private String companyName;
	private String interviewDate;
	private String interviewMode;
	private String jobDescription;
	private String primaryFocus;
	private String appliedFor;

}
