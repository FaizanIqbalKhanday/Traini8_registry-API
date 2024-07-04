package com.codeCubes.Traini8TrainingCenterRegistry.service;

import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;
import com.codeCubes.Traini8TrainingCenterRegistry.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingCenterServiceImp implements TrainingCenterService{
    @Autowired
    TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterServiceImp(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

    @Override
    public String createTrainingCenter(TrainingCenterDetails trainingCenterDetails) {
        trainingCenterRepository.save(trainingCenterDetails);
        return "success";
    }

    @Override
    public TrainingCenterDetails getTrainingCenter(String centerCode) {

        return trainingCenterRepository.findByCenterCode(centerCode).get(0);
    }
}
