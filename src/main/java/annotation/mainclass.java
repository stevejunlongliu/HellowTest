package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import annotation.an.Length;
import annotation.model.pp;

public class mainclass {
	public static void main(String[] args) {
		pp p = new pp();
		p.setA("123456789");
		//pp.class.getField("a");
		for (Field x : pp.class.getDeclaredFields()) {
			for(Annotation an:x.getAnnotations())
			if (an instanceof Length) {
				System.out.println(x.getName()+":length mark!");
			}
		}
	}
}
