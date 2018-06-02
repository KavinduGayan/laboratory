package com.ech.lab.laboratory.entity;

import javax.persistence.*;

/**
 * Created by Kavindu on 3/25/2018.
 */
@Entity (name = "EMPLOYEE")
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID")
    private long id;
    @Column (name = "FIRST_NAME")
    private String firstName;
    @Column (name = "LAST_NAME")
    private String lastName;
    @Column (name = "AGE")
    private String age;
    @Column (name = "MOBILE")
    private String mobile;
    @Column (name = "ROLE")
    private String role;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", mobile='" + mobile + '\'' +
                ", role='" + role + '\'' +
                ", address=" + address +
                '}';
    }
}
