import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws Exception {
		ArrayList<FizzBuzzExtends> fizBuzzExtends = new ArrayList<FizzBuzzExtends>();
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.impressora = new ImpressoraJOptionPane();
		
		fizBuzzExtends.add(fizzbuzz);
		fizBuzzExtends.add(new Fizz());
		fizBuzzExtends.add(new Buzz());
		fizBuzzExtends.add(new Default());
		
		for (int i = 1; i <=100; i++) {
			for(FizzBuzzExtends fbe : fizBuzzExtends) {
				if(isThis(fbe, i)){
					break;
				}
			}
		}
	}
	
	public static boolean isThis(FizzBuzzExtends fbe, int value) throws Exception{
		return fbe.isThis(value);
	}
}
