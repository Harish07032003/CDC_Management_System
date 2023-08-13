package com.codewitharjun.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Officer {

    @Id
    @GeneratedValue

    private Long id;
    private String rollno;
    private String name;
    private String date;
    private String comp_name;
    private String HR_name;
    private String HR_email;
    private String HR_phoneno;
    private String report;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getHR_name() {
        return HR_name;
    }

    public void setHR_name(String HR_name) {
        this.HR_name = HR_name;
    }

    public String getHR_email() {
        return HR_email;
    }

    public void setHR_email(String HR_email) {
        this.HR_email = HR_email;
    }

    public String getHR_phoneno() {
        return HR_phoneno;
    }

    public void setHR_phoneno(String HR_phoneno) {
        this.HR_phoneno = HR_phoneno;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
