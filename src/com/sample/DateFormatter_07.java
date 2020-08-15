package com.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * @author Sangeetha
 *
 */
public class DateFormatter_07 {

	public static void main(String[] args) {

	      Date currentDate = new Date();
	     
	      Calendar cal = Calendar.getInstance();
	      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
	      System.out.println("Today's date: "+dateFormat.format(cal.getTime()));
	      
	      SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	      String date = format.format(currentDate);
	      System.out.println("yyyy/MM/dd: "+date);
	      
	      format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	      date = format.format(currentDate);
	      System.out.println("dd-M-yyyy hh:mm:ss: " +date);
	      
	      format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
	      date = format.format(currentDate);
	      System.out.println("dd MMM yyyy HH:mm:ss z: " +date);
	      
	      format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
	      date = format.format(currentDate);
	      System.out.println("dd MMMM yyyy zzzz: "+date);
	      
	      try {
	    	  
	         Date d = format.parse(date);
	         System.out.println("Date: "+d);
	         
	      } catch (ParseException e) {
	         e.printStackTrace();
	      } 
	   } 
	}