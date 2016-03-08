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
