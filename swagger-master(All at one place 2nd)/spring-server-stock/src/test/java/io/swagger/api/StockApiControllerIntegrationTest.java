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
public class StockApiControllerIntegrationTest {

    @Autowired
    private StockApi api;

    @Test
    public void getStockTest() throws Exception {
        Long quoteId = 789L;
        ResponseEntity<List<Student>> responseEntity = api.getStock(quoteId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getStocksTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.getStocks();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void postStockTest() throws Exception {
        Student body = new Student();
        ResponseEntity<Void> responseEntity = api.postStock(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
