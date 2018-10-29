package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static final String ERR_EMPLOYEE_SEARCH = "Employee not found in database";
    public static final String ERR_COMPANY_SEARCH = "Company not found in database";

    public SearchException(String message) {
        super(message);
    }
}
