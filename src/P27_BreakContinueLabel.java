public class P27_BreakContinueLabel {
    public static void main(String[] args){
    int a,b;
    System.out.println("Contoh break label");
    Mulai:
    for(a=0;a<2;a++){
        for(b=0;b<3;b++){
            if(b==1){
                break Mulai;
            }
            System.out.println("a="+a+";b="+b);
        }
    }
    System.out.println("\nContoh continue labe;l");
    Lanjut:
    for(a=0;a<2;a++) {
        for (b = 0; b < 3; b++) {
            if (b == 1) {
                continue Lanjut;
            }
            System.out.println("a="+a+";b="+b);
        }
    }
}

}

