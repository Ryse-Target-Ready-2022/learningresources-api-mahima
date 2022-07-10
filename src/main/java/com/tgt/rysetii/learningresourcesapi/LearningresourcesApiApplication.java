package com.tgt.rysetii.learningresourcesapi;

import com.tgt.rysetii.learningresourcesapi.entity.LearningResource;
import com.tgt.rysetii.learningresourcesapi.service.LearningResourceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

import static java.util.Collections.unmodifiableList;

@SpringBootApplication
public class LearningresourcesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningresourcesApiApplication.class, args);



	}
}
