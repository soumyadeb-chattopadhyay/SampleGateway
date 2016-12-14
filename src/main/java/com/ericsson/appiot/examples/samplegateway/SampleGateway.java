package com.ericsson.appiot.examples.samplegateway;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import se.sigma.sensation.gateway.sdk.client.SensationClient;

public class SampleGateway {
	private final Logger logger = Logger.getLogger(this.getClass().getName());

	private SamplePlatform platform;
	private SensationClient sensationClient;

	public static void main(String[] args) {
		SampleGateway gateway = new SampleGateway();
		gateway.start();
	}

	private void start() {
		logger.log(Level.INFO, "Sample Gateway starting up.");
		platform = new SamplePlatform();
		sensationClient = new SensationClient(platform);
		sensationClient.start();
		logger.log(Level.INFO, "Sample Gateway started. Type quit to shut down.");
		Scanner scanner = new Scanner(System.in);
		while(!scanner.nextLine().equalsIgnoreCase("quit")) {
		}
		logger.log(Level.INFO, "Sample Gateway shut down.");
		
	}
}
