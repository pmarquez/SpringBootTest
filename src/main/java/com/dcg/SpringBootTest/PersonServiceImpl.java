package com.dcg.SpringBootTest;

//   Standard Libraries Imports

//   Third Party Libraries Imports

import com.dcg.SpringBootTest.model.person.Person;
import com.dcg.SpringBootTest.repository.TestRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

//   ns Framework Imports

//   Domain Imports


/**
 * PersonServiceImpl.java<br><br>
 * Creation Date 2022-05-02 16:38<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-05-02 16:38<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-05-02 16:38
 */
@Log
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    TestRepository testRepo;

    @Override
    public String persistPerson ( Person person ) {

        person.setPersonCode ( UUID.randomUUID ( ).toString ( ) );
        log.info("PersonCode = " + person.getPersonCode ( ) );

        testRepo.save ( person );

        return person.getPersonCode ( );
    }

    /**
     * RETRIEVE
     *
     * @param id
     * @return
     */
    @Override
    public Person retrievePerson(String id) {

        Optional<Person> person = testRepo.findById ( id );

        return person.get ( );
    }

    /**
     * UPDATE
     *
     * @param id
     * @param person
     * @return
     */
    @Override
    public int updatePerson(String id, Person person) {

        Optional<Person> tmpPerson = testRepo.findById ( id );

        Person tmpPerson2 = tmpPerson.get ( );

        tmpPerson2.setPersonName ( person.getPersonName ( ) );
        tmpPerson2.setBirthday ( person.getBirthday ( ) );

        testRepo.save ( tmpPerson2 );

        return 1;
    }

    /**
     * DELETE
     *
     * @param id
     * @return
     */
    @Override
    public int deletePerson(String id) {

        testRepo.deleteById ( id );

        return 1;
    }

}
