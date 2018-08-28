package taskListDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	EntityManager entityManager;
	
	//DONE FOR NOW


}
