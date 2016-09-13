package proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LiuDeHuaProxy {
	private LiuDeHua ldh = new LiuDeHua();

	public Person getProxy() {
		// return (Person) Proxy.getProxyClass(ldh.getClass().getClassLoader(),
		// ldh.getClass().getInterfaces());
		return (Person) Proxy.newProxyInstance(LiuDeHuaProxy.class.getClassLoader(), ldh.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println(method.getName() + "before！");
				Object value = method.invoke(ldh, args);
				System.out.println(method.getName() + "finish！");
				return value;
				// if (method.getName().equals("sing")) {
				// System.out.println("我是他的经纪人，要找他唱歌得先给十万块钱！！");
				// // 已经给钱了，经纪人自己不会唱歌，就只能找刘德华去唱歌！
				// return method.invoke(ldh, args); //
				// 代理对象调用真实目标对象的sing方法去处理用户请求
				// }
				// // 如果调用的是代理对象的dance方法
				// if (method.getName().equals("dance")) {
				// System.out.println("我是他的经纪人，要找他跳舞得先给二十万块钱！！");
				// // 已经给钱了，经纪人自己不会唱歌，就只能找刘德华去跳舞！
				// return method.invoke(ldh, args);//
				// 代理对象调用真实目标对象的dance方法去处理用户请求
				// }
				//
				// return null;
			}
		});
	}
}
