package com.sai.ratingservice.services.Exception;

public class ResourceNotFoundExcepiton extends RuntimeException{
	public ResourceNotFoundExcepiton() {
		super("Resource was not found");
	}
	public ResourceNotFoundExcepiton(String message) {
		super(message);
	}
}
