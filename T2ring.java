package new_dice_game_dev;

import java.util.Random;

public class T2ring {
	String v2rv;
	
	
	public T2ring(String v2rv) {
		this.v2rv = v2rv;
	}


	public  int t2ringu_vise(){
		Random juhus = new Random();
		int juhuarv = juhus.nextInt((6 - 1) + 1) + 1;
		if (juhuarv == 0){
			juhuarv = juhuarv+1;
		}
		
		return juhuarv;
	}
	
}
