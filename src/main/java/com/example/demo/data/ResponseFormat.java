package com.example.demo.data;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ResponseFormat {
	
	private int status;
	private String message;
	private long timeStamp;
}
