package io.swagger.api;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthenticateApiControllerIntegrationTest {

    @Autowired
    private AuthenticateApi api;

    @Test
    public void authenticateNoUserNameTest() throws Exception {
        String username = "";
        String password = "password_example";
        ResponseEntity<Void> responseEntity = api.authenticate(username, password);
        assertEquals(HttpStatus.UNAUTHORIZED, responseEntity.getStatusCode());
    }
    
    @Test
    public void authenticateNoPasswordTest() throws Exception {
        String username = "userame_example";
        String password = "";
        ResponseEntity<Void> responseEntity = api.authenticate(username, password);
        assertEquals(HttpStatus.UNAUTHORIZED, responseEntity.getStatusCode());
    }    
        
    @Test
    public void authenticateTest() throws Exception {
        String username = "test";
        String password = "password";
        ResponseEntity<Void> responseEntity = api.authenticate(username, password);
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
    }   
    
    @Test
    public void authenticateValidate() throws Exception {
        String username = "validate";
        String password = "password";
        ResponseEntity<Void> responseEntity = api.authenticate(username, password);
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
    }    

}
