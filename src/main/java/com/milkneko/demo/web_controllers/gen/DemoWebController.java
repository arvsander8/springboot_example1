package com.milkneko.demo.web_controllers.gen;

import com.milkneko.demo.interchange_beans.gen.DataInterchangeObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("proxy-auth")
public class DemoWebController {

    @GetMapping
    public ResponseEntity<?> getData(){
        return new ResponseEntity<>(new DataInterchangeObject("id", "name", "data"), HttpStatus.OK);
    }

}
