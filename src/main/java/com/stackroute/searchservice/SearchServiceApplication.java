package com.stackroute.searchservice;

import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import com.stackroute.searchservice.domain.Topic;
import com.stackroute.searchservice.repository.SearchRepository;
import org.apache.catalina.authenticator.SingleSignOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SearchServiceApplication implements CommandLineRunner{
	@Autowired
	SearchRepository searchRepository;


	public static void main(String[] args)

	{
		SpringApplication.run(SearchServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		BufferedReader br = null;
		Gson gson = new Gson();

		try {
			br = new BufferedReader(new FileReader(("./Search.json")));
			// convert json string to object
			Topic topic = gson.fromJson(br, Topic.class);
			searchRepository.save(topic);
			System.out.println("Question Name: " + topic.getTopic());
			System.out.println(topic.getQuestions());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}




