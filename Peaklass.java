package new_dice_game_dev;

public class Peaklass {

	public static void main(String[] args) {
		T2ring punane = new T2ring("punane");
		
		System.out.println(punane.t2ringu_vise());
		
		
		int m2nguruut[] = M2nguv2li.getM2nguruudud();
		
		for (int i = 0; i < m2nguruut.length; i++) {
			if(i == 9){
			m2nguruut[i]= 2;
			}
			System.out.println(m2nguruut[i]);
			//System.out.println(i);

		}
	}

}
