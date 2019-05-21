package com.sgic.app.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sgic.app.model.Classification;

@Repository
public class ClassificationDaoImpl implements ClassificationDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
//
//	
//	
//	public HibernateTemplate getHibernateTemplate() {
//		return hibernateTemplate;
//	}
//
//
//
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
//

	public Classification createClassification(Classification classification) {
		hibernateTemplate.save(classification);
		System.out.println("dao");
		return null;
	}
	
	public List<Classification> findall(){
		List<Classification> list=new ArrayList<Classification>();
		list=hibernateTemplate.loadAll(Classification.class);
		return list;
		
	}
}
