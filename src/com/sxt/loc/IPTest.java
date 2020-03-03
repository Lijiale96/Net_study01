package com.sxt.loc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * IP:定位一个节点：计算机、路由器
 * InetAddress:多个静态方法
 * 1、getLocalHost:本机
 * 2、getByname：根据域名DNS| IP地址——>IP
 * 
 * 两个成员方法
 * 1、getHostAddress：返回地址
 * 2、getHostName：返回计算机名
 * 
 */
public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		// 使用getLocalHost方法创建InetAddress对象 本机
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());

		// 根据域名得到InetAddress对象 本机
			addr = InetAddress.getByName("www.ccdc.neu.edu.cn.com");
			System.out.println(addr.getHostAddress());
			System.out.println(addr.getHostName());
		
			// 根据IP得到InetAddress对象 本机
		addr = InetAddress.getByName("123.56.138.176");
		System.out.println(addr.getHostAddress());
	    System.out.println(addr.getHostName());
	 		
			
	}

}
