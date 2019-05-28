package com.deepak.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/hello")
// to update the description the class of the controller
@Api(value="HelloWorld Resource", description="shows hello world end point rest api")
public class HelloResource {

	// to update the description of rest api (methods)
	@ApiOperation(value = "returns Hello Swagger")
	// to give the message of the custom or predefined status codes
	@ApiResponses(value = { @ApiResponse(code = 100, message = "message for response code 100"),
			@ApiResponse(code = 200, message = "Success message for response code 200") })
	@GetMapping
	public String hello() {
		return "Hello Swagger";
	}

	@ApiOperation(value = "add custom name to Hello")
	@PostMapping("/user")
	public String helloUser(@RequestBody String name) {
		return name + "hello";
	}

	@ApiOperation(value = "updates custom name to Hello Swagger")
	@PutMapping("/put")
	public String putHello(@RequestBody String name) {
		return name + "hello" + "updated";
	}
}
