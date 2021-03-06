package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompanyWithTheseLetters",
        query = "SELECT * FROM COMPANIES" +
        " WHERE LEFT (COMPANY_NAME, 3) LIKE :COMPANY_NAME",
        resultClass = Company.class
)
@NamedQuery(
        name = "Company.searchCompanyByAnyFragment",
        query = "FROM Company WHERE COMPANY_NAME LIKE CONCAT('%',:COMPANY_NAME,'%')"
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
