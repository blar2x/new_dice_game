package new_dice_game_dev;


public class M2nguv2li {
    int ruutude_arv = 61;
    static String m2ngurida;

    public M2nguv2li(int ruutude_arv) {
        this.ruutude_arv = ruutude_arv;
    }



    int[] m2nguruudud = new int[ruutude_arv];


    public  int[] getM2nguruudud() {
        return m2nguruudud;
    }

    public static String getM2ngurida() {
        return m2ngurida;
    }

    public String v2li(int[] ruudud){
        m2ngurida = ".";
        for (int i = 0; i < ruudud.length; i++) {
            if(ruudud[i] == 1){
                m2ngurida = m2ngurida + "1.";
            }
            else if(ruudud[i] == 2){
                m2ngurida = m2ngurida + "2.";
            }
            else{
                m2ngurida = m2ngurida + "_.";

            }
        }


        return m2ngurida;
    }




}



