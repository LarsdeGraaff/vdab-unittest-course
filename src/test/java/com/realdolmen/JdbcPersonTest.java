package com.realdolmen;


import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;


public class JdbcPersonTest {
@Before
    public void initializeDataSets() throws Exception{
//    1. create DBUnit ocnnection

    Connection jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
//            2. datasat "people.xml" lade

    IDataSet peopleDataSet = new FlatXmlDataSetBuilder().build(new File("people.xml"));
//            3. execute clean insert
    DatabaseOperation.CLEAN_INSERT.execute(connection, peopleDataSet);
//            4. prepare fixture


}
    @Test

    public void testPersonCanBeFoundByFirsName() throws Exception{
        PersonRepository repository= new JdbcPersonRepository();

        Person person=repository.find(1);
        assertEquals("Jimi", person.getFirstName());


        Person person2=repository.find(2);
        assertEquals("Janis", person2.getFirstName());

    }
    @Test
    public void testByLastName() throws Exception{
        PersonRepository repository= new JdbcPersonRepository();
        Person person=repository.find(1);
        assertEquals("Hendrix", person.getLastName());
    }

    @Test
    public void testByCity() throws Exception{
        PersonRepository repository= new JdbcPersonRepository();
        Person person=repository.find(1);
        assertEquals("Leuven", person.getAddress().getCity().getName());
    }

    @Test
    public void testByBirthday() throws  Exception{
        PersonRepository repository= new JdbcPersonRepository();
        Person person=repository.find(1);

        Calendar c = Calendar.getInstance();
        c.setTime(person.getBirthDate());

        assertEquals(1963, c.get(Calendar.YEAR));
    }

    @Test
    public void testFoundById() throws Exception {
        PersonRepository repository= new JdbcPersonRepository();
        Person person=repository.find(100);

    }
}

