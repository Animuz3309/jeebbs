package edu.scut.jeebbs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.util.HashSet;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CustomController {

    @RequestMapping(value = "/custom", method = GET)
    public String custom() {
//        throw new IllegalArgumentException();
        throw new ConstraintViolationException("test", new HashSet<>());
//        return "custom";
    }
}
