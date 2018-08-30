/*
Create a program that demonstrates the use of the different operators. Use at least 5 different operators.
Display both the equation to be evaluated and if the equation evaluates to true or false to standard output.
Sample output:
5 + 5 = 10
10 - 3 = 7
5 * 7 = 35
8 / 4 = 2
10 % 3 = 1
*/

public class main {
    public static void main(String[] args) {

     int iNumber1 = 2;
     int iNumber2 = 3;
    // ************************************** EQUATION 1 *************************************
     int total1 = iNumber1 + iNumber2;
     System.out.println("\n1. Adding the numbers " + iNumber1 + " and " + iNumber2 + " equals " + total1);

     // ************************************ EQUATION 2 *****************************************

     int total_holder1 = total1;
     int total1_holder = ++total1; // used to reference the original value of total1
     int total2 =  total1_holder * iNumber1;  // Just trying something a little different.
     System.out.println("\n2. taking " + total_holder1 + " and adding 1 to it, then multipying by " + iNumber1 + " equals " + total2);

     // ************************************ EQUATION 3 *****************************************

     int total3 = iNumber2 - iNumber1;
     boolean bCompare3 = (total3 == iNumber1) ? true : false;
     System.out.println("\n3. Subtracting " + iNumber2 + " from " + iNumber1 + " equals " + total3);
          if (total3 == iNumber1) {
            System.out.println("\n" + total3 + " is equal to " + iNumber1);
        } else{
            System.out.println("\n"+ total3 + " is not equal to " + iNumber1);
        }

     // ********************************** EQUATION 4 ***********************************************
        double dDouble1 = 3.141592653589793d;
        double dDouble2 = 2.298938d;
        double total4 = (dDouble1 / dDouble2);
        System.out.println("\n4. " + dDouble1 + " Divided by " + dDouble2 + " equals " + total4);


        // ********************************** EQUATION 5 ***********************************************
        double dNumber3 = 144;
        double dSquare_root = Math.sqrt(dNumber3);
        System.out.println("\n5. The Square root of " + dNumber3 + " is " + dSquare_root);
    }
}
