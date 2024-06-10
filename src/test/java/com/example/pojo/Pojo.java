package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pojo {
    private int id;
    private String name;
    private String email;
    private int age;
    Address address;
    ArrayList<PhoneNumbers> phoneNumbers;
    private boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }


}