package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guard {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int gid;
	private String gname;
	private String gemail;
	private String gpass;
	public String getGpass() {
		return gpass;
	}
	public void setGpass(String gpass) {
		this.gpass = gpass;
	}
	private String gcpass;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGemail() {
		return gemail;
	}
	public void setGemail(String gemail) {
		this.gemail = gemail;
	}
	
	public String getGcpass() {
		return gcpass;
	}
	public void setGcpass(String gcpass) {
		this.gcpass = gcpass;
	}
	
}
