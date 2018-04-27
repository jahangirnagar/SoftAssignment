/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softassignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class New {
      ArrayList<String> drugList = new ArrayList<>();
    public void druglist()
    {
      
        drugList.add("kotisol");
        drugList.add("Clofenak");
        drugList.add("Etisen");
        drugList.add("Betninal");
        drugList.add("Bejofil");
        drugList.add("Telucast");
        System.out.println(drugList);
           System.out.println("Enter the drug name to search : ");
	        checkdrug=scan.nextLine();
	        if(drugList.contains(checkdrug)==true)
	        {
	        	System.out.println("Drug is exist in the Druglist.");
	        }
	        else
	        {
	        	System.out.println("Drug does not exist in the Druglist.");
	        }
    }
    public void printDrugList()
    {
        System.out.println("Drug List is : ");
        System.out.println(drugList);
    }
    
}
