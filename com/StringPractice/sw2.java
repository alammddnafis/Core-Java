package com.StringPractice;

public class sw2 {

	public static void main(String[] args) {
		
		int n = 1;

		while (true) {
		    switch (n) {
		        case 1:
		            if (2 > 1)
		                continue; // continues the WHILE loop
		        case 2:
		            System.out.println("hii ji");
		            break;
		    }
		    break; // stop infinite loop
		}


	}

}
