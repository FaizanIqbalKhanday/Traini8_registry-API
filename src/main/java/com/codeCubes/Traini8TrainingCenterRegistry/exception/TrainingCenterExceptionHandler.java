package com.codeCubes.Traini8TrainingCenterRegistry.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TrainingCenterExceptionHandler {
    @ExceptionHandler(value = {TrainingCenterNotFoundException.class})
    public ResponseEntity<Object> handlerTrainingCenterNotFoundException(TrainingCenterNotFoundException trainingCenterNotFoundException){
        TrainingCenterException trainingCenterException=new TrainingCenterException(
                trainingCenterNotFoundException.getMessage(),trainingCenterNotFoundException.getCause(), HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(trainingCenterException,HttpStatus.NOT_FOUND);
    }

}
