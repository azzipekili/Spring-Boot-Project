package com.example.temp1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Student() {
    }

    public Student(String f, String l,
                   String g, String c, String e,
                   String p, String m, String a)
    {
        this.firstName = f;
        this.lastName = l;
        this.gender = g;
        this.email = e;
        this.mobileNumber = m;
        this.age = a;
    }
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "age")
    private String age;

    @Column(name = "comment")
    private String comment;

    public void setId(int id)
    {
        this.id = id;
    }
}