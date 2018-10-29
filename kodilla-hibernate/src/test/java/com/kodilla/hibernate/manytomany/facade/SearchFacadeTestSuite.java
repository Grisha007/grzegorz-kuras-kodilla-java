package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void searchCompanyTest(){
        //Given
        Company company = new Company("Company One");

        //When
        companyDao.save(company);

        //Then
        Assert.assertEquals("Company One", companyDao.searchCompanyByAnyFragment("One"));
    }

    @Test
    public void searchEmployeeTest(){
        //Given
        Employee employee = new Employee("John", "Kowalski");

        //When
        employeeDao.save(employee);

        //Then
        Assert.assertEquals("Kowalski", employeeDao.searchEmployeeByAnyFragment("ski"));
    }

}
