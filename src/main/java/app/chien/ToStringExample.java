package app.chien;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper=true,includeFieldNames=false,doNotUseGetters=false)
public class ToStringExample {
	private static final int STATIC_VAR = 10;
	@Setter @Getter
	private String name;
	@Setter @Getter
	private String clear;
	@Setter @Getter
	private String description;
	@Setter @Getter
	private Long number;
	@Setter @Getter
	private Square sq;
	
	@ToString(includeFieldNames=false)
	public static class Square {
		@Getter
		private final int width, height;
		public Square(int width, int height) {
			this.width = width;
			this.height = height;
		}
	}
}
