package com.supremepole.knife4jspringboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@Api(tags = "你好")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @ApiOperation(value = "问好")
    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi(@RequestParam("name")String name){
        return ResponseEntity.ok("Hi:"+name);
    }
}
