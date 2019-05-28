/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Student;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-28T05:54:47.821Z[GMT]")
@Api(value = "stock", description = "the stock API")
public interface StockApi {

    @ApiOperation(value = "Get stock price for specific quote", nickname = "getStock", notes = "", response = Student.class, responseContainer = "List", tags={ "stock", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned", response = Student.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Id doesnot exist") })
    @RequestMapping(value = "/stock/{quoteId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> getStock(@ApiParam(value = "ID of the quote to return",required=true) @PathVariable("quoteId") Long quoteId);


    @ApiOperation(value = "Get stock price for all the quote", nickname = "getStocks", notes = "", tags={ "stock", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Student.class, responseContainer = "List") })
    @RequestMapping(value = "/stock",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getStocks();


    @ApiOperation(value = "Update stock price for a quote", nickname = "postStock", notes = "", tags={ "stock", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updates Succssfully"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/stock",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postStock(@ApiParam(value = "Student to add"  )  @Valid @RequestBody Student body);

}
