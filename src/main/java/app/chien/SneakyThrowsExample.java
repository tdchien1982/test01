package app.chien;

import lombok.SneakyThrows;

public class SneakyThrowsExample {
	
	@SneakyThrows(Exception.class)
	public String utf8ToString(byte[] bytes) {
		int a = 0;
		String b = "";
		return new String(bytes, "UTF-8");
	}
	
	@SneakyThrows
	public void run() {
		int x = 0;
		int y = 1;
		throw new Throwable();
	}
}
