package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String domain;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return " [sid=" + sid + ", sname=" + sname + ", domain=" + domain + "]";
	}
	
	

}
