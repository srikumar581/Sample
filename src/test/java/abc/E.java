package abc;

public class E extends F{

	void fun()
	{
		System.out.println("This is  class E");
	}
	void r()
	{
		fun();
		super.fun();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	F f=new F();
		f.fun();
		E e=new E();
		e.fun();
		F f1=new E();
		f1.fun();
		//E e1=new F();
		//E e=new E();
		e.r();
		
		
	}

}
class F
{
 void fun()
	{
		System.out.println("This is class F");
	}
}
