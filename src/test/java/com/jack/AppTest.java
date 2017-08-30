package com.jack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	private static Logger logger = LoggerFactory.getLogger(AppTest.class);
	
	private CountDownLatch cdl = new CountDownLatch(1);
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * @throws InterruptedException 
	 */
	public void testApp() throws InterruptedException {
//		System.out.println("web service start");
//		HellowWordController implementor = new HellowWordController();
//		String address = "http://localhost:8080/helloWorld";
//		Endpoint.publish(address, implementor);
//		System.out.println("web service started");
//		cdl.await();
//		assertTrue(true);
		
		System.out.println(getAddress().toString());
		
		String ips = "";
		for(String item : getAddress() ){
			ips += item + "</br>";
		}
		System.out.println(ips);
		ips = ips.substring(0, ips.lastIndexOf("</"));
		System.out.println(ips);
	}
	
	private List<String> getAddress() {
		List<String> res = new ArrayList<String>();
        try {
            for (Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces(); interfaces.hasMoreElements();) {
                NetworkInterface networkInterface = interfaces.nextElement();
                if (networkInterface.isLoopback() || networkInterface.isVirtual() || !networkInterface.isUp()) {
                    continue;
                }
                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                
                if (addresses.hasMoreElements()) {
                	InetAddress ip ;
                	while (addresses.hasMoreElements()) {
						ip = (InetAddress) addresses.nextElement();
						if (!ip.isSiteLocalAddress()) {
		                    continue;
		                }
						if (ip.getHostAddress().indexOf(":") == -1) {
							res.add(ip.getHostAddress() + ":8080");
						}
					}
                }
            }
        } catch (SocketException e) {
            logger.debug("Error when getting host ip address: <{}>.", e.getMessage());
        }
        return res;
    }
}
