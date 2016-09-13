package counttest;
public class bitcounttest {
	public static void main(String[] args) {
		int v0 = 2 << -1;
		int v1 = 2 << 0;
		int v2 = 2 << 1;
		int v3 = 2 << 2;
		System.out.println("v0:" + v0);
		System.out.println("v1:" + v1);
		System.out.println("v2:" + v2);
		System.out.println("v3:" + v3);

		double d1 = Math.pow(2, 0);
		System.out.println(d1);
		double d2 = Math.pow(2, 1);
		System.out.println(d2);
		double d3 = Math.pow(2, 2);
		System.out.println(d3);
		double d4 = Math.pow(2, 3);
		System.out.println(d4);
		System.out.println("---");
		System.out.println(1 << -1);
		System.out.println(1 << 0);
		System.out.println(1 << 1);
		System.out.println(1 << 2);
		long longdefalut = 0;
		System.out.println(longdefalut);
	}
}
