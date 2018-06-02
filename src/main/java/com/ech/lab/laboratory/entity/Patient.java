package com.ech.lab.laboratory.entity;

import javax.persistence.*;

/**
 * Created by Kavindu on 3/1/2018.
 */
@Entity
@Table(name="PATIENT")
public class Patient {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="MOBILE")
    private String mobile;
    @Column(name = "AGE")
    private int age;
    @Column(name = "ADDRESS")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
