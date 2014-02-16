/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.dayofmonth;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DayOfMont {
    public static void main(String[] args) {
        

    // Create a calendar object and set year and moth

        for (int i = 0; i < 12; i++) {
            Calendar calender = new GregorianCalendar(2014, i, 1);
            int daysInMonth = calender.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
            System.out.println(i+" "+daysInMonth);
        }
    
    

    // Get the number of days in that month

//    System.out.println("Days in month 2014 : "+daysInMonth);
//    
//    // Try month in a leap year
//    mycal = new GregorianCalendar(2013, Calendar.FEBRUARY, 1);
//    daysInMonth= mycal.getActualMaximum(Calendar.DAY_OF_MONTH);     // 29
//
//    
//    System.out.println("Days in month 2013 : "+daysInMonth);
    }
}
