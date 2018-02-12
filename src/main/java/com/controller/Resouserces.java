package com.controller;

import org.apache.ignite.Ignite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by debasish paul on 15-11-2017.
 */
@Controller
public class Resouserces {
    @Autowired
    Ignite ignite;

    @GetMapping(name = "/",produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity getAll() {
        return new ResponseEntity("hello", HttpStatus.OK);
    }

}
