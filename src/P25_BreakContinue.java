public class P25_BreakContinue {
    public static void main(String[] args)throws NumberFormatException{
        int x;
        System.out.println("Example of break and continue in For-Loop");
        for(x=1;x<=10;x++){
            if(x==7){
                break;
            }
            if(x==3){
                continue;
            }
            System.out.printf("%d",x);
        }
        System.out.print("\n");
    }

}
