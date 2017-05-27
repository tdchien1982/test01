package app.chien;

import lombok.Synchronized;

public class SynchronizedExample {
	private final Object readLock = new Object();
	
	@Synchronized
	public static void hello() {
		System.out.println("world 11");
		System.out.println("world 12");
		System.out.println("world 14");
	}
	@Synchronized
	public static void hello2() {
		System.out.println("world 2.1 ");
		System.out.println("world 2.2 ");
		System.out.println("world 2.3 ");
	}
		
	public int answerToLife() {
		return 42;
	}
	
	@Synchronized("readLock")
	public void foo() {
		System.out.println("bar");
	}
}
