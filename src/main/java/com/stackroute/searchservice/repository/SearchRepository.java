package com.stackroute.searchservice.repository;

import com.stackroute.searchservice.domain.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SearchRepository extends MongoRepository<Topic,String>{
    public Topic findByTopicName(String topicName);

}
