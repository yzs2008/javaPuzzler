package puzzlers.puzzle8;

public class ChildClass extends BaseClass{
	public int count;
	
	public void method(){
		System.out.println("child method");
	}
	
	public static void  main(String[] args){
		ChildClass cc=new ChildClass();
//		cc.count = 1;
//		cc.x = 2;
		BaseClass bc = cc;
//		System.out.println(cc.count);
//		System.out.println(bc.count);
//		System.out.println(bc.x);
		
		cc.method();
		bc.method();
		cc.baseMethod();
		bc.baseMethod();
		System.out.println(bc.getClass());
	}
}
