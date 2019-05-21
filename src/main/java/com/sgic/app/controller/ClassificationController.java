package com.sgic.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.app.model.Classification;
import com.sgic.app.service.ClassificationService;



//@RestController
@Controller
public class ClassificationController {

	@Autowired
	private ClassificationService classificationService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("classification", new Classification());
		return "Classification";
	}
	
	@RequestMapping(value ="/saveClassification", method =RequestMethod.POST)
    public String save(@ModelAttribute("classification") Classification classification) {
		classificationService.addClassification(classification);
		return "redirect:/findClassification";
	}
	
	@RequestMapping(value ="/findClassification", method =RequestMethod.GET)
	public ModelAndView save(ModelAndView modelAndView) {
		modelAndView.setViewName("Classification");
		 List<Classification> classList = classificationService.getall();
		 System.out.println(classList);
		 modelAndView.addObject("classList",classList);
		 return modelAndView;
	        	
	}
	
//	@GetMapping("/find")
//	public  List<Classification> findallBook(Classification classification) {
//	
//		 List<Classification> defects = (List<Classification>) classificationService.getall();
//		 return defects;
//	        	
//	}
	
//	@RequestMapping(value ="/saveClassification", method =RequestMethod.POST)
//	public HttpStatus save( @RequestBody @ModelAttribute("classification") Classification classification) {
//		classificationService.addClassification(classification);
//		return HttpStatus.CREATED;
//	}
	
}
