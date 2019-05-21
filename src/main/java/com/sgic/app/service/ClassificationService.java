package com.sgic.app.service;

import java.util.List;

import com.sgic.app.model.Classification;

public interface ClassificationService {
	public abstract Classification addClassification(Classification classification);
	public abstract List<Classification> getall();
	

}
