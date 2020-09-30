/**
 * Created by Miwa Guhrés
 * Date: 2020-09-29
 * Time: 13:52
 * Project: OOPJava
 * Copyright: MIT
 * <br><br>
 * En klass Kund(Gäst) som bor i hotellet
 * har två getter instansmetoder getVilketdjur och getDjur
 */
public class Kund {
    private VilketDjur vilketdjur;
    private Djur djur;


           public Kund(VilketDjur vilketdjur, Djur djur){
        this.vilketdjur=vilketdjur;
        this.djur=djur;
    }

    public VilketDjur getVilketdjur() {
        return vilketdjur;
    }

    public Djur getDjur() {
        return djur;
    }

    //public void setDjur(Djur d) {
    //}

    //public void setVilketdjur(VilketDjur v) {
    //}
}
