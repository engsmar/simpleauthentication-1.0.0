package io.swagger.api;

import io.swagger.model.InlineResponse200;
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
public class CheckEditApiController implements CheckEditApi {

    private static final Logger log = LoggerFactory.getLogger(CheckEditApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CheckEditApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> checkEdit(@NotNull @ApiParam(value = "user name to check if edit allowed for", required = true) @Valid @RequestParam(value = "user name", required = true) String userName) {
    	
    	InlineResponse200 response = new InlineResponse200();
    	response.setUsername(userName);
    	response.setId(0);
    	
    	if (userName == null) return new ResponseEntity<InlineResponse200>(response, HttpStatus.BAD_REQUEST);
    	if ("".equals(userName)) return new ResponseEntity<InlineResponse200>(response, HttpStatus.BAD_REQUEST);    	
    	
    	if ("test".equals(userName) || "validate".equals(userName)) {
    		response.setId(1);
    		return new ResponseEntity<InlineResponse200>(response, HttpStatus.OK);    
    	}    	

        return new ResponseEntity<InlineResponse200>(response, HttpStatus.BAD_REQUEST);
    }

}
