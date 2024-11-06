package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;

	private String cname;
	private String cemail;
	private String ccity;
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	private String cmsg;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	
	public String getCmsg() {
		return cmsg;
	}
	public void setCmsg(String cmsg) {
		this.cmsg = cmsg;
	}
	
	
}
