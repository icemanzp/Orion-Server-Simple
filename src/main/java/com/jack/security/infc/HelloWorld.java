/**
 * @Probject Name: netty-jack-test
 * @Path: com.jack.controllerHelloWorld.java
 * @Create By Jack
 * @Create In 2015年9月16日 上午11:39:18
 * TODO
 */
package com.jack.security.infc;

import javax.jws.WebService;

/**
 * @Class Name HelloWorld
 * @Author Jack
 * @Create In 2015年9月16日
 */
@WebService
public interface HelloWorld {
	public String sayHi(String text);
}
