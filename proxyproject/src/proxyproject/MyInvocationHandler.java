package proxyproject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	Object target;
	
	public MyInvocationHandler(Object object){
		target = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyInvocationHandler invoke begin\n");
		Object invoke = method.invoke(target, args);
		System.out.println("MyInvocationHandler invoke end\n");
		return invoke;
	}
}