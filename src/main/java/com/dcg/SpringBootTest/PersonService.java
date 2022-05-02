package com.dcg.SpringBootTest;

//   Standard Libraries Imports

//   Third Party Libraries Imports

//   ns Framework Imports

//   Domain Imports


import com.dcg.SpringBootTest.model.person.Person;

/**
 * PersonService.java<br><br>
 * Creation Date 2022-05-02 16:37<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-05-02 16:37<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-05-02 16:37
 */
public interface PersonService {

    /**
     * CREATE
     * @param person
     * @return
     */
    String persistPerson ( Person person );

    /**
     * RETRIEVE
     * @return
     */
    Person retrievePerson ( String id );

    /**
     * UPDATE
     * @param person
     * @return
     */
    int updatePerson ( String id, Person person );

    /**
     * DELETE
     * @return
     */
    int deletePerson ( String id );

}
