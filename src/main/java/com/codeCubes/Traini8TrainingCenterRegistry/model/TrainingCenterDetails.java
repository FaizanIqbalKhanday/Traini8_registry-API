package com.codeCubes.Traini8TrainingCenterRegistry.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class TrainingCenterDetails {
    private String centerName;
    @Id
    private String centerCode;
    private int StudentCapacity;

    LocalDate createdOn;

    private String contactEmail;
    private String contactPhone;
    @Embedded
    Address address;
    @ElementCollection
    private List<String> coursesOffered;

    public TrainingCenterDetails() {
        this.createdOn=LocalDate.now();
    }

    public TrainingCenterDetails
            (String centerName, String centerCode,int studentCapacity, String contactEmail,
             String contactPhone,Address address,List<String> coursesOffered) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        StudentCapacity = studentCapacity;
        this.coursesOffered=coursesOffered;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = LocalDate.now();
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public int getStudentCapacity() {
        return StudentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        StudentCapacity = studentCapacity;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}

@Embeddable
class Address{
    private String pinCode;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String pinCode, String city, String state) {
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


