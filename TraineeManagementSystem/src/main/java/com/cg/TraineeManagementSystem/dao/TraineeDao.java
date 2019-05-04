package com.cg.TraineeManagementSystem.dao;

import java.util.ArrayList;

import com.cg.TraineeManagementSystem.bean.Trainee;

public interface TraineeDao {

	int addTrainee(Trainee trainee);
	int modifyTrainee(Trainee trainee);
	int deleteTrainee(int id);
	Trainee getById(int id);
	ArrayList<Trainee> getAll();

	
}
