package com.sky.detector;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class AppFixture {

	public String parseLine(String logLine) {
		return "Hello world !";
	}
}
