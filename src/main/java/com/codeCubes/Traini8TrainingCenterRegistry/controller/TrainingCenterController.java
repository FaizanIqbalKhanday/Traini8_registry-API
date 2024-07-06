package com.codeCubes.Traini8TrainingCenterRegistry.controller;

import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;
import com.codeCubes.Traini8TrainingCenterRegistry.response.ResponseHandler;
import com.codeCubes.Traini8TrainingCenterRegistry.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainingcenter")
public class TrainingCenterController {
    TrainingCenterService trainingCenterService;

    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }
    @PostMapping
    public String createTrainingCenter(@Valid @RequestBody TrainingCenterDetails trainingCenterDetails){
        trainingCenterService.createTrainingCenter(trainingCenterDetails);
        return "training center added successfully";

    }
    @GetMapping("/{centercode}")
    public ResponseEntity<Object> getTrainingCenterDetails(@PathVariable("centercode") String centerCode){

        return ResponseHandler.responseBuilder("Requested vendor details are given here", HttpStatus.OK,trainingCenterService.getTrainingCenter(centerCode));
    }
    @GetMapping
    public List<TrainingCenterDetails>getAllTrainingCenters(){
        return trainingCenterService.getAllTrainingCenters();
    }
    @DeleteMapping("/{centerCode}")
    public String deleteTrainingCenter(@PathVariable String centerCode) {
        return trainingCenterService.deleteByCenterCode(centerCode);
    }
    }
