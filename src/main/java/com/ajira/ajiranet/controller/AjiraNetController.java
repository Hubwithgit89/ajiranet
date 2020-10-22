package com.ajira.ajiranet.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajira.ajiranet.entity.Device;
import com.ajira.ajiranet.service.AjiraNetService;

@RestController
public class AjiraNetController {
	
	
	@Autowired
	AjiraNetService ajiraNetService;
	
	@PostMapping(path="/ajiranet/process/{commanType}/{command}")  
	public Object processMethod(@PathVariable String commanType,
			@PathVariable String command,@RequestBody (required=false) HashMap<String,Object> dataMap)  
	{
		
		if(commanType.equalsIgnoreCase("CREATE") && 
				command.equalsIgnoreCase("DEVICES")) {
			ajiraNetService.createDevice(dataMap);
		}else if(commanType.equalsIgnoreCase("FETCH") ) {
			List<Device> deviceList= ajiraNetService.fetchDevices();
			return deviceList;
		}
		
		
		
		
		
		
		
		return command;  
		
		
		
	
	}   

}
