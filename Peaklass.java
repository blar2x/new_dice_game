package new_dice_game_dev;





public class Peaklass {
	
	
	public static int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
    return k;
}
	
	
	
    public static int[] muudaKohta(int[] m2nguruut, int kohamuutus, int m2ngija){
        int ajutinekoht = 0;
        int uuskoht;
        int[] vastus;
        //leia eelmine koht
        for (int i = 0; i < m2nguruut.length; i++) {


            //leiame m2ngija koha massiivis ja kustutame selle
            if(m2nguruut[i] == m2ngija){
                ajutinekoht = i;
                m2nguruut[i] = 0;
            }
        }
        uuskoht = ajutinekoht + kohamuutus;

        for (int j = 0; j < m2nguruut.length; j++) {
            if(j == uuskoht){
                m2nguruut[j] = m2ngija;

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





        int t2ringuv22rtus2;
        int[] uusruut1;
        int[] uusruut2;
        while(m2ng == true && loendur > 1){
            System.out.println();
            System.out.println("mängija 1 kord");
            int t2ringuv22rtus1 = punane.t2ringu_vise();
            
            uusruut1 = muudaKohta(m2nguruut, t2ringuv22rtus1, 1);

            System.out.println( "Veeretati "+ t2ringuv22rtus1);
            System.out.println(uusasi.v2li(uusruut1));
            System.out.println();
            System.out.println(uusasi.getM2ngurida().indexOf("1"));
            System.out.println(uusasi.getM2ngurida().indexOf("2"));
            
            
            
            
            //System.out.println(uusasi.getM2ngurida().length());
            System.out.println ("Mängija 2 kord");
            t2ringuv22rtus2 = 0- punane.t2ringu_vise();
            System.out.println( "Veeretati "+ t2ringuv22rtus2 * -1);
            uusruut2 = muudaKohta(m2nguruut, t2ringuv22rtus2, 2);

            System.out.println(uusasi.v2li(uusruut2));
            
            
            
            if ((uusasi.getM2ngurida().indexOf("1"))>61){
            	m2nguruut[31] = 1;
            }
            
            //kontroll nupu 1 seisundi kohta
            if (m2nguruut[31] == 1){
                System.out.println("Mängija 1 võitis");

                return ;
            }
            
           
            if ((uusasi.getM2ngurida().indexOf("2"))<61){
            	m2nguruut[31] = 2;
            }
            //kontroll nupu 2 seisundi kohta


            else if (m2nguruut[31] == 2){
                System.out.println("Mängija 2 võitis");
                return ;
            }


            loendur--;
        }

        //System.out.println(uusasi.v2li(m2nguruut));

        //System.out.println(".1._._._._._._._._._._._._._.3._._._."); n2idis m2ngu rida



    }

}