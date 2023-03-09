package com.javaexpress.docker.docker.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/docker")
public class Dockerhelloworld {
	@GetMapping
	public String getName() {
		return "Dockering the spring boot application";
		}
	}
