package com.sxt.loc;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL:ͳһ��Դ��λ���������������ʯ֮һ��html http����������Դ
 * 1��Э��
 * 2�������������
 * 3���˿ڣ�Ĭ��80
 * 4��������Դ
 * http://www.baidu.com:80/index.html?uname=shsxt&age=18#a
 */
public class URLTest01 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
      URL url = new URL(" http://www.baidu.com:80/index.html?uname=shsxt&age=18#a");
      //��ȡ�ĸ�ֵ
      System.out.println("Э�飺"+url.getProtocol());
      System.out.println("����|ip:"+url.getHost());
      System.out.println("�˿�"+url.getPort());
      System.out.println("������Դ1:"+url.getFile());
      System.out.println("������Դ2:"+url.getPath());
     
      //����
      System.out.println("����"+url.getQuery());
      //ê��
      System.out.println("ê��"+url.getRef());
      
	}
}