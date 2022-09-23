package arthimatic;
import java.util.*;
public class BMIcalculator {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Height");
    int H=sc.nextInt();
        System.out.println("Weight");
    int K=sc.nextInt();
    double H1=(double)H/100.0;
    double BMI=(double)K/(H1*H1);
    if(BMI<18.5){
        System.out.println("Underweight");
        // System.out.print("%.1f"BMI);
    }
    else if(BMI>18.5 && BMI<=24.9){
        System.out.println("Normal weight");
        //System.out.print("%.1f"BMI);
    }
    else if(BMI>24.9 && BMI<=29.9){
        System.out.println("Overweight");
        //System.out.print("%.1f"BMI);
    }
    else{
        System.out.println("Obese");
        //System.out.print("%.1f",BMI);
    }
    System.out.printf("%.1f",BMI);

}
}
