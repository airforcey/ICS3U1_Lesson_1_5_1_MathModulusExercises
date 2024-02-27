class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // variables
    double dblCoefficent;
    double dblVariable;
    double dblMerge;

    // get the coefficent 
    dblCoefficent = readDouble("Enter the coefficient: ")
    dblVariable = readDouble("Enter the variable: ")

    // calculating 
    dblMerge = Math.pow(dblCoefficent, dblVariable);

    // printing the results
    System.out.println("The final result is: " + dblMerge);

    // explains everything in point simple form directly
    
  }
}