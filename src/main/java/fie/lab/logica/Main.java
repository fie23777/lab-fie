package fie.lab.logica;
import java.util.Arrays;
import java.util.List;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;


public class Main {

	
	public static void main(String[] args) {
		
		String stringEmpty = ""; // or null
		
		
		List<String> array = Arrays.asList("");
		
		if(!CollectionUtils.isEmpty(array) && !array.contains("approva")) {
			System.out.println("exception!");
		}
		
		if(CollectionUtils.isEmpty(array)) {
			System.out.println("tem!");
		}
		
		if(StringUtils.isEmpty(stringEmpty)) {
			System.out.println("temdd!");
		}
	}
}
