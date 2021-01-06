package com.kh.practice.student.model.vo;

public class Student {

	private String name; // 이름
	private String subject; // 과목
	private int score; // 점수

	public Student() {

	}

	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public String getSubject() {
		return this.subject;
	}

	public int getScore() {
		return this.score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String inform() {
		String result;
		result = "이름 : " + getName() + " / 과목 : " + getSubject() + " / 점수 : " + getScore();
		return result;
	}

}
