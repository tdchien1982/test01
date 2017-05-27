package app.chien;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
public class ConstructorExample<T> {
	private int x, y;
	
	@NonNull private T description;
	
	@NoArgsConstructor
	public static class NoArgsExample {		
		@NonNull
		private String field;
	}
	
}
