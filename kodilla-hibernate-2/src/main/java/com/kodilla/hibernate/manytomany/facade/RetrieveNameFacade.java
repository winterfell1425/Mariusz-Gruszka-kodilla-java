package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RetrieveNameFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> processQueryForCompany(String arg) {
        List<Company> companies = companyDao.retrieveNameWithStringGiven(arg);
        return companies;
    }
    public List<Employee> processQueryForEmployee(String arg) {
        List<Employee> employees = employeeDao.retrieveLastnameWithStringGiven(arg);
        return employees;
    }
}