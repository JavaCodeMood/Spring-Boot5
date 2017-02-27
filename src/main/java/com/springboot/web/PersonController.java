package com.springboot.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springboot")
public class PersonController {
	
	@RequestMapping("/person")
	public String index(Model model){
		Person single = new Person("aa",11);
		
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("刘豆豆",22);
		Person p2 = new Person("成龙",42);
		Person p3 = new Person("刘亦菲",32);
		Person p4 = new Person("景甜",28);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);
		
		return "index";
	}

}
