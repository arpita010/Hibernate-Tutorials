package com.mappingPackage;
import javax.persistence.*;
@Entity
public class Answer {
	@Id
	private int ansId;
	private String answer;
	
	// there will be one extra column in answer entity that is the
//	foreign key which references to primary key of question
	
	@OneToOne
	@JoinColumn(name="q_id")
	private Question ques;
	public int getAnsId() {
		return ansId;
	}
	public String getAnswer() {
		return answer;
	}
	public Question getQues() {
		return ques;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setQues(Question ques) {
		this.ques = ques;
	}
}
