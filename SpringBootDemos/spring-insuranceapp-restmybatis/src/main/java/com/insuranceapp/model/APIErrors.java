package com.insuranceapp.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class APIErrors {
	
	//private String message;
	private LocalDateTime timeStamp;
	private int statusCode;
	private String error;
	private HttpStatus  status;
	
	public APIErrors() {
		super();
	}
	public APIErrors(LocalDateTime timeStamp, int statusCode, String error, HttpStatus status) {
		super();
		this.timeStamp = timeStamp;
		this.statusCode = statusCode;
		this.error = error;
		this.status = status;
	}
	public LocalDateTime getLocalDateTime() {
		return timeStamp;
	}
	public void setLocalDateTime(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "APIErrors [timeStamp=" + timeStamp + ", statusCode=" + statusCode + ", error=" + error
				+ ", status=" + status + "]";
	}
	
	
	

}
