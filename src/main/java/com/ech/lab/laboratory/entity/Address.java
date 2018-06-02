package com.ech.lab.laboratory.entity;

import javax.persistence.*;

/**
 * Created by Kavindu on 3/25/2018.
 */
@Entity(name = "ADDRESS")
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "ADDRESS_ID")
    private long id;
    @Column(name = "NO")
    private String no;
    @Column(name = "ROAD")
    private String road;
    @Column (name = "TOWN")
    private String homeTown;
    @Column(name = "COUNTRY")
    private String country;
    /*@OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "EMPLOYEE_ID")
    private Employee employee;*/

    /*public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", road='" + road + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
