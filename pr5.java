//Write a Java Program that shows the use of switch Statement.

import  java.util.Scanner;
class switchStatemnt{
	
	public static void main (String[] args) {
    
    Scanner s1 = new Scanner(System.in);
    int no;
    System.out.println("Enter no:");
    no = s1.nextInt();
        
        switch (no) {
            case 1:
                {
                System.out.println("January");    
                break;
                }

            case 2:
                {
                System.out.println("February");    
                break;
                }                

            case 3:
                {
                System.out.println("March");    
                break;
                }     

            case 4:
                {
                System.out.println("April");    
                break;
                }      

             case 5:
                {
                System.out.println("May");    
                break;
                }

             case 6:
                {
                System.out.println("June");    
                break;
                } 
                
             case 7:
                {
                System.out.println("July");    
                break;
                }  

             case 8:
                {
                System.out.println("Augest");    
                break;
                }     
                
            case 9:
                {
                System.out.println("September");    
                break;
                }   

             case 10:
                {
                System.out.println("Octomber");    
                break;
                }

            case 11:
                {
                System.out.println("November");    
                break;
                }

            case 12:
                {
                System.out.println("December");    
                break;
                }

            default:
                {
                    System.out.println("Ye mahina hi nhi hai ");
                break;
                }
        }
    }
    
}
