class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // declaring the variables!!
    double dblHours;
    double dblDays;

    // hours
    dblHours = readDouble("Please enter the amount of hours: ");

    // conversion
    dblDays = (dblHours%12);
    
    //printing the results
    System.out.println("The amount of hours and days total combined is: " + dblDays);

   // very user friendly, espescially towards new beginners 

  }
}