
public class FizzBuzz extends FizzBuzzExtends{

	@Override
	public boolean isThis(int value) throws Exception {	
		if(value % 3 == 0 && value % 5 == 0){
			print(getClass().getName());
			return true;
		}
		
		return false;
	}
}
