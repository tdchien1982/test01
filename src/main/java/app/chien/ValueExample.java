package app.chien;

import app.chien.object.Shape;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;


/**
 * @author tdc
 *
 */
@Value(staticConstructor="of")
public class ValueExample {
	private transient int transientVar = 10;
	private String name;
	private double score;
	
	private Shape shape;
	
	private String[] tags;
	private int id;
	
	@Value(staticConstructor="of")
	public static class Square extends Shape {
		private final int width, height;
		public Square(int width, int height) {			 
			this.width = width;
			this.height = height;
		}
	}
}
