class BlockExample
{
	//STATIC BLOCK
	static
	{
		System.out.println("INSIDE STATIC BLOCK..");
	}
	
	//ANONYMOUS BLOCK
	{
		System.out.println("INSIDE Anonymous BLOCK..");
	}
	
	//CONSTRUCTOR
	public BlockExample()
	{
		System.out.println("INSIDE Constructor..\n");
	}
	
	//STATIC METHOD
	public static void f1()
	{
		System.out.println("INSIDE F1");
	}

}

public class P07_ConstructorStaticBlockAnonymousBlock {

	public static void main(String[] args) {
		//BlockExample obj = new BlockExample();
		//BlockExample obj1 = new BlockExample();
		
		BlockExample.f1();
		BlockExample.f1();
	}

}
