package com.parking.exceptions;

import java.time.LocalDateTime;

public class StandardError {
	
	private LocalDateTime date;
	private Integer status;
	private String error;
	private String message;
	
	public StandardError() {
		
	}
	

	public StandardError(LocalDateTime date, Integer status, String error, String message) {
		super();
		this.date = date;
		this.status = status;
		this.error = error;
		this.message = message;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
