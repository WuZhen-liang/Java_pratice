package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost);
		System.out.println(localHost.getHostAddress());//ip
		System.out.println(localHost.getHostName());
		
		InetAddress google = InetAddress.getByName("www.google.com");
		System.out.println(google.getHostAddress());
		System.out.println(google.getHostName());
		
	}

}
