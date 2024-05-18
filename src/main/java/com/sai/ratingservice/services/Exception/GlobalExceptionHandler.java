package com.sai.ratingservice.services.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundExcepiton.class)
	public ResponseEntity<?> resourcenotfoundException(Exception e){
		Map<String,Object> mp = new HashMap<>();
		mp.put("statuscode", 400);
		mp.put("message", e.getMessage());
		mp.put("apicall", "success");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mp);
	}
}
