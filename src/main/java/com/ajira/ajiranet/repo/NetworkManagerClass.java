package com.ajira.ajiranet.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;

import com.ajira.ajiranet.entity.Device;

@Repository
public class NetworkManagerClass {
	
	private static List<Device> deviceList=new ArrayList<>();
	static {
		
		deviceList.add(new Device("s1","COMPUTER",1));
	}

	public void createDevice(Device device) {
		if(Objects.nonNull(device)) {
			deviceList.add(device);
		}
	}

	public List<Device> fetchDevices() {
		// TODO Auto-generated method stub
		return deviceList;
	}
	
	
	
	

}