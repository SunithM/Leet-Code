package com.suni.interview;

import java.net.InetAddress;

public class IpToHostName {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("195.201.10.8");

			System.out.println("Host Name: " + ip.getHostName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
