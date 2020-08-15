package com.sample;

public class Exception_08 {

	public static void main(String[] args) {
		int[] array = new int[5]; 
		
        try {      	
            array[5] = 20/0;    
            System.out.println(array[5]);
        } catch(ArrayIndexOutOfBoundsException ie) { 
        	System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(ie.getMessage());  
        } catch(ArithmeticException ae) {
        	System.out.println("ArithmeticException:");
        	System.out.println(ae.getMessage());
        } catch(Exception e) {
        	System.out.println("Exception: ");
        	System.out.println(e.getMessage());
        }
	 }	
 }
