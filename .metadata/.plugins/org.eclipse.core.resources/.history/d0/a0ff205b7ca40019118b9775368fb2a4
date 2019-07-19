package proxyproject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式
 * @author Administrator
 *
 */
public class Main {
	
	public static void main(String[] args) {
		dynamicProcy();
	}
	
	public static void dynamicProcy(){
//		ProxySb subject = new ProxySb();
		RealSubject realSbject = new RealSubject();
		// 动态代理
		MyInvocationHandler invocationHandler = new MyInvocationHandler(realSbject);
		
		Subject newProxyInstance = (Subject) Proxy.newProxyInstance(
				Thread.currentThread().getContextClassLoader()  //loader
				, realSbject.getClass().getInterfaces() //接口数组
				, invocationHandler); // 代理要实现的操作
		
		newProxyInstance.request();
	} 
	
	public static void staticProcy(){
		
	}
	

}
