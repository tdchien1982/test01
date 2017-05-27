package app.chien;

import app.chien.object.Shape;
import lombok.Data;
import lombok.NonNull;


/**
 * @author tdc
 *
 */
@Data
public class DataExample {
	private transient int transientVar = 10;
	private String name;
	private double score;
	private Shape shape = new Square(5, 10);
	
	private String[] tags;
	private int id;
		
	public static class Square extends Shape {
		private final int width, height;
		public Square(int width, int height) {			 
			this.width = width;
			this.height = height;
		}
	}
	
	public void test(@NonNull String a) {
		System.out.println("Test 01");
		System.out.println("Test 02");
	}
}
