import java.util.Scanner;
import javax.swing.JOptionPane;

public class Peaklass {
    private static Scanner scan;

    public static void main(String[] args) {
        T2ring punane = new T2ring();
        M2nguv2li uusasi = new M2nguv2li(61);
        boolean m2ng = true;
        int loendur = 15;
        scan = new Scanner(System.in);
        String userinput;

        String nimi1 = JOptionPane.showInputDialog(null, "I mängija nimi ", "Nime sisestamine",
                JOptionPane.QUESTION_MESSAGE);
        String nimi2 = JOptionPane.showInputDialog(null, "II mängja nimi ", "Nime sisestamine",
                JOptionPane.QUESTION_MESSAGE);


        Nupp nupp1 = new Nupp(nimi1,0,1,3);
        Nupp nupp2 = new Nupp(nimi2,0,2,3);

        System.out.println("Tere "+ nupp1.getNimi()+" ja "+ nupp2.getNimi()+"!");

        //kirjeldus
        System.out.println();
        System.out.println("Antud mängu eesmärgiks on jõuda enne vastast vähemalt mänguvälja keskele.");
        System.out.println("Mängus on võimalik ka vastast saboteerida tema nupu tagasilükkamisega.");
        System.out.println("Seda saab teha vajutades oma käigu ajal klahvi 'b' ja seejärel 'ENTER'it.");
        System.out.println("Tagasilükkamist saab kasutada alates neljandast käigust.");
        System.out.println("Iga mängija saab oma vastast tagasi lükata ainult kaks korda.");
        System.out.println("Tagasilükkamise arv genereeritakse juhuslikult ühest kuni nelja sammuni.");
        System.out.println();
        System.out.println("Mängu lõpetamiseks vajutada klahvi 'x' ja seejärel 'ENTER'it.");
        System.out.println();
        System.out.println("Head mängimist!");
        System.out.println();
        System.out.println("Mängu alustamiseks vajutada 'ENTER'it.");
        userinput = scan.nextLine();

        int m2nguruut[] = uusasi.getM2nguruudud();
        nupp1.m22rakoht(m2nguruut, 0, 1);
        nupp2.m22rakoht(m2nguruut, m2nguruut.length-1, 2);

        System.out.println();

        int[] uusruut1;
        int[] uusruut2;

        while(m2ng == true && loendur > 1){

            if (userinput.equals("x")){
                System.out.println("Mäng lõpetatud.");
                return ;
            }
            if (loendur == 15){
                System.out.println("'Veeretamiseks vajutada ENTER'it");
                System.out.println(uusasi.v2li(m2nguruut));
            }

            //I mängija kord
            System.out.println();
            System.out.println("Mängija "+nupp1.getNimi()+" kord, käik:" + (15-loendur+1) );
            userinput = scan.nextLine();
            System.out.println();

            if (userinput.equals("b") && nupp1.getKorrad() >  1 && loendur <= 12){

                nupp1.pushBack(m2nguruut,2 ,punane );
                nupp1.setKorrad(nupp1.getKorrad()-1);
                System.out.println("tagasilükkamise kordi jäänud " + (nupp1.getKorrad()-1));
                System.out.println(uusasi.v2li(m2nguruut));
            }
            else{
                if(nupp1.getKorrad() == 1 && userinput.equals("b")){
                    System.out.println("Rohkem tagasilükkamisi teha ei saa.");
                }
                int t2ringuv22rtus1 = punane.t2ringu_vise();//random
                System.out.println( "Veeretati "+ t2ringuv22rtus1);
                if(nupp1.getAsukoht()+t2ringuv22rtus1==nupp2.getAsukoht()){
                    uusruut1 = nupp1.muudaKohta(m2nguruut,t2ringuv22rtus1+1,1);
                }
                else {
                    uusruut1 = nupp1.muudaKohta(m2nguruut, t2ringuv22rtus1, 1);
                }
                if ((nupp1.getAsukoht()>=31)){
                    nupp1.m22rakoht(uusruut1,31,1);
                    System.out.println(uusasi.v2li(uusruut1));
                    System.out.println();
                    System.out.println(nupp1.getNimi()+" võitis!");
                    return ;
                }
                else {
                    System.out.println(uusasi.v2li(uusruut1));
                }
            }
            //II mängija kord
            System.out.println();
            System.out.println("Mängija "+nupp2.getNimi()+" kord, käik:" + (15-loendur+1));
            userinput = scan.nextLine();
            System.out.println();

            if (userinput.equals("b") && nupp2.getKorrad() >  1  && loendur<= 12){

                nupp2.pushBack(m2nguruut, 1, punane);
                nupp2.setKorrad(nupp2.getKorrad()-1);
                System.out.println("tagasilükkamise kordi jäänud " + (nupp2.getKorrad()-1));
                System.out.println(uusasi.v2li(m2nguruut));
            }

            else{
                if(nupp2.getKorrad() == 1 && userinput.equals("b")) {
                    System.out.println("Rohkem tagasilükkamisi teha ei saa.");
                }
                int t2ringuv22rtus2 = 0-punane.t2ringu_vise();
                System.out.println( "Veeretati "+ t2ringuv22rtus2*-1);
                if(nupp2.getAsukoht()-t2ringuv22rtus2==nupp1.getAsukoht()) {
                    uusruut2 = nupp2.muudaKohta(m2nguruut,t2ringuv22rtus2-1,2);
                }
                else{
                    uusruut2 = nupp2.muudaKohta(m2nguruut, t2ringuv22rtus2, 2);
                }
                if ((nupp2.getAsukoht()<=31)){
                    nupp2.m22rakoht(uusruut2,31,2);
                    System.out.println(uusasi.v2li(uusruut2));
                    System.out.println();
                    System.out.println(nupp2.getNimi()+" võitis!");
                    return ;
                }
                else {
                    System.out.println(uusasi.v2li(uusruut2));
                }
            }
            loendur--;
        }
    }
}