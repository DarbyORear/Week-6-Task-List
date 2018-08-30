package com.circus.week6capstone.tasklistWeek6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.circus.week6capstone.tasklistWeek6.Dao.TaskDao;
import com.circus.week6capstone.tasklistWeek6.Dao.UserDao;

import com.circus.week6capstone.tasklistWeek6.Models.User;


@Controller
public class TaskListController {
	
	@Autowired
	TaskDao taskdao;
	
	@Autowired
	UserDao userdao;
	
	//NOTE: trying to change it so that user login is on index page and tasks are listed on tasklist page
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	
	}
	
	@RequestMapping("/tasklist")
	public ModelAndView tasklist() {
		ModelAndView mav = new ModelAndView("tasklist");
		//you can add expression language, expressions, etc. to a ModelAndView.
		mav.addObject("task", taskdao.findAll());
		return mav;
	}
	
	//FIXME: I think the code below is wrong. what should happen next when a user enters username and password?
	@RequestMapping("/submit") //url path
	public ModelAndView showSummaryPage(
			@RequestParam("emailaddress")String emailaddress, //"firstname" = part of requestparam annotation, name = regular java parameter
			@RequestParam("password")String password)
	{
		
		//construct a user from the url params
		User newUser = new User();
		newUser.setEmailAddress(emailaddress); //matches String in Requestparam
		newUser.setPassword(password);
		
		ModelAndView mav = new ModelAndView("/");
		mav.addObject("newUser", newUser);
		return mav;	
	}
	
	
	
	
	
	
//	@RequestMapping(value="/item/{id}/update", method=RequestMethod.POST)
//	public ModelAndView submitEditForm(Task task, @PathVariable("id") int id) {
//		item.setId(id);
//		itemsDao.update(item);
//		return new ModelAndView("redirect:/edit-item");
//}

	
//button -> controller -> dao -> database

}
