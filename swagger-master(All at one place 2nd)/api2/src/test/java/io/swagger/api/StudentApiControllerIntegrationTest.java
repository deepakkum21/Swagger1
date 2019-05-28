package io.swagger.api;

import io.swagger.model.Student;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApiControllerIntegrationTest {

    @Autowired
    private StudentApi api;

    @Test
    public void addStudentTest() throws Exception {
        Student body = new Student();
        ResponseEntity<Void> responseEntity = api.addStudent(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteStudentTest() throws Exception {
        String searchString = "searchString_example";
        ResponseEntity<Void> responseEntity = api.deleteStudent(searchString);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchStudentTest() throws Exception {
        String searchString = "searchString_example";
        ResponseEntity<List<Student>> responseEntity = api.searchStudent(searchString);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateStudentTest() throws Exception {
        Student body = new Student();
        String searchString = "searchString_example";
        ResponseEntity<Void> responseEntity = api.updateStudent(body, searchString);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
