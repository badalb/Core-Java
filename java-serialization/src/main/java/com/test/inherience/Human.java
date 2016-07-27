package com.test.inherience;

import java.io.Serializable;

public class Human implements Serializable {

	 private static final long serialVersionUID = 1L;

	 String gender;
	 String color;

	 Human(String gender, String color) {
	  this.gender = gender;
	  this.color = color;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public String getColor() {
	  return color;
	 }

	 public void setColor(String color) {
	  this.color = color;
	 }

	}