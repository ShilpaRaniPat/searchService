package com.stackroute.searchservice.controller;


import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exceptions.TopicNotFoundException;
import com.stackroute.searchservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController //used to enable @Controller, and  @Responsebody
@RequestMapping(value="api/v1")

public class SearchController  extends ResponseEntityExceptionHandler {


    //A variable of type MuzixService
    SearchService searchService;

    //Autowired constructor
    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }


    //Mehtod to track by name
    @GetMapping("Topic/{topics}")
    public ResponseEntity<?> getByName(@PathVariable String topic) throws TopicNotFoundException {
        return new ResponseEntity<Topic>(searchService.trackByTopicName(topic), HttpStatus.OK);
    }
}
//    @GetMapping("{topics}/*")
//    public ResponseEntity<?> getByQuestion(@PathVariable String topic) throws TopicNotFoundException {
//
//
//
//
//}
