package new_dice_game_dev;

public class Nupp {
	String kujutis; //milline nupp v2lja n2eb
	int asukoht; //indeks m2nguv2lja massiivis
	int id;// v22rtus m2nguv2lja massiivis
	
	public Nupp(String kujutis, int asukoht) {

		this.kujutis = kujutis;
		this.asukoht = asukoht;
	}

	
	
	public String getKujutis() {
		return kujutis;
	}
	
	
	public void setKujutis(String kujutis) {
		this.kujutis = kujutis;
	}
	
	
	public int getAsukoht() {
		return asukoht;
	}
	
	
	public void setAsukoht(int asukoht) {
		this.asukoht = asukoht;
	}
	
	

}
