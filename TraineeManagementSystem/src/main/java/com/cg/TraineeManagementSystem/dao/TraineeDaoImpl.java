package com.cg.TraineeManagementSystem.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.TraineeManagementSystem.bean.Trainee;

@Component("traineeDao")
@Repository
@ComponentScan("com")
public class TraineeDaoImpl implements TraineeDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return 0;
	}

	@Override
	public int modifyTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		return 0;	
	}

	@Override
	public int deleteTrainee(int id) {
		Trainee trainee =new Trainee();
		trainee.setId(id);
		entityManager.remove(getById(id));
		return 0;
		}

	@Override
	public Trainee getById(int id) {
		Trainee trainee1=entityManager.find(Trainee.class, id);
		return trainee1;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		@SuppressWarnings("unchecked")
		Query<Trainee> query = (Query<Trainee>) entityManager.createQuery("from Trainee ");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
		return list;
	}

}
