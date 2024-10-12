//bhavin shuseevan
//cosc1200
//thsi program analyzes the temperature for the amount of days the user has inputted
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numdays = 0;
        do {
            System.out.print("please input the amount of days to analyze (between 2 and 366): ");
            numdays = sc.nextInt();
        } while(numdays <2 || numdays >366);
double[] Ltemp = new double[numdays];
double[] Htemp = new double[numdays];
//array for the high and low temps
for (int i = 0; i < numdays; i++) {
    double low,high;
    do{
        System.out.print("please input low: ");
        low = sc.nextDouble();
        System.out.print("please input high: ");
        high = sc.nextDouble();
        //where user inputs high and low temp for the amount of days they enter

        if (low < -100||high < -100||low>100||high>100) {
            System.out.println("Invalid Temps, try again");
            //this is to make sure its in the range of -100 to 100, imagine being in -100 weather very very cold
            //so many errors while testing,was an easy fix
        }
    }while (low < -100||high < -100||low>100||high>100|| high<low);
    //this is the last check on the temp to make sure for each day the temp is still in range and they are still correct
    Ltemp[i]=low;
    Htemp[i]=high;
    //for storing the temps
}
double totalavg =0;
double Highertemp =-100;
double Lowertemp =100;
int Higherday=0;
int Lowerday=0;
for (int i = 0; i < numdays; i++) {
    double avgtemp = (Ltemp[i]+Htemp[i])/2;
    totalavg += avgtemp;
    // gets the avg temp of the day by / 2 the low and high temps sum
 if(Htemp[i]>Highertemp){
     Highertemp=Htemp[i];
     Higherday=i+1;
//looks for day w highest temp then updated and stored
 }
 if(Ltemp[i]<Lowertemp){
     Lowertemp=Ltemp[i];
     Lowerday=i+1;
     //looks for the day w the lowest temp then its updated and stores
 }

}
totalavg /=numdays;
System.out.println("Total Temps average: "+totalavg);
System.out.println("Higher Temps average: "+Highertemp);
System.out.println("Lower Temps average: "+Lowertemp);
//this prints out the averaged for the highest, lowest, and total temp
sc.close();
    }
}

//most of these autofilled themselves after entering the first relatedd line, technology at its finest
//