
public class Fizz extends FizzBuzzExtends{

	@Override
	public boolean isThis(int value) throws Exception {	
		if(value % 3 == 0){
			print(getClass().getName());
			return true;
		}
		
		return false;
	}
}
