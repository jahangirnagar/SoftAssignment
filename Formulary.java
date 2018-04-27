import java.util.ArrayList;


public class Formulary {


	 ArrayList<String> drugList = new ArrayList<String>();
	    public void druglist()
	    {
	      
	        drugList.add("Duralux");
	        drugList.add("histasin");
	        drugList.add("Tusca");
	        drugList.add("disprin");
	        System.out.println(drugList);
	    }
	    public void printDrugList()
	    {
	        System.out.println("This ios new Druglist "+drugList);
	    }


}
