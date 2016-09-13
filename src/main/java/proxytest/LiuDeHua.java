package proxytest;

//刘德华本人
public class LiuDeHua implements Person {
	public String sing(String singName) {
		System.out.println("刘德华唱了一首：" + singName);
		return singName;
	}

	public String dance(String danceName) {
		System.out.println("刘德华跳舞：" + danceName);
		return danceName;
	}

}
