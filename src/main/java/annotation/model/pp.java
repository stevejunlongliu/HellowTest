package annotation.model;

import annotation.an.Length;

public class pp {
	@Length(minlength = 0, maxlength = 5)
	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

}
