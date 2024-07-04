package com.codeCubes.Traini8TrainingCenterRegistry.service;

import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;

public interface TrainingCenterService {
    public String createTrainingCenter(TrainingCenterDetails trainingCenterDetails);
    public TrainingCenterDetails getTrainingCenter(String centerCode);
}
