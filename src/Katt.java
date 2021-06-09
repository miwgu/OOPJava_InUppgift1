/**
 * Created by Miwa Guhrés
 * Date: 2020-09-28
 * Time: 10:08
 * Project: OOPJava
 * Copyright: MIT
 *  <br><br>
 *  En subklass Katt som arvar Abstaraktklassen Djur(superklass)
 *  Har två instansmetoder, foderainfo och getMatTyp
 *  Interface VilkenMat implementeras
 */
public class Katt extends Djur implements CalculateMat {
    //private String matTyp="Kattfoder";
    Katt(){
        super.setMat(MatTyp.KATT.matType);
    }
    public Katt(String namn, double vikt) {

        super(namn, vikt);
    }

    public double calculatePortionFoder() {
        return getVikt()*1000/MatTyp.KATT.matV;
    }
    /**
     * Abstaraktklassen Djur arvas
     * abstrakt metod foderInfo överskuggas override
     * fodInfo innehåller formler
     * som beräknar vikt från kg till gram och hur mycket mat varje katt ska få
     * visa namnet och  vikten på en portion foder
     * @return meddelande
     */
//    @Override
//    public String foderInfo() {
//        double foder = getVikt() * 1000 / 150;
//        String meddelande = "Katten " + getNamn() + " ska få " + String.format("%.1f", foder) + " g";
//        return meddelande;
//    }
    /**
     * En instansmetod osm hämtar kattersmatstyp
     * @return matTyp
     */
//    public String getMatTyp() {
//        return matTyp;
//    }
}