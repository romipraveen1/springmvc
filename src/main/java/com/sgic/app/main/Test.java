package com.sgic.app.main;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.app.model.Classification;
import com.sgic.app.service.ClassicificationServicesImpl;
import com.sgic.app.service.ClassificationService;

public class Test {

	
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfic.xml");
			ClassificationService classificationService=ctx.getBean("classificationService", ClassicificationServicesImpl.class);
			
//			Classification classification=new Classification();
//			classification.setClassificationName("maths");
//			
//			classificationService.addClassification(classification);
//			 List<Classification> clas = (List<Classification>) classificationService.getall();
//			System.out.println("clas");
}
}