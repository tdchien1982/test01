package app.chien;

import lombok.NonNull;

public class NonNullExample {
	
	public NonNullExample() {
		this.func1(10l);
		this.func1(20l);
		
		try {
			this.func1(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.func2(null, 12l);
		try {
			this.func2(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void func1(@NonNull Long t) {
		System.out.println("\n\n");
		System.out.println("func1, step 1 ");
		System.out.println("func1, step 2 ");
		System.out.println("t == " + t);
	}
	
	public void func2(Long t, @NonNull Long t2) {
		System.out.println("t == " + t);
		System.out.println("t2 == " + t2);
		System.out.println("func1, step 1 ");
		System.out.println("func1, step 2 ");
		
	}

}
