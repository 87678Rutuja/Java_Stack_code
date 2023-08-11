class Demo{
	int x =10;
	static int y = 20;
}
static{
	Syatem.out.println("static block");
}
public static void main(String[]ar){
	System.out.println("main method");

	Demo obj = new Demo();
	System.out.println(obj.x);
}
static{
	System.out.println("static block2");
	System.out.println(y);
}
}
