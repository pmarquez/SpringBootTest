package com.dcg.SpringBootTest.repository;

//   Standard Libraries Imports

//   Third Party Libraries Imports

import com.dcg.SpringBootTest.model.person.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//   ns Framework Imports

//   Domain Imports


/**
 * TestRepository.java<br><br>
 * Creation Date 2022-05-02 16:33<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 * <PRE>
 * <table width="90%" border="1" cellpadding="3" cellspacing="2">
 * <tr><th colspan="2">   History   </th></tr>
 *
 * <tr>
 * <td width="20%">Version 1.0<br>
 * Version Date: 2022-05-02 16:33<br>
 *
 * @author pmarquezh </td>
 * <td width="80%"><p>Creation</p></td>
 * </tr>
 * </table>
 * </PRE>
 * @author pmarquezh
 * @version 1.0 - 2022-05-02 16:33
 */
@Repository
public interface TestRepository extends CrudRepository<Person, String> {
}
