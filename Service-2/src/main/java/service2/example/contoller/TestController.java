package service2.example.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "test")
public class TestController {

    @GetMapping
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("Service 2 is working", HttpStatus.OK);
    }
}
