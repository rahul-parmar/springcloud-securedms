package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;



@Document(collection="toll")
public class TollUsage {
	
	@Id
	private String id;
	
	private String stationId;
	
	private String licensePlate;
	
	private String timeStamp;
	
	
	public TollUsage() {
		// TODO Auto-generated constructor stub
	}


	public TollUsage(String id, String stationId, String licensePlate, String timeStamp) {
		this.id = id;
		this.stationId = stationId;
		this.licensePlate = licensePlate;
		this.timeStamp = timeStamp;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty(required=true)
	
	public String getStationId() {
		return stationId;
	}


	public void setStationId(String stationId) {
		this.stationId = stationId;
	}


	@JsonProperty(required=true)
	
	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	@JsonProperty(required=true)
	
	public String getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
	
	
	

}
