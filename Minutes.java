class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // variables
    double dblMinutes;
    double dblDays;

    // asking the user
    dblMinutes = readDouble("HI please enter the amount of minutes to be converted: ");

    // calculating
    dblDays = (dblMinutes/1440);

    // printing the results
    System.out.println("The final amount is: " + dblDays);

    // nice and neat, direct and simple, even a idiot can understand this
  }
}