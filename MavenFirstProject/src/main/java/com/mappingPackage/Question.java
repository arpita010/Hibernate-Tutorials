package com.mappingPackage;
import javax.persistence.*;

@Entity
public class Question {
	@Id
	private int quesID;
	private String question;
	
	@OneToOne(mappedBy="ques")
	private Answer ans;


	public int getQuesID() {
		return quesID;
	}


	public String getQuestion() {
		return question;
	}


	public Answer getAns() {
		return ans;
	}


	public void setQuesID(int quesID) {
		this.quesID = quesID;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public void setAns(Answer ans) {
		this.ans = ans;
	}
}
