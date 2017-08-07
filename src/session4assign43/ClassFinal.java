/**
 * ClassFinal.java 
 * version  1.1
 * compiled on 6th August 2017
 */

package session4assign43;
/**
 *This program depicts the ClassFinal class , which cannot be inherited by another class
 *
 * @author CHHAYA YADAV
 */

public final class ClassFinal {
	
//final variable declared whose value cannot be modified
	
	final float pi = 3.14f ;
	
//instance variable declaration 
	
	public int radius ;
	
	public float area ;
	
//Default Constructor of Final Class is Final in itself,as it cannot be overridden.
	
public ClassFinal(){

		radius = 0 ;
		
	}
	
//parameterized constructor of Final Class
	
public ClassFinal(int radius){

	this.radius = radius ;
}
	
//final method declared that cannot be overridden in children classes

public final void calculateArea(){
	
	area = pi * radius * radius ;
	
	System.out.println("FINAL METHOD that cannot be overridden !!!  " + area );
	
	System.out.println("FINAL variable value that cannot be modified !!!  " + pi );
	
}


// declaring the static method as final


public static void main(String[] args){
	
   ClassFinal cf1 = new ClassFinal(21);
   
   cf1.calculateArea();
   
   ClassFinal cf2 = new ClassFinal();
   
   cf2.calculateArea();

	}
	
}

