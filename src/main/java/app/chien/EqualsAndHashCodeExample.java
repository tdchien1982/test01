package app.chien;

import app.chien.object.Shape;
import lombok.EqualsAndHashCode;


/**
 * Auto generated the following functions
 * 		equals(Object o)
 * 		hashCode()
 * 
 * @author tdc
 *
 */
@EqualsAndHashCode
public class EqualsAndHashCodeExample {
	private transient int transientVar = 10;
	private String name;
	private double score;
	private Shape shape = new Square(5, 10);
	
	private String[] tags;
	private int id;
	
	@EqualsAndHashCode(callSuper=true)
	public static class Square extends Shape {
		private final int width, height;
		public Square(int width, int height) {			 
			this.width = width;
			this.height = height;
		}
	}
}
