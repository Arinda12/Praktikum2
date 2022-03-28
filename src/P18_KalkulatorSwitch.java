import java.util.Scanner;
public class P18_KalkulatorSwitch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.println("Enter the first number:");
        double a=input.nextDouble();
        System.out.println("Enter the second number:");
        double b=input.nextDouble();
        System.out.println("choose one of the following operations:");
        System.out.println("1-addition");
        System.out.println("2-subrsction");
        System.out.println("3-multiplication");
        System.out.println("4-division");
        int choise=input.nextInt();
        double result=0.0;
        switch (choise){
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                result=a/b;
                break;
            default:
                break;
        }
        if((choise>0)&&(choise<5)){
            System.out.println("result:"+result);
        }else{
            System.out.println("Invalid choise");
        }
        System.out.println("Thank you for using our calculator.");
    }
}


