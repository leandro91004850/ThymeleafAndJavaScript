package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;

@Controller
@RequestMapping("/demo")
public class MyController {
	
	@Autowired
	private PersonRepository personRepository;

	@RequestMapping("/mypage")
	public ModelAndView showPage() {
		ModelAndView mv = new ModelAndView("mypage");
		Iterable<Person> person = personRepository.findAll();
		mv.addObject("myList", person);
		return mv;
		
		/*ArrayList myList = new ArrayList();
		
		Person p = new Person();
		p.setName("John");
		p.setAge(12);
		
		myList.add(p);
		
		Person p2 = new Person();
		p2.setName("Tom");
		p2.setAge(25);
		myList.add(p2);
		
		model.addAttribute("myList", myList);
		
		return "mypage";*/
	}
}
