package org.dnr.devoir.model;

import org.dnr.devoir.entities.Question;
import org.springframework.web.multipart.MultipartFile;

public class ReponseForm {

	private String name;
	private MultipartFile fileUpload;
	private Boolean correct;
	private Integer questionId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getCorrect() {
		return correct;
	}
	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	public MultipartFile getFileUpload() {
		return fileUpload;
	}
	
	public void setFileUpload(MultipartFile fileUpload) {
		this.fileUpload = fileUpload;
	}

	
}
