class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;

    // getting the side lengths and angles
    dblSideA = readDouble("Enter the side length of A: ");
    dblSideB = readDouble("Enter the side length of B: ");
    dblAngleC = readDouble("Enter the angle of C: ");

    // calculating the formula a2+b2-2abcosC
    dblSideC = Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - (2 * dblSideA * dblSideB * Math.cos(dblAngleC));
    dblSideC = Math.sqrt(dblSideC);

    //printing it out
    System.out.println("The side length of C is" +  dblAngleC);
    
    // looks very professional, very nice and neat, everything is gathered into one place and each variable is assigned and does its part
  }
}