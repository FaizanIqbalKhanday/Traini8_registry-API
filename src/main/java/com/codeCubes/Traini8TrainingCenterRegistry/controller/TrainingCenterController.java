package com.codeCubes.Traini8TrainingCenterRegistry.controller;

import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;
import com.codeCubes.Traini8TrainingCenterRegistry.service.TrainingCenterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainingcenter")
public class TrainingCenterController {
    TrainingCenterService trainingCenterService;

    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }
    @PostMapping
    public String createTrainingCenter(@RequestBody TrainingCenterDetails trainingCenterDetails){
        trainingCenterService.createTrainingCenter(trainingCenterDetails);
        return "Success";

    }
    @GetMapping("/{centercode}")
    public TrainingCenterDetails getTrainingCenterDetails(@PathVariable("centercode") String centerCode){
       return trainingCenterService.getTrainingCenter(centerCode);
    }
    }
