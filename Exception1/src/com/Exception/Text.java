package com.Exception;

public class Text {
public static void main(String args[]) {
	Student st=new Student(16);
	
	//st.GetAge();
    //st.calculateLoan();
    try {
        st.GetAge(); 
    } catch (InvelidAgeException e) {
        System.out.println("Error: " + e.getMessage());
    }
    
    
    try {
        st.calculateLoan(); 
    } catch (InvelidLoanArgException e) {
        System.out.println("Error: " + e.getMessage());
    }
//    catch (ArithmeticException e) {
//        System.out.println("Error: " + e.getMessage());
//    }
    catch (Exception e) {
        System.out.println("ErrorException : " + e.getMessage());
    }
}

	
}

