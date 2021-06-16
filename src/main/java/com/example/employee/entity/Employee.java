package com.example.employee.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
public class Employee {
    @Id
    public int id;
    public String name;
    public String designation;
    public int salary;
}
