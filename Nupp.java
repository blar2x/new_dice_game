package new_dice_game_dev;

public class Nupp {
	String nimi; //milline nupp v2lja n2eb
	int asukoht; //indeks m2nguv2lja massiivis
	int id;// v22rtus m2nguv2lja massiivis
	
	
	public Nupp(String nimi, int asukoht, int id) {
		this.nimi = nimi;
		this.asukoht = asukoht;
		this.id = id;
	}
	
	
	public int[] muudaKohta(int[] m2nguruut, int kohamuutus, int id){
		 int ajutinekoht = 0;
	        int uuskoht;
	        //leia eelmine koht
	        for (int i = 0; i < m2nguruut.length; i++) {


	            //leiame m2ngija koha massiivis ja kustutame selle
	            if(m2nguruut[i] == id){
	                ajutinekoht = i;
	                m2nguruut[i] = 0;
	            }
	        }
	        uuskoht = ajutinekoht + kohamuutus;

	        for (int j = 0; j < m2nguruut.length; j++) {
	            if(j == uuskoht){
	                m2nguruut[j] =id;

	            }


	        }
	       

	        return m2nguruut;

		
	}
	
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}




	
	public String getNimi() {
		return nimi;
	}



	public void setNimi(String nimi) {
		this.nimi = nimi;
	}



	public int getAsukoht() {
		return asukoht;
	}
	
	
	public void setAsukoht(int asukoht) {
		this.asukoht = asukoht;
	}
	
	

}
