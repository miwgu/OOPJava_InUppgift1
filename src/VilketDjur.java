/**
 * Created by Miwa Guhrés
 * Date: 2020-09-29
 * Time: 10:38
 * Project: OOPJava
 * Copyright: MIT
 * <br><br>
 * En klass VilketDjur som användas i Kund klass
 * Har en instansmetod getNamn
 */
public class VilketDjur {
    private String namn;

    public VilketDjur(String namn){
        this.namn=namn;
    }

    /**
     * En instansmethod som hämtar namn
     * @return namn t.ex Hund
     */
    public String getNamn() {
        return namn;
    }
}
