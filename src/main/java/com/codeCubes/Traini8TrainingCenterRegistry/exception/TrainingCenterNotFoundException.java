package com.codeCubes.Traini8TrainingCenterRegistry.exception;

public class TrainingCenterNotFoundException extends RuntimeException{
    public TrainingCenterNotFoundException(String message) {
        super(message);
    }

    public TrainingCenterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
