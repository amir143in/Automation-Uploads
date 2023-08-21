package com.test;


import com.intuit.karate.junit5.Karate;



public class TestRunner {


	@Karate.Test
	public Karate testSample2() {
		System.setProperty("karate.env", "qa");
		return Karate.run("classpath:com/test/");
	}

}
