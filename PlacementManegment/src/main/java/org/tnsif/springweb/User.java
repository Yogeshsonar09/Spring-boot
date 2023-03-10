package org.tnsif.springweb;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="user")

public class User {
	
	@Id
	private Integer id;
	private String name;
	private String password;
	
	//default constructor
		
		public User() {
		super();
		// TODO Auto-generated constructor stub
		}
		
		//parameterized constructor
		public User(Integer id, String name,String password) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Admin [id=" + id + ", name=" + name + ", password=" + password+ "]";
		}

}