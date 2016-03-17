public class Nupp {
    String nimi;
    int asukoht; //indeks m2nguv2lja massiivis
    int id;// v22rtus m2nguv2lja massiivis
    int korrad;

    public Nupp(String nimi, int asukoht, int id, int korrad) {
        this.nimi = nimi;
        this.asukoht = asukoht;
        this.id = id;
        this.korrad = korrad;
    }
    public int[] m22rakoht(int[] m2nguruut, int uusindex, int id){
        asukoht = uusindex;
        for (int i = 0; i < m2nguruut.length; i++) {

            //leiame m2ngija koha massiivis ja kustutame selle
            if(m2nguruut[i] == id){
                m2nguruut[i] = 0;
            }
        }
        for (int j = 0; j < m2nguruut.length; j++) {
            if(j == uusindex){
                m2nguruut[j] = id;
            }
        }
        return m2nguruut;
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
        asukoht = uuskoht;
        for (int j = 0; j < m2nguruut.length; j++) {
            if(j == uuskoht){
                m2nguruut[j] =id;
            }
        }
        return m2nguruut;
    }

    // saab teist nuppu tagasi lükata
    public int[] pushBack(int[] m2nguruut, int idtarget, T2ring t2ring){
        int abiindex = 0;

        if (korrad >  1){
            for (int i = 0; i < m2nguruut.length; i++) {

                //leiame m2ngija koha massiivis ja kustutame selle
                if(m2nguruut[i] == idtarget){
                    abiindex = i;
                    m2nguruut[i] = 0;
                }
            }
            if(idtarget == 1){
                int uus = t2ring.t2ringu_vise() / 2 + 1;
                System.out.println("tagasi " +uus+ " samm(u)");
                for (int j = 0; j < m2nguruut.length; j++) {
                    if(j == abiindex - (uus)){

                        m2nguruut[j] = idtarget;
                    }
                }
            }
            if(idtarget == 2){
                int uus = t2ring.t2ringu_vise()/2 + 1;
                System.out.println("tagasi " + uus + " samm(u)");
                for (int j = 0; j < m2nguruut.length; j++) {
                    if(j == abiindex + (uus)){
                        m2nguruut[j] = idtarget;
                    }
                }
            }
        }
        return m2nguruut;
    }

    public int getKorrad() {
        return korrad;
    }
    public void setKorrad(int korrad) {
        this.korrad = korrad;
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