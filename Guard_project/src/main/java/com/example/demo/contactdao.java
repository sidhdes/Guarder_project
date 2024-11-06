package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class contactdao implements contactservice {
@Autowired
contactrepo cr;
	
	
	@Override
	public void senddata(Contact c1) {
		
	cr.save(c1);	
	}

}
