package proxytest;

public class mainclass {
	public static void main(String[] args) {
		Person p = new LiuDeHuaProxy().getProxy();
		p.sing("冰雨");
	}
}
