/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softassignment;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Current {
    Scanner scan=new Scanner(System.in);
    String check,dose;
    public void checkDose()
    {
        System.out.println("Are you Change the Dose ?? \nPress.. Yes-->y or No-->n !");
        check=scan.nextLine();
        if(check.equals("y")){
            System.out.println("Please Enter the new Dose : ");
            dose=scan.nextLine();
            
        }
        else if(check.equals("n"))
        {
            System.out.println("Continue as Before ! ");
        }
        
    }
    public void printDose()
    {
        System.out.println("So Your Current Dose : "+dose);
    }
}
