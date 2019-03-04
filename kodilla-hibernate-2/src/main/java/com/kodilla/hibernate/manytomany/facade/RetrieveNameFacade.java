package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RetrieveNameFacade {
    @Autowired
    private CompanyDao companyDao;

    //@Autowired
    //private CompanyMapper companyMapper;

    //private List<CompanyDto> companyListDto = new ArrayList<>();
    @Autowired
    private EmployeeDao employeeDao;

   // private static final Logger LOGGER = LoggerFactory.getLogger(RetrieveNameFacade.class);

    public List<Company> processQueryForCompany(String arg) {

       // throws NameRetrievingException {
       // boolean wasError = false;

        List<Company>companiesFound = companyDao.retrieveNameWith3CharsGiven(arg);
       // int size = companiesFound.size();
       // if (size ==0) {
           // LOGGER.error(NameRetrievingException.ERR_COMPANY_NOT_FOUND);
          // wasError = true;
          //  throw new NameRetrievingException(NameRetrievingException.ERR_COMPANY_NOT_FOUND);
       // }
//return companyMapper.mapToCompanyDtoList(companiesFound);
        return companiesFound;
    }


}