package com.sgic.app.dao;

import java.util.List;

import com.sgic.app.model.Classification;

public interface ClassificationDao {
	public abstract Classification createClassification(Classification classification);
	public abstract List<Classification> findall();

}
