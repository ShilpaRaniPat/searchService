package com.stackroute.searchservice.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


    public class TopicNotFoundException extends Exception{
        private String message;

        public TopicNotFoundException(String message) {
            super(message);
            this.message = message;
        }

        public TopicNotFoundException() {
        }
    }

