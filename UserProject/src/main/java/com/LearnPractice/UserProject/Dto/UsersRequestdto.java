package com.LearnPractice.UserProject.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class UsersRequestdto {

    @NotEmpty
    private String userName;
    @NotEmpty(message = "This Field is Required")
    @Min(value = 10)
    private String phoneNumber;
    @Email(message = "Should be Proper Email...")
    private String email;

    public UsersRequestdto() {
    }

    public UsersRequestdto(String userName, String phoneNumber, String email) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
