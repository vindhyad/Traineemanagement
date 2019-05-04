package com.cg.TraineeManagementSystem.myController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.TraineeManagementSystem.bean.Trainee;
import com.cg.TraineeManagementSystem.service.TraineeService;

@RestController
public class ControllerClass {
	
	@Autowired
	TraineeService traineeService;
	
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody Trainee trainee) {
		traineeService.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<?> updateData(@RequestBody Trainee trainee) {
		traineeService.modifyTrainee(trainee);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteTrainee(@RequestBody int id) {
		traineeService.deleteTrainee(id);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@GetMapping("/getById")
	public Trainee getByid(@RequestBody int id) {
		Trainee trainee=traineeService.getById(id);
		return trainee;
	}

	@GetMapping("/getAll")
	public ArrayList<Trainee> getAll(){
		ArrayList<Trainee> trainees = traineeService.getAll();
		return trainees;
	}
}
