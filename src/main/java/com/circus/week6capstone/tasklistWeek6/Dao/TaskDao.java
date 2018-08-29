package com.circus.week6capstone.tasklistWeek6.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.circus.week6capstone.tasklistWeek6.Models.Task;

@Repository
@Transactional
public class TaskDao {

	@PersistenceContext
	EntityManager em;
	
	//What do i need in my dao to interact with my database?
	


	public List<Task> findAll() {
		return em.createQuery("FROM Task", Task.class).getResultList();
		
	}
	
	public Task findById(Long id) {
		return em.find(Task.class, id);
	}

//	
//	public Food findById(Long id) {
//		return em.find(Food.class, id);
//	}
//	
//	public List<Food> findByKeyword(String keyword) {
//		// HQL queries can have named parameters, such as :regex here.
//		return em.createQuery("FROM Food WHERE LOWER(name) LIKE :regex", Food.class)
//				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
//				.getResultList();
//	}
//	
//	public List<Food> findByCategory(String category) {
//		return em.createQuery("FROM Food WHERE LOWER(category) = :category", Food.class)
//				.setParameter("category", category.toLowerCase())
//				.getResultList();
//	}
//	
	public void createNewTask(Task task) {
		em.persist(task);
	}
//	
	public void updateTask(Task task) {
		em.merge(task);
	}
//	
//	public void delete(Long id) {
//		// Deleting with Hibernate entity manager requires fetching a reference first.
//		Food food = em.getReference(Food.class, id);
//		em.remove(food);
//	}
//	
//	public Set<String> findAllCategories() {
//		// This query returns a list of Strings, so I give it String.class
//		List<String> categoryList = em.createQuery("SELECT DISTINCT category FROM Food", String.class)
//				.getResultList();
//		// Convert the List to a Set.
//		return new TreeSet<>(categoryList);
//	}
//}

}
