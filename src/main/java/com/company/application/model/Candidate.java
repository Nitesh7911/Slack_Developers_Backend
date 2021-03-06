package com.company.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;

@Entity
@Table(name="CANDIDATE_DETAILS", schema="slack_developers")
public class Candidate {

    @Id
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty("phone_number")
    private String phone_number;

    @JsonProperty("email_id")
    private String email_id;

    @JsonProperty("photo")
    private byte[] photo;

    @JsonProperty("current_company")
    private String current_company;

    @JsonProperty("opportunity")
    private String opportunity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCurrent_company() {
        return current_company;
    }

    public void setCurrent_company(String current_company) {
        this.current_company = current_company;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                ", email_id='" + email_id + '\'' +
                ", current_company='" + current_company + '\'' +
                ", opportunity='" + opportunity + '\'' +
                '}';
    }
}
/*
   ID              INT PRIMARY KEY     	NOT NULL,
   NAME            TEXT    				NOT NULL,
   AGE             INT     				NOT NULL,
   PHONE_NUMBER    VARCHAR(20) 			NOT NULL,
   EMAIL_ID        VARCHAR(40) 			NOT NULL,
   PHOTO		   OID,
   CURRENT_COMPANY VARCHAR(20) 			NOT NULL,
   OPPORTUNITY	   VARCHAR(20) 			NOT NULL

* */