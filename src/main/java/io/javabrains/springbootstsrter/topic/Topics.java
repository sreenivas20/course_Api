package io.javabrains.springbootstsrter.topic;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Topics {

	private String id;
	private String name;
	private String descrption;
	private String error;
	private String suscess;
	
	public Topics() {
		
	}
	
	public Topics(String id, String name, String descrption,String error,String suscess) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.error = error;
		this.suscess = suscess;
	}
	
	
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public String getSuscess() {
		return suscess;
	}
	public void setSuscess(String suscess) {
		this.error = suscess;
	}
}
