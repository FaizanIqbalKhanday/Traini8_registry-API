package com.codeCubes.Traini8TrainingCenterRegistry.service;

import com.codeCubes.Traini8TrainingCenterRegistry.exception.TrainingCenterNotFoundException;
import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;
import com.codeCubes.Traini8TrainingCenterRegistry.repository.TrainingCenterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterServiceImp implements TrainingCenterService{
    @Autowired
    TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterServiceImp(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

    @Override
    public void createTrainingCenter(TrainingCenterDetails trainingCenterDetails) {
        trainingCenterRepository.save(trainingCenterDetails);
    }

    @Override
    public TrainingCenterDetails getTrainingCenter(String centerCode) {

        if(trainingCenterRepository.findByCenterCode(centerCode).isEmpty()){
            throw new TrainingCenterNotFoundException("Training center is not found");
        }
        return trainingCenterRepository.findByCenterCode(centerCode).get(0);
    }

    @Transactional
    public String deleteByCenterCode(String centerCode) {
        trainingCenterRepository.deleteByCenterCode(centerCode);
        return "training center deleted successfully";
    }


    @Override
    public List<TrainingCenterDetails> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
