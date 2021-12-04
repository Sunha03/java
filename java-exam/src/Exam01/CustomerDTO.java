package Exam01;

import java.sql.*;

public class CustomerDTO {
	private String id;
	private String pass;
	private String name;
	private Date regdate;
	private int point;
	private String addr;
	
	public CustomerDTO() {
		
	}
	
	public CustomerDTO(String id, String pass, String name, String addr) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
