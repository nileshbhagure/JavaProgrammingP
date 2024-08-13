package arrays;
/*
 1) Declare an array
2) insert values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
 */
public class TwoDimensionalArray {

	public static void main(String[] args)
	{
		//1.declaration
		
		//approach 1
		                //R  C
	//	int a[][]=new int[3][2];
    
	// int a[]=new int[3][2];
	// int [][]a=new int[3][2];
	// int []a[]=new int[3][2];
		
		//2) insert values into array
		/*
          a[0][0]=100;
          a[0][1]=200;
          
          a[1][0]=300;
          a[1][1]=400;
          
          a[2][0]=500;
          a[2][1]=600;  */
	
          //approach 2
          int a[][]= {{100,200},
        		     {300,400},
        		     {500,600}};

          //3) Find size of an array
          //length of the array
          System.out.println(a.length); //3 give lenth of row
          System.out.println(a[0].length);//2 gives length of column
                                          // need to specify row along
	
	      //4) read single value from an array
	      System.out.println(a[2][0]); //500
	  
	      //5) reading data from array using classic for loop
	/*
	 for(int r=0; r<a.length; r++) //3 r=0 1 2 3               //no of row
	 {
		 for(int c=0; c<a[r].length; c++)   //2 c=0 1 2            //no of column
		 {
			 System.out.print(a[r][c]+ " ");  //100 200 300 400 500
		 }
		 System.out.println();
	 }*/
	      
	      //reading data from 2d array using enhanced for loop
	      
	      for(int x[]:a)
	      {
	    	  for(int v:x)
	    	  {
	    		  System.out.print(v+" ");
	    	  }
	    	   System.out.println();
	      }
	      
	      
	
	
	}

}
