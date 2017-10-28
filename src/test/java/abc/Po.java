package abc;

public class Po extends Lo {
	Po()
	{
		
	super();
	
	}
	public void fun()
	{
		super.m();
		
		
	}
	public static void r2()
	{
		System.out.println("Hello...");
		r2();
	}
public static void main(String []args)
{
	//Po o=new Po();
	r2();
	
}
}
class Lo
{
	Lo()
	{
		
		System.out.println("This is Lo cons");
	}
	int i=10;
	String n="name";
public void m()
{
	   
	System.out.println("this is po class");
}
}