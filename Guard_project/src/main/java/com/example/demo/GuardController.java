package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardController {

	@Autowired
	Guardservice gs;
	@Autowired
	contactservice cs;
	
	@RequestMapping("/index")
	public String one(HttpSession s1) {
		String x =(String) s1.getAttribute("temp");
		if(x!=null) {
		return "index";
		}
		return "index";
	}
	@RequestMapping("/about")
	public String two() {
		return "about";
		
	}
	@RequestMapping("/guard")
	public String three() {
		return "guard";
		
	}
	@RequestMapping("/contact")
	public String four() {
		return "contact";
	}
	@RequestMapping("/service")
	public String five() {
		return "service";
	}
	@RequestMapping("/register")
	public String six() {
		return "register";
	}
	@RequestMapping("/login")
	public String eight() {
		return "login";
	}
	@RequestMapping("/registerdata")
	public String nine(@ModelAttribute("g1") Guard g1) {
		if(g1.getGpass().equals(g1.getGcpass())) {
		gs.registerdata(g1);
		return "redirect:/login";
		}
		return "index";
	}
	
	
	@PostMapping("/logindata")
	public String eleven(@RequestParam("t1") String t1,@RequestParam("t2") String t2,HttpSession s1) {
		Guard gd = gs.checkdata(t1, t2);
		if(gd==null) {
			return "redirect:/login";
		}
		s1.setAttribute("temp", gd.getGname());
		return "redirect:/index";
		
	}
	@RequestMapping("/logout")
	public String twelve(HttpSession s1) {
		s1.invalidate();
		return "redirect:/index";
		
	}
	
	@PostMapping("/send")
	public String thirteen(@ModelAttribute("c1") Contact c1) {
	cs.senddata(c1);
		return "redirect:/message_sent";
		
	}
	
	
	@RequestMapping("/message_sent")
	public String fourteen() {	
		return "message_sent";
	
	}
	
}
