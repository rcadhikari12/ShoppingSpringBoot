package com.shopping.webapp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.shopping.webapp.service.AmazonClient;

@RestController
@CrossOrigin
public class BucketController 
{
	private AmazonClient amazonClient;

	@Autowired
	BucketController(AmazonClient amazonClient) {
		this.amazonClient = amazonClient;
	}

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestPart(value = "file") MultipartFile file) throws IOException {
		return this.amazonClient.uploadFile(file);
	}
    
}
