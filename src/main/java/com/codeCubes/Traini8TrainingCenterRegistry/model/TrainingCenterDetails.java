package com.codeCubes.Traini8TrainingCenterRegistry.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
@Entity
public class TrainingCenterDetails {
    @NotEmpty(message = "center name is required !")
    @Size(max = 40,message = "center name can not be greater than 40")
    private String centerName;
    @Id
    @Pattern(regexp = "\\w{6}", message = "Center code must be exactly 6 alphanumeric characters")
    private String centerCode;
    private int StudentCapacity;

    LocalDate createdOn;

    private String contactEmail;
    @Pattern(regexp = "\\d{10}", message = "Invalid phone number")
    private String contactPhone;
    @Embedded
    Address address;
    @ElementCollection
    @NotEmpty(message = "At least one course must be offered")
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
    @Pattern(regexp = "\\d{6}", message = "Pin code must be exactly 6 digits")
    private int pinCode;
    @NotEmpty(message = "City is required")
    private String city;
    @NotEmpty(message = "State is required")
    private String state;

    public Address() {
    }

    public Address(int pinCode, String city, String state) {
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
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


