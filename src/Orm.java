/**
 * Created by Miwa Guhrés
 * Date: 2020-09-28
 * Time: 10:08
 * Project: OOPJava
 * Copyright: MIT
 * <br><br>
 * En subklass Orm som arvar Abstaraktklassen Djur(superklass)
 * Har två instansmetoder, foderainfo och getMatTyp
 * Interface VilkenMat implementeras
 */
public class Orm extends Djur implements CalculateMat {
    //private String matTyp="Ormpellets";
    Orm(){
        super.setMat(MatTyp.ORM.matType);
    }
    public Orm(String namn, double vikt) {

        super(namn, vikt);
        super.setMat(MatTyp.ORM.matType);
        super.setMatvikt(this.calculatePortionFoder());
    }


    public double calculatePortionFoder() {
       return MatTyp.ORM.matV;
    }
    /**
     * Abstaraktklassen Djur arvas
     * abstrakt metod foderInfo överskuggas (override)
     * fodInfo innehåller information (oberoende av vikt)
     * som hur mycket mat varje orm ska få
     * visa namnet och  vikten på en portion 2og ormpellets
     * @return meddelande
     */
//    @Override
//    public String foderInfo() {
//        double foder = 20.0;
//        String meddelande = "Ormen "+getNamn() + " ska få " + String.format("%.1f",foder) + " g";
//        return meddelande;
//    }
    /**
     * En instansmetod osm hämtar ormarssmatstyp
     * Interface VilkenMat överskuggas(override)
     * @return matTyp
     */
//    @Override
//    public String getMatTyp() {
//        return matTyp;
//    }
}
