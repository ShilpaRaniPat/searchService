package com.stackroute.searchservice.service;

import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exceptions.TopicNotFoundException;

import java.util.List;

public interface SearchService {
    public Topic trackByTopicName(String topic)throws TopicNotFoundException;
}
