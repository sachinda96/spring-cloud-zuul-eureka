package service1.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/test")
@RestController
@CrossOrigin
public class TestController {

    @GetMapping
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("service 1 is working", HttpStatus.OK);
    }

}
