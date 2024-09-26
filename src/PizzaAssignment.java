/* * Name: bhavin
 * Program Name: COSC1200
 * Description: get the area of a slice of pizza from the diameter of the entire pizza
 */
import java.util.Scanner;
public class PizzaAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double dmter;
        int slcs = 0;
        System.out.print("Please put in the diameter of the pizza:");
        dmter =scanner.nextDouble();
        //this is where you enter the diameter of the pizza
        if (dmter < 6 || dmter > 24) {
            System.out.println("Uh-Oh the diameter has to be in the range 6 to 24!");
            return;
// this is the error message you will get if you dont input in the range

        }
        if(dmter >= 6 && dmter < 8 ){
            slcs = 4 ;
        } else if (dmter >= 8 && dmter < 12) {
            slcs =6;
        } else if (dmter >= 12 && dmter < 14) {
            slcs =8;
        } else if (dmter >= 14 && dmter < 16) {
            slcs = 10;
        } else if (dmter >= 16 && dmter < 20) {
            slcs =12;

        } else if (dmter >= 20 && dmter < 24) {
            slcs = 16;
        }
        //the if statement that will give the result of slices for the user's provided diameter
        double rad = dmter/2;
        double pizArea = Math.PI*rad*rad;
        double AreaSlc = pizArea/slcs;
        System.out.printf("a %.2f pizza will give %d slices", dmter,slcs);
        System.out.printf("Each slice will have %.2f square inches of area.", AreaSlc);
        // this is the results you will get after everything is done

    }

}
