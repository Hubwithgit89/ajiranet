package com.ajira.ajiranet.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajira.ajiranet.entity.Device;
import com.ajira.ajiranet.repo.NetworkManagerClass;

@Service
public class AjiraNetService {

	@Autowired
	NetworkManagerClass networkManagerClass;
	
	public void createDevice(HashMap<String, Object> dataMap) {
		// TODO Auto-generated method stub
		Device device;
		if("COMPUTER".equalsIgnoreCase((String) dataMap.get("type"))){
			device=new Device(String.valueOf(dataMap.get("name")),"COMPUTER",1);
			networkManagerClass.createDevice(device);
			
		}
		
	}

	public List<Device> fetchDevices() {
		// TODO Auto-generated method stub
		return networkManagerClass.fetchDevices();
	}
	
	
	

}
