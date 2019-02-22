package com.stackroute.searchservice.service;

import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.exceptions.TopicNotFoundException;
import com.stackroute.searchservice.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchServiceImpl implements SearchService {



    //Created a variable of MuzixRepository
    SearchRepository searchRepository;

    //Autowired the constructor
    @Autowired
    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }
    @Override
    public Topic trackByTopicName(String topic)throws TopicNotFoundException {

            if (searchRepository.findByTopicName(topic)==null) {
                throw new TopicNotFoundException("Track with given name is not found");
            }

        return searchRepository.findByTopicName(topic);
    }
    }

