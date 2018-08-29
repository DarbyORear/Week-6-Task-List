package com.circus.week6capstone.tasklistWeek6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.circus.week6capstone.tasklistWeek6.Dao.TaskDao;
import com.circus.week6capstone.tasklistWeek6.Dao.UserDao;


@Controller
public class TaskListController {
	
	@Autowired
	TaskDao taskdao;
	
	@Autowired
	UserDao userdao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		//you can add expression language, expressions, etc. to a ModelAndView.
		mav.addObject("task", taskdao.findAll());
		return mav;
	}
	
//	@RequestMapping(value="/item/{id}/update", method=RequestMethod.POST)
//	public ModelAndView submitEditForm(Task task, @PathVariable("id") int id) {
//		item.setId(id);
//		itemsDao.update(item);
//		return new ModelAndView("redirect:/edit-item");
//}
//	
//	@RequestMapping(value="/edit-item", method=RequestMethod.POST)
//	public ModelAndView viewEditForm() {
//		return new ModelAndView("redirect:/editItem");
//}
//	
	
	@RequestMapping("/add-task")
	public ModelAndView showAddItemForm() {			//CHANGE MADE: ADDED 2 EXTRA THINGS IN (), what goes there??
		return new ModelAndView("addItem", "name", "add Item"); //jsp file (in the jsp file, tell it the next place you want it to go is the submit-form method in the controller???
	}
	
//button -> controller -> dao -> database

}
