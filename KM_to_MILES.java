class KM_to_MILES extends ConsoleProgram {

    /**
     * Description
     * @author: M. He
     */

     public void run() { 
      
     // declaring the variables
     double dblKM;
     double dblMILES;

     // asking the user
     dblKM = readDouble("Enter the # of KM: ");

     // formula
     dblMILES =  dblKM * 0.621371;

     // Output results
     System.out.println("The amount of miles is: " + dblMILES);

     // very simple and understandable 
   


     }
}