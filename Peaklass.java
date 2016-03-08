package new_dice_game_dev;

public class Peaklass {
	public static int[] muudaKohta(int[] m2nguruut, int kohamuutus){
		int ajutinekoht = 0;
		int uuskoht;
		int[] vastus;
		//leia eelmine koht
		for (int i = 0; i < m2nguruut.length; i++) {

			
			//leiame m2ngija koha massiivis ja kustutame selle
			if(m2nguruut[i] == 1){
				ajutinekoht = i;
				m2nguruut[i] = 0;
			}
		}
			uuskoht = ajutinekoht + kohamuutus;
			
			for (int j = 0; j < m2nguruut.length; j++) {
				if(j == uuskoht){
					m2nguruut[j] = 1;
					
				}
				
				
			}
			vastus = m2nguruut;
			return vastus;	
			
	
		
	}
	
	
	
	public static void main(String[] args) {
		T2ring punane = new T2ring("punane");
		M2nguv2li uusasi = new M2nguv2li(61);
		boolean m2ng = true;
		int loendur = 15;
		
		
		
		System.out.println(punane.t2ringu_vise());
		
	
		
		// kutsub klassist m2nguv2li tyhja massiivi
		int m2nguruut[] = uusasi.getM2nguruudud();

		System.out.println(m2nguruut.length);
		//v22rtustab massiivi alguse ja l6pu elemendi
		
		for (int i = 0; i < m2nguruut.length; i++) {
			if(i == 0){
			m2nguruut[i]= 1;
			}
			else if(i == m2nguruut.length-1){
				m2nguruut[i]=2;
			}
			//System.out.print(m2nguruut[i]);
			//System.out.println(i);
		}
		
		
		
		

		
		int[] uusruut;
		while(m2ng == true && loendur > 1){
			System.out.println("m2ngija 1 kord");
			int t2ringuv22rtus = punane.t2ringu_vise();
			uusruut = muudaKohta(m2nguruut, t2ringuv22rtus);
			//System.out.println("m2ngija 2 kord");
			System.out.println(uusasi.v2li(uusruut));
			loendur--;
		}
		
		//System.out.println(uusasi.v2li(m2nguruut));
		
		//System.out.println(".1._._._._._._._._._._._._._.3._._._."); n2idis m2ngu rida
		
		
		
	}

}
