package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-05T11:16:32.747Z[GMT]")
@Controller
public class AuthenticateApiController implements AuthenticateApi {

    private static final Logger log = LoggerFactory.getLogger(AuthenticateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthenticateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> authenticate(@NotNull @ApiParam(value = "user name", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "passwrod", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
    	
    	if (username == null) return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
    	if ("".equals(username)) return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
    	
    	if (password == null) return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
    	if ("".equals(password)) return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);    	
    	
    	if ("test".equals(username) || "validate".equals(username)) {
    		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);	
    	}
    	
        return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
    }

}
