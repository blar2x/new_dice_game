import java.util.Random;

public class T2ring {
    public T2ring() {
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