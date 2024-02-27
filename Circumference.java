class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
   // declaring the variables
   double dblRadius;
   double dblCircumference;

   // getting the side lengths and angles
   dblRadius = readDouble("Enter the radius: ");

   // calucalating the forumula 2piR
   dblCircumference = 2 * Math.PI * dblRadius;

   // yayayaya printing the final result
   System.out.println("The circumference of this circle is" + dblCircumference);

   // nice and simple 
    
  }
}