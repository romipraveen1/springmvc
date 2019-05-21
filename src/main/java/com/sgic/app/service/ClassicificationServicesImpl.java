package com.sgic.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.app.dao.ClassificationDao;
import com.sgic.app.model.Classification;

@Service
public class ClassicificationServicesImpl implements ClassificationService {
	
	@Autowired
    private ClassificationDao classificationDao;

	

//	public ClassificationDao getClassificationDao() {
//		return classificationDao;
//	}
//
//
//
//	public void setClassificationDao(ClassificationDao classificationDao) {
//		this.classificationDao = classificationDao;
//	}
//


	public Classification addClassification(Classification classification) {
		// TODO Auto-generated method stub
		return classificationDao.createClassification(classification);
	}
	
	public List<Classification>  getall() {
		// TODO Auto-generated method stub
		return classificationDao.findall();
	}


}
