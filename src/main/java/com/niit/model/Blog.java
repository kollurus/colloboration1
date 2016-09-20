package com.niit.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Blog
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int blogid;

	@NotEmpty(message = "title cannot be blank")
	private String blogtitle;
	@NotEmpty(message = "content cannot be blank")
	private String blogcontent;
	@NotEmpty(message = "user name cannot be blank")
	private String blogUserName;

	private Date creationdatetime;

	public int getblogid() {
		return bid;
	}

	public void setblogid(int blogid) {
		this.blogid = blogid;
	}

	public String getblogtitle() {
		return blogtitle;
	}

	public void setBtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}

	public String getblogcontent() {
		return blogcontent;
	}

	public void setBcontent(String blogcontent) {
		this.blogcontent = blogcontent;
	}

	public String getblogUserName() {
		return blogUserName;
	}

	public void setbUserName(String blogUserName) {
		this.blogUserName = blogUserName;
	}

	public Date getCreationdatetime() {
		return creationdatetime;
	}

	public void setCreationdatetime(Date creationdatetime) {
		this.creationdatetime = creationdatetime;
	}


	
}
