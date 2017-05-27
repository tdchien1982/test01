package app.chien;

import app.chien.object.Shape;
import lombok.Builder;
import lombok.Data;


/**
 * @author tdc
 *
 */
@Builder
public class BuilderExample {
	private transient int transientVar = 10;
	private String name;
	private double score;
	
	private Shape shape;
	
	private String[] tags;
	private int id;
		
	public static class Square extends Shape {
		private final int width, height;
		public Square(int width, int height) {			 
			this.width = width;
			this.height = height;
		}
	}
}
