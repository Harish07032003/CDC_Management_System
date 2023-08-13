package com.codewitharjun.fullstackbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Drive {
    @Id
    @GeneratedValue

    private Long id;
    private String off_name;
    private String Cmp_name;
    private String date;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCmp_name() {
        return Cmp_name;
    }

    public void setCmp_name(String cmp_name) {
        Cmp_name = cmp_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOff_name() {
        return off_name;
    }

    public void setOff_name(String off_name) {
        this.off_name = off_name;
    }
}
