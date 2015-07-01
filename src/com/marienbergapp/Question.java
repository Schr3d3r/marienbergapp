package com.marienbergapp;


public class Question {

	private String question;
	private String[] answers = {};
	private int rightAnswerId = -1;

	public Question(String question, String[] answers, int rightAnswerId) {

		this.question = question;
		this.answers = answers;
		this.rightAnswerId = rightAnswerId;
	}
	
	public String getQuestion() {
		return question;
	}

	public Question setQuestion(String question) {
		this.question = question;
		return this;
	}

	public String[] getAnswers() {
		return answers;
	}

	public Question setAnswers(String[] answers, int rightAnswerId) {
		this.answers = answers;
		this.rightAnswerId = rightAnswerId;
		return this;
	}

	public int getRightAnswerId() {
		return rightAnswerId;
	}
}
