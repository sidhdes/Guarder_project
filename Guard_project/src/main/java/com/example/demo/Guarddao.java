package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Guarddao implements Guardservice {
@Autowired
	Guardrepo gr; 
	@Override
	public void registerdata(Guard g1) {
		// TODO Auto-generated method stub
gr.save(g1);
	}
	@Override
	public Guard checkdata(String t1, String t2) {
		// TODO Auto-generated method stub
		return gr.findByGemailAndGpass(t1, t2);
	}

}
