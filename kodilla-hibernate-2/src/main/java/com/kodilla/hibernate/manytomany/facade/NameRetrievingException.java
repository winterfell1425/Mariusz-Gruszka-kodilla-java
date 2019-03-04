package com.kodilla.hibernate.manytomany.facade;

public class NameRetrievingException extends Exception{

    public static String ERR_COMPANY_NOT_FOUND = "Company not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public NameRetrievingException(String message) {
            super(message);
    }
}
