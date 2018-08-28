package com.circus.week6capstone.tasklistWeek6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskListController {
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		//you can add expression language, expressions, etc. to a ModelAndView. it's complicated..but basically Spring 
		return mav;
	}


}
