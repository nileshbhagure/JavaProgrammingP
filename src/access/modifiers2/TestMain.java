package access.modifiers2;

import access.modifiers1.Test;  //whenever you are acessing method/variable of another class we need to import using pkgname.classname

/*
 Access modifiers
-------------
4.public - we can access everywhere
3.protected - we can access  outside of the package but through inheritance
            -can access within class, within package, other package also but using inheritance
2.default - only within the package- by default the access specifier
          can access mutiple class within same package
1.private - only within the class

 */
/*
public class TestMain extends Test
{

	public static void main(String[] args) {
		Test t=new Test();
	//	System.out.println(t.x);  //default variable are accessable only with class & same pkg
	//	t.m1();
		
	//Protected	
	// we can used protected onces we extends class by making parent
	//create the object of child class	
	TestMain tm=new TestMain();
	System.out.println(tm.x); 
	tm.m1();
	}

}*/

// by public we can access directly without extending
public class TestMain
{
	public static void main(String[] args) {
		Test t=new Test();
       System.out.println(t.x);  //default variable are accessable only with class & same pkg
	 t.m1();
}
}
