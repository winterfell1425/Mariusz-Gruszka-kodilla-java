/*package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeNameQuaryTestSuite {
    @Autowired
    CompanyDao companyDao;
    //@Autowired
    //EmployeeDao employeeDao;
    @Autowired
    RetrieveNameFacade retrieveNameFacade;

    @Test
    public void testFacadeFindCompanyName(){
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company sofffMatter = new Company("Sofff Matter");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(sofffMatter);


        List<Company> companiesFound = retrieveNameFacade.processQueryForCompany("sof");
       // } catch (NameRetrievingException e) {
            //business exception - should be handled in real application
        //Then
        Assert.assertEquals(2, companiesFound.size());


    }



}*/
