 import java.util.Scanner;
public class MetricConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters;
        double miles;
        double feet;
        double inches;
        String trash = "";
        System.out.println("Enter you value in meters");
        if (in.hasNextDouble())
        {
            meters =in.nextDouble();
            miles = meters / 1609.344;
            feet = meters * 3.280839895;
            inches = feet * 12;
            System.out.println("The amount of miles is: " + meters);
            System.out.println("The amount of feet is : " + feet);
            System.out.println("The amount of inches is : " + inches);
        }else
        {
            trash = in.nextLine();
            System.out.println("Make sure you input a valid response" + trash);
            System.exit(0);
        }

        }
    }


