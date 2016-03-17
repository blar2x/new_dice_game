package new_dice_game_dev;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Peaklass2 {
    private static Scanner scan;

	public static void main(String[] args) {
        T2ring punane = new T2ring();
        M2nguv2li uusasi = new M2nguv2li(61);
        boolean m2ng = true;
        int loendur = 15;
        scan = new Scanner(System.in);
        String userinput;

        /*String nimi1 = JOptionPane.showInputDialog(null, "I mängija nimi ", "Nime sisestamine",
                JOptionPane.QUESTION_MESSAGE);
        String nimi2 = JOptionPane.showInputDialog(null, "II mängja nimi ", "Nime sisestamine",
                JOptionPane.QUESTION_MESSAGE);*/
        
        
        String nimi1 = "Memme";
        String nimi2 = "Poeg";

        Nupp nupp1 = new Nupp(nimi1,0,1,3);
        Nupp nupp2 = new Nupp(nimi2,0,2,3);
       

        System.out.println("Tere "+ nupp1.getNimi()+" ja "+ nupp2.getNimi()+"!");

        //kirjeldus

        System.out.println("Mängu alustamiseks vajuta ENTERit.");
        userinput = scan.nextLine();

        int m2nguruut[] = uusasi.getM2nguruudud();
        nupp1.m22rakoht(m2nguruut, 0, 1);
        nupp2.m22rakoht(m2nguruut, m2nguruut.length-1, 2);

        //kirjeldus tuleb siia
        System.out.println();

        int[] uusruut1;
        int[] uusruut2;

        while(m2ng == true && loendur > 1){
            
        	
        	if (userinput.equals("x")){
                System.out.println("Mäng lõpetatud.");
                return ;
            }
            if (loendur == 15){
                System.out.println("Veeretamiseks vajutada ENTERit");
                System.out.println(uusasi.v2li(m2nguruut));
            }
            
            
            //mängija 1 kord
            System.out.println();
            System.out.println("mängija 1 kord, käik:" + (15-loendur+1) );
            userinput = scan.nextLine();
         
            
            if (userinput.equals("b") && nupp1.getKorrad() >  1 && loendur <= 12){
            	// pushBack(int[] m2nguruut, int korrad, int idtarget, int id, T2ring t2ring)
            	
            	nupp1.pushBack(m2nguruut,2 ,punane );
            	nupp1.setKorrad(nupp1.getKorrad()-1);
            	System.out.println("tagasilükkamise kordi jäänud " + (nupp1.getKorrad()-1));
            	System.out.println(uusasi.v2li(m2nguruut));
            }
            else{
            int t2ringuv22rtus1 = punane.t2ringu_vise();//random
            System.out.println( "Veeretati "+ t2ringuv22rtus1);
            if(nupp1.getAsukoht()+t2ringuv22rtus1==nupp2.getAsukoht()){
                System.out.println("APPI!");
                uusruut1 = nupp1.muudaKohta(m2nguruut,t2ringuv22rtus1+1,1);
            }
            else {
                uusruut1 = nupp1.muudaKohta(m2nguruut, t2ringuv22rtus1, 1);
            }
            if ((nupp1.getAsukoht()>=31)){
                nupp1.m22rakoht(uusruut1,31,1);
                System.out.println(uusasi.v2li(uusruut1));
                System.out.println();
                System.out.println("Mängija 1 võitis!");
                return ;
            }
            else {
                System.out.println(uusasi.v2li(uusruut1));
            }
            
            }
            //mängija 2 kord
            System.out.println();
            System.out.println("mängija 2 kord, käik:" + (15-loendur+1));
            userinput = scan.nextLine();
            
            if (userinput.equals("b") && nupp2.getKorrad() >  1  && loendur<= 12){
            	// pushBack(int[] m2nguruut, int korrad, int idtarget, int id, T2ring t2ring)
            	
            	
            	System.out.println("tagasi");
            	nupp2.pushBack(m2nguruut, 1, punane);
            	nupp2.setKorrad(nupp2.getKorrad()-1);
            	System.out.println("tagasilükkamise kordi jäänud " + (nupp2.getKorrad()-1));
            	System.out.println(uusasi.v2li(m2nguruut));
            }
            
            
            else{
	            int t2ringuv22rtus2 = 0-punane.t2ringu_vise();
	            System.out.println( "Veeretati "+ t2ringuv22rtus2*-1);
	            if(nupp2.getAsukoht()-t2ringuv22rtus2==nupp1.getAsukoht()) {
	                System.out.println("APPIKENE!");
	                uusruut2 = nupp2.muudaKohta(m2nguruut,t2ringuv22rtus2-1,2);
	            }
	            else{
	                uusruut2 = nupp2.muudaKohta(m2nguruut, t2ringuv22rtus2, 2);
	            }
	            if ((nupp2.getAsukoht()<=31)){
	                nupp2.m22rakoht(uusruut2,31,2);
	                System.out.println(uusasi.v2li(uusruut2));
	                System.out.println();
	                System.out.println("Mängija 2 võitis!");
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