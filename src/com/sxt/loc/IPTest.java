package com.sxt.loc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * IP:��λһ���ڵ㣺�������·����
 * InetAddress:�����̬����
 * 1��getLocalHost:����
 * 2��getByname����������DNS| IP��ַ����>IP
 * 
 * ������Ա����
 * 1��getHostAddress�����ص�ַ
 * 2��getHostName�����ؼ������
 * 
 */
public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		// ʹ��getLocalHost��������InetAddress���� ����
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());

		// ���������õ�InetAddress���� ����
			addr = InetAddress.getByName("www.ccdc.neu.edu.cn.com");
			System.out.println(addr.getHostAddress());
			System.out.println(addr.getHostName());
		
			// ����IP�õ�InetAddress���� ����
		addr = InetAddress.getByName("123.56.138.176");
		System.out.println(addr.getHostAddress());
	    System.out.println(addr.getHostName());
	 		
			
	}

}
