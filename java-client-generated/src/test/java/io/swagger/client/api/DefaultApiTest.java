/*
 * SimpleAuthentication
 * SimpleAuthentication
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@corporate-action.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Authenticates, via username and password
     *
     * Authenticates, via username and password
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateTest() throws ApiException {
        String username = "test";
        String password = "password";
        api.authenticate(username, password);
    }
    
    @Test
    public void authenticateValidate() throws ApiException {
        String username = "test";
        String password = "password";
        api.authenticate(username, password);
    }
    
    /**
     * Checks if user able to edit
     *
     * Returns 1 if user can edit, else 0 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkEditTest() throws ApiException {
        String userName = "test";
        InlineResponse200 response = api.checkEdit(userName);
        assertTrue(response.getId().equals(1));
    }

    @Test
    public void checkEditValidate() throws ApiException {
        String userName = "validate";
        InlineResponse200 response = api.checkEdit(userName);
        assertTrue(response.getId().equals(1));
    }    
    
    
    /**
     * Checks if user able to validatte
     *
     * Returns 1 if user can validate, else 0 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkValidationTest() throws ApiException {
        String userName = "validate";
        InlineResponse200 response = api.checkValidation(userName);
        assertTrue(response.getId().equals(1));
    }
}
