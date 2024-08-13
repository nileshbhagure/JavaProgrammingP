package classobjectmethod;

public class Student 
{
  int sid;
  String sname;
  char grade;
  
  void show()
  {
	System.out.println(sid+" "+sname+" "+grade);  
  }
  
  void setData(int id, String name, char g)
  {
	  sid=id;
	  sname=name;
	  grade=g;
  }
  
  //Constructor
  Student(int id, String name, char g)
  {
	  sid=id;
	  sname=name;
	  grade=g;
  }
}
