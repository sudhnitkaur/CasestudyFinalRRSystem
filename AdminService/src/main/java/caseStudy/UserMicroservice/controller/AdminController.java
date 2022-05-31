package caseStudy.UserMicroservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caseStudy.UserMicroservice.entity.AdminDetails;
import caseStudy.UserMicroservice.entity.TrainDetails;
import caseStudy.UserMicroservice.service.AdminService;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*") 
@RestController 
@RequestMapping("/admin/Access") 
public class AdminController {

	@Autowired
	private AdminService userService;

	// This method finds the all Trains
	@GetMapping("/findAll") 
	@ApiOperation(value = "Get all Train details")
	public List<TrainDetails> getAllDetails() {
		return userService.getAllDetails();
	}

	// This method finds the train by train no
	@GetMapping("/find/{trainNo}")
	@ApiOperation(value = "Get all Train details by train Number")
	public TrainDetails getDetailsByTrainNo(@PathVariable int trainNo) {
		return userService.findByTrainNo(trainNo);
	}

	// This method add the new train
	@PostMapping("/add")
	@ApiOperation(value = "Add new Train details to train database")
	public String addTrainDetails(@Valid @RequestBody TrainDetails trainDetails) {
		userService.addTrainDetails(trainDetails);
		return ("Added Train details with Train number - " + trainDetails.getTrainNo() + " successfully..!!");
	}

	// This method update the details of previous Train
	@PutMapping("/update/{trainNo}")
	@ApiOperation(value = "Update train details in train database by train Number")
	public TrainDetails updateTrainDetails(@PathVariable int trainNo,
			@Valid @RequestBody TrainDetails trainDetails) {
		return userService.updateTrainDetails(trainNo, trainDetails);
	}

	// This method delete the train by trainNo
	@DeleteMapping("/delete/{trainNo}")
	@ApiOperation(value = "Delete Train details in train database by Train Number")
	public ResponseEntity<TrainDetails> deleteTrainDetails(@PathVariable int trainNo) {
		return userService.deleteTrainDetails(trainNo);
	}

	// update the no of seats based on the no of passengers that booked ticket
	@GetMapping("/updateSeats/{trainNo}/{noOfPassengers}")
	public void updateSeats(@PathVariable int trainNo, @PathVariable int noOfPassengers) {
		TrainDetails currenttrain = userService.findByTrainNo(trainNo);
		int initialSeats = currenttrain.getNoOfSeats();
		int finalSeats = initialSeats - noOfPassengers;
		currenttrain.setNoOfSeats(finalSeats);
		userService.updateTrainDetails(trainNo, currenttrain);
	}

	// This method find the trains by startpoint, endpoint and trainDate
	@GetMapping("/findBy/{startPoint}/{endPoint}/{trainDate}")
	@ApiOperation(value = "Get Train details by giving startPoint and endPoint locations and date")
	public TrainDetails[] getTrainDetailsByStartPointAndEndPointAndTrainDate(@PathVariable String startPoint,
			@PathVariable String endPoint, @PathVariable String trainDate) {
		return userService.findByStartPointAndEndPointAndTrainDate(startPoint, endPoint, trainDate);
	}

	// This method add the admin details
	@PostMapping("/signup")
	@ApiOperation(value = "To Add Admin Details") 
	public String saveUser(@RequestBody AdminDetails adminDetails) {
		try {
			this.userService.addAdmin(adminDetails);
			return "Admin Login Successfully ";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Operation Failed";
	}

}