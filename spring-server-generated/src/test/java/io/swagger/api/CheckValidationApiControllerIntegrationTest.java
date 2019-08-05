package io.swagger.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.model.InlineResponse200;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CheckValidationApiControllerIntegrationTest {

    @Autowired
    private CheckValidationApi api;

    @Test
    public void checkValidationTest() throws Exception {
        String userName = "test";
        ResponseEntity<InlineResponse200> responseEntity = api.checkValidation(userName);
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }
    
    @Test
    public void checkValidationValidate() throws Exception {
        String userName = "validate";
        ResponseEntity<InlineResponse200> responseEntity = api.checkValidation(userName);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
    
    @Test
    public void checkValidationError() throws Exception {
        String userName = "validate1";
        ResponseEntity<InlineResponse200> responseEntity = api.checkValidation(userName);
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    } 

}
