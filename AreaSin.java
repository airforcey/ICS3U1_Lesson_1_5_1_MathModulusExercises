class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // declaring the variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // getting the side lengths and angles
    dblSideA = readDouble("Enter the side length of A: ");
    dblSideB = readDouble("Enter the side length of B: ");
    dblAngleC = readDouble("Enter the angle of C: ");

    // calucalating the forumula absinC/2

    dblArea = dblSideA * dblSideB * Math.sin(dblAngleC / 2);

    // printing the final result out 
    System.out.println("The area is:" + dblArea);

    // super simple 4 steps easy to follow very user friendly 
  }
}