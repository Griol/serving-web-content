package com.example.servingwebcontent.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long num;
    private String name, adress, tel, email;

    @OneToMany
    @JoinColumn(name = "studMarks")
    public List<Progress> marks;

    public List<String> finCourses = new ArrayList<>();


    public List<Progress> getMarks() {
        return marks;
    }

    public void setMarks(List<Progress> marks) {
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

    public List<String> getFinCourses(){
        for(int i = 1;i<=marks.size();i++)
        if(marks.get(i).finMark()>=70){
            finCourses.add(marks.get(i).getCourse().getName());
        }
        return finCourses;
    }

}
