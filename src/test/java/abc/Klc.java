package abc;

public class Klc {
	

public static void main(String []args)
{
	//R r=new R();
	R r=R.get();
	R.r();
}
}
class R
{
	static R r=new R();
	private R()
	{
		System.out.println("this is default Constructor");
	}
	static R get()
	{
		return r;
	}
	static void r()
	{
		r();
		System.out.println("Hi....");
	}
}
