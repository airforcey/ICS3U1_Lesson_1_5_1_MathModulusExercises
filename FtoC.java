class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    //  declare
    double dblF;
    double dblC;

    // getting the f
    dblF = readDouble("Enter the faraenheit: ")
    
    // calculate 
    dblC = (dblF - 32) *5/9;

    // show the results
    System.out.println("The amount of degrees in C is: " + dblC);

    // a grade 2 student could understand this 
  }
}