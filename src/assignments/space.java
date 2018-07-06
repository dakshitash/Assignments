package assignments;

import java.util.Scanner;

public class space {
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		scan = new Scanner(System.in);
		String inp = scan.nextLine();
		 
		char[] inpArray = inp.toCharArray();  
	        StringBuffer stringBuffer = new StringBuffer();  
	        for (int i = 0; i < inpArray.length; i++) {  
	            if ((inpArray[i] != ' ') && (inpArray[i] != '\t')) {  
	                stringBuffer.append(inpArray[i]);  
	            }  
	        }
	        System.out.println(stringBuffer);
	        
			}
		}


