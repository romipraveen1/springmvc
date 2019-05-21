package com.sgic.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classification")
public class Classification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ClassificationId")
	private int ClassificationId;
	@Column(name="ClassificationName")
	private String ClassificationName;
	
	public int getClassificationId() {
		return ClassificationId;
	}
	public void setClassificationId(int classificationId) {
		ClassificationId = classificationId;
	}
	public String getClassificationName() {
		return ClassificationName;
	}
	public void setClassificationName(String classificationName) {
		ClassificationName = classificationName;
	}
	
	

}
