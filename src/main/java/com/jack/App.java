package com.jack;

import com.jack.netty.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * Hello world!
 * 
 */
public class App {

	private static Logger log = LoggerFactory.getLogger("ServerControlHandler");

	private static Server server;

	public static void main(String[] args) throws Exception {
		if (args != null && args.length != 0 && (args[0].equals("stop"))) {
			int ctrlPort = Integer.parseInt(args[1]);
			Socket s = new Socket("localhost", ctrlPort);
			PrintWriter w = new PrintWriter(s.getOutputStream());
			w.println("stop");
			w.flush();
			w.close();
			s.close();
		} else if (args != null && args.length >=3 && args[0].equals("start")) {
			try {
				int serverPort = Integer.parseInt(args[1]);

				int conrtrolPort = Integer.parseInt(args[2]);
				
				if (args.length > 3) {
					server = new Server(serverPort, conrtrolPort, args[3]);
				} else {
					server = new Server(serverPort, conrtrolPort);
				}
			
				server.run();
			} catch (Exception e) {
				log.error(e.getMessage(), e);
				System.out.println(e.getMessage());
				server.shutdown(-1);
			}
		}
	}

}
