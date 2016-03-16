package new_dice_game_dev;

import javax.swing.JOptionPane;

public class Peaklass2 {

	public static void main(String[] args) {
		 T2ring punane = new T2ring();
	     M2nguv2li uusasi = new M2nguv2li(61);
	     boolean m2ng = true;
	     int loendur = 15;
	     
	     String nimi1 = JOptionPane.showInputDialog(null, "Sisesta oma nimi ", "Andmete sisestamine",
                 JOptionPane.QUESTION_MESSAGE);
	     String nimi2 = JOptionPane.showInputDialog(null, "Sisesta oma nimi ", "Andmete sisestamine",
                 JOptionPane.QUESTION_MESSAGE);
	     
	     
	     Nupp nupp1 = new Nupp(nimi1,0,1);
	     Nupp nupp2 = new Nupp(nimi2,0,2);
	     
	     System.out.println("Tere "+ nupp1.getNimi());
	     System.out.println("Tere "+ nupp2.getNimi());
	     
    	 int m2nguruut[] = uusasi.getM2nguruudud();
    	 nupp1.m22rakoht(m2nguruut, 0, 1);
    	 nupp2.m22rakoht(m2nguruut, m2nguruut.length-1, 2);
	     
    	 //kirjerldus tuleb siia 
    	 
    	 System.out.println();
    	
	     
	     
	     
	     while(m2ng == true && loendur > 1){
	    	 
	    	 if (loendur == 15){
	    		 System.out.println("alustame mänguga");
	    	 }
	    	 
	    	 System.out.println(uusasi.v2li(m2nguruut));
	    	 
	    	 if (loendur == 8){
	    		 nupp2.m22rakoht(m2nguruut, m2nguruut.length-11, 2);
	    		 nupp1.m22rakoht(m2nguruut, 11, 1);
	    	 }
	    	 

	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 loendur--;
	    }

	     }
	     
	     
	}


