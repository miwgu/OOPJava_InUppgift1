/**
 * Created by Miwa Guhrés
 * Date: 2020-09-28
 * Time: 10:07
 * Project: OOPJava
 * Copyright: MIT
 * <br><br>
 * En subklass Hund som arvar Abstaraktklassen Djur(superklass)
 * Har två instansmetoder, foderainfo och getMatTyp
 * Interface VilkenMat implementeras
 */
public class Hund extends Djur implements CalculateMat {
    //private String matTyp="Hundfoder";
    Hund(){
        super.setMat(MatTyp.HUND.matType);
    }

    public Hund(String namn, double vikt) {
        super(namn, vikt);
        super.setMatvikt(this.calculatePortionFoder());
    }

@Override
    public double calculatePortionFoder(){
        return getVikt()*1000/MatTyp.HUND.matV;
    }

    /**
     * abstrakt metod foderInfo överskuggas (override)
     * fodInfo innehåller formler
     * som beräknar vikt från kg till gram och hur mycket mat varje hund ska få
     * visa namnet och  vikten på en portion foder
     * @return meddelande
     */
//    @Override
//    public String foderInfo(){
//        double foder=getVikt()*1000/100;
//        String meddelande="Hunden "+getNamn()+" ska få "+String.format("%.1f",foder)+ " g";
//        return meddelande;
//    }

    /**
     * En instansmetod osm hämtar hundarsmatstyp
     * @return matTyp
     */
//    public String getMatTyp() {
//        return matTyp;
//    }
}
