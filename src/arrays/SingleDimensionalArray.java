package arrays;

import java.util.Arrays;

/*
 Array is collection elements of same data type(Homogenios data).
 We can store multiple values into a single variable.
 Array index start with 0
 
 int a[]=new int[100];
(or)
int []a=new int[100];

2 types of arrays
---------
1) Single dimensional
2) two dimensional/multidimensional

Single dimensional
----------------------
1) Declare an array
2) insert values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
 */
public class SingleDimensionalArray {

	public static void main(String[] args) {
  //Approach-1 Array size is fixed
	//1) Declare an array
  /*		
    int a[]=new int[5];

    //2) insert values into array
      a[0]=100;
      a[1]=200;
      a[2]=300;
      a[3]=400
      a[4]=500;   */
      
    //Approach-2
	//dynamically memory will be allocated based upon value. Array size is not fixed
	int a[]= {100,200,300,400,500,600};
	
	//size/length of array
	System.out.println(a.length); //6 -value count in the array
	
	//get single value from array
	System.out.println(a[3]);
	
	//get all the value from array
	System.out.println(Arrays.toString(a));  //[100, 200, 300, 400, 500, 600] - Not preferred 

   //get all value by using loop	
	/*
	for(int i=0; i<6; i++)
	{
		System.out.println(a[i]);
	} */
	
	//get all values when we dont know all the values
	/*
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	} */
	
	
	//Using inhanced for loop- using in array & collection
	for(int x:a)
	{
		System.out.println(x);
	}
	}
	
	
	
	

}
