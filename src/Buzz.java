
public class Buzz extends FizzBuzzExtends{
	
	@Override
	public boolean isThis(int value) throws Exception {	
		if(value % 5 == 0){
			print(getClass().getName());
			return true;
		}
		
		return false;
	}
}
