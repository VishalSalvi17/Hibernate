package com.citiustech.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Question {

	@Id
	@Column(name = "Question_Id")
	private int questionId;
	private String question;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="answerId")
	private Answer answers;

	public Question() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, Answer answers) {
//		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswers() {
		return answers;
	}

	public void setAnswers(Answer answers) {
		this.answers = answers;
	}

}
