package com.kafka.demo.Controller;

import com.kafka.demo.Domain.LibraryEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LibraryEventController {


    @PostMapping("/v1/libraryEvent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent){

    return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);

    }
}
