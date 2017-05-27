package app.chien;

import com.sun.istack.internal.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class TestBean {
	@Setter @Getter
	private int a;
	private String b;
	
	private Long c;
	
	
	public TestBean() {
		
	}
		
	
}
