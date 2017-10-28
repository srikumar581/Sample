package abc;

public class D {
	
	static void validate(int m) throws InvalidException
	{
		if(m<18)
			throw new InvalidException("not valid");
		else
			System.out.println("ok continue");
	}

	public static void main(String []args)
	{
	try {
		validate(13);
	} catch (InvalidException e) {
		
		e.printStackTrace();
	}
	}
}
class InvalidException extends Exception{
	InvalidException(String s)
	{
		super(s);
	}
}