package fizzbuzz;

public class FizzBuzz {
	
	public static Object fizzbuzz(int i) {
		String res="";
		if (i%3==0)
		{
			res=res+"fizz";
		}
		if (i%5==0)
		{
			res=res+"buzz";
		}
		if (res.equals("")) {
			return Integer.toString(i);
		}
		else
			return res;
	}
}
