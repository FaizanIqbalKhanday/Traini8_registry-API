package com.codeCubes.Traini8TrainingCenterRegistry.service;

import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;

import java.util.List;

public interface TrainingCenterService {
    public void createTrainingCenter(TrainingCenterDetails trainingCenterDetails);
    public TrainingCenterDetails getTrainingCenter(String centerCode);
    public String deleteByCenterCode(String centerCode);
    public List<TrainingCenterDetails> getAllTrainingCenters();
}
