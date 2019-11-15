package com.exam.controller;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class LogTest {
	static Logger log = LogManager.getLogger();
	public static void main(String[] args) {
		log.info("Go -----------------------");
	}

}
