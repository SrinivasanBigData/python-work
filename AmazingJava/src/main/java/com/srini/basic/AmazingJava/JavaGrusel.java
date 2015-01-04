package com.srini.basic.AmazingJava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Grusel {
	String Hello();

	String world();
}

public class JavaGrusel {
	public static void main(String[] args) {
		Grusel g = (Grusel) Proxy.newProxyInstance(
				Grusel.class.getClassLoader(), new Class[] { Grusel.class },
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						return method.getName();
					}
				});
		System.out.println(g.Hello() + " " + g.world() + " !");
	}
}
