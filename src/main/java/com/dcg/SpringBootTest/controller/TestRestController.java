package com.dcg.SpringBootTest.controller;

//   Standard Libraries Imports

//   Third Party Libraries Imports

import com.dcg.SpringBootTest.PersonService;
import lombok.extern.java.Log;
import com.dcg.SpringBootTest.model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//   ns Framework Imports

//   Domain Imports


/**
 * TestRestController.java<br><br>
 * Creation Date 2022-05-02 16:22<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-05-02 16:22<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-05-02 16:22
 */
@Log
@RestController
@RequestMapping( "/demoAPI/1.0/people" )
public class TestRestController {

    @Autowired
    PersonService personSvc;

    @PostMapping ( {""} )
    public ResponseEntity<Void> persistPerson ( @RequestBody Person person ) {

        String personId = personSvc.persistPerson ( person );

        HttpHeaders headers = new HttpHeaders ( );
        headers.add("Location", personId );

        return new ResponseEntity<> ( headers, HttpStatus.CREATED );

    }

    @GetMapping( {"/{personId}"} )
    public ResponseEntity<Person> retrievePerson ( @PathVariable String personId ) {

        Person person = personSvc.retrievePerson ( personId );

        return new ResponseEntity<> ( person, HttpStatus.OK );

    }

    @PutMapping( {"/{personId}"} )
    public ResponseEntity<Void> updatePerson ( @PathVariable String personId, @RequestBody Person person ) {

        int status = personSvc.updatePerson ( personId, person );

        return new ResponseEntity<> ( HttpStatus.NO_CONTENT );

    }

    @DeleteMapping( {"/{personId}"} )
    public ResponseEntity<Void> deletePerson ( @PathVariable String personId ) {

        int status = personSvc.deletePerson ( personId );

        return new ResponseEntity<> ( HttpStatus.NO_CONTENT );

    }

}
