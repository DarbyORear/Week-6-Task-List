package com.circus.week6capstone.tasklistWeek6.Models;

//POJO GOES IN THIS FILEEEEEEE

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@ManyToOne
	User user;
	String description;
	String due_date;
//	boolean complete;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(Long id, User user, String description, String due_date) { //TOOK OUT BOOLEAN COMPLETE
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.due_date = due_date;
//		this.complete = complete;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
//	public boolean isComplete() {
//		return complete;
//	}
//	public void setComplete(boolean complete) {
//		this.complete = complete;
//	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", user=" + user + ", description=" + description + ", due_date=" + due_date + "]";
	}
}
