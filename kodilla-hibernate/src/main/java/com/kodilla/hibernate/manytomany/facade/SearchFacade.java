package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> searchCompany(Company company) throws SearchException {
        List<Company> companyNameSearchResult = companyDao.searchCompanyByAnyFragment(company.getName());
        LOGGER.info("Searching company name: " + companyNameSearchResult);
        if (companyNameSearchResult.size() == 0) {
            LOGGER.error(SearchException.ERR_COMPANY_SEARCH);
            throw new SearchException(SearchException.ERR_COMPANY_SEARCH);
        } else {
            return companyNameSearchResult;
        }
    }

    public List<Employee> searchEmployee(Employee employee) throws SearchException {
        List<Employee> employeeNameSearchResult = employeeDao.searchEmployeeByAnyFragment(employee.getLastname());
        LOGGER.info("Searching employee: " + employeeNameSearchResult);
        if(employeeNameSearchResult.size() == 0) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_SEARCH);
            throw new SearchException(SearchException.ERR_EMPLOYEE_SEARCH);
        } else {
            return employeeNameSearchResult;
        }
    }
}
