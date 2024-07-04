package com.codeCubes.Traini8TrainingCenterRegistry.repository;

import com.codeCubes.Traini8TrainingCenterRegistry.model.TrainingCenterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenterDetails,String> {
    List<TrainingCenterDetails>findByCenterName(String centerName);
    List<TrainingCenterDetails>findByCenterCode(String centerCode);
}
