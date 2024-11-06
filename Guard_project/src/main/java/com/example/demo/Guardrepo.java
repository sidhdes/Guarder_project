package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Guardrepo extends JpaRepository<Guard,Integer> {

	public Guard findByGemailAndGpass(String t1,String t2); 
}
