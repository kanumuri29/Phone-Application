package com.phone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phone.modal.PhoneList;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class PhoneServiceController {
	
	@GetMapping("phoneList/{phoneList}")  
    public List<PhoneList> allPhoneNumber(@PathVariable("phoneList") String phoneList) {  
		String alphabates = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		phoneList = phoneList.substring(0,phoneList.length()-1);
		List<PhoneList> list = new ArrayList<>();
		for(int i=0;i<alphabates.length();i++) {
			PhoneList phone = new PhoneList();
			phone.setId(i);
			phone.setName(phoneList+alphabates.charAt(i));
			list.add(phone);
		}
		
         return list;  
          
    }  

}
