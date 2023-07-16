package com.example.servingwebcontent.models;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long num;
    private String name, adress, tel, email;
    private float avgmark;
    @OneToOne
    @JoinColumn(name = "studMarks")
    public Progress marks;


    public Progress getMarks() {
        return marks;
    }

    public void setMarks(Progress marks) {
        this.marks = marks;
    }

    public Long getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public float getAvgmark() {
        return avgmark;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvgmark(float avgmark) {
        this.avgmark = avgmark;
    }
}
