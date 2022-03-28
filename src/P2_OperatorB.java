public class P2_OperatorB {
    public static void main(String[] arguments){
        float total=14000;
        System.out.println("Originalinvestment:$"+total);
        //Increases by 40 percent the first year
        total=total+(total * .4F);
        System.out.println("after one year:$"+total);
        //Loses$1,500 the second year
        total=total-1500F;
        System.out.println("after two years:$"+total);
        //Increases by 12 percent the third year
        total=total+(total *.12F);
        System.out.println("after three years:$"+total);
    }

}
