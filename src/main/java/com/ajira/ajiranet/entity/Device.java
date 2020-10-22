package com.ajira.ajiranet.entity;




public class Device {
	
	
	private String name;
	
	private String type;
	
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeviceType() {
		return type;
	}

	public void setDeviceType(String deviceType) {
		this.type = deviceType;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Device(String name, String deviceType, int weight) {
		super();
		this.name = name;
		this.type = deviceType;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Device [name=" + name + ", type=" + type + ", weight=" + weight + "]";
	}
	

}
