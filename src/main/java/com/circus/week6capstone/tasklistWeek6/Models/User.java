package com.circus.week6capstone.tasklistWeek6.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		long id;
		String emailAddress;
		String password;
//		@OneToMany(mappedBy = "user") //this indicates that the tasks are owned by the user
//		List<Task> tasks;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
//		public List<Task> getTasks() {
//			return tasks;
//		}
//		public void setTasks(List<Task> tasks) {
//			this.tasks = tasks;
//		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(long id, String emailAddress, String password, List<Task> tasks) {
			super();
			this.id = id;
			this.emailAddress = emailAddress;
			this.password = password;
//			this.tasks = tasks;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", emailAddress=" + emailAddress + ", password=" + password
					+ "]";
		}


}
