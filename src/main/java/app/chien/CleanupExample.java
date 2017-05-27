package app.chien;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import lombok.Cleanup;

public class CleanupExample {
	
	public CleanupExample() throws IOException {
		@Cleanup InputStream is = new ByteArrayInputStream("Hello World".getBytes());
		@Cleanup OutputStream os = new ByteArrayOutputStream();
		
		byte[] b = new byte[10000];
		while(true) {
			int r = is.read(b);
			if (r == -1) break;
			os.write(b, 0, r);
		}
	}
	
	
}
