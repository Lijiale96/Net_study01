package com.sxt.loc;

import java.net.InetSocketAddress;

/*
 * �˿�
 * 1���������
 * 2��2���ֽ� 0-65535 UDP TCP
 * 3��ͬһ��Э��˿ڲ��ܳ�ͻ
 * 4���˿�Խ��Խ��
 * InsetSocketAddress
 * 1��������
 * new InsetSocketAddress(��ַ|�������˿ڣ���
 * 
 * 2������
 * getAddress()
 * getPort() 
 * getHostName()
 * 
 */
public class PortTest {

	public static void main(String[] args) {
		//�����˿�
		InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
		InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",9000);
   System.out.println(socketAddress.getHostName());
   System.out.println(socketAddress.getPort());
   System.out.println(socketAddress.getAddress());
   System.out.println(socketAddress2.getAddress());
   System.out.println(socketAddress2.getPort());
	}

}
