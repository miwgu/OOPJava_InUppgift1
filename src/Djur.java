/**
 * Created by Miwa Guhrés
 * Date: 2020-09-28
 * Time: 10:08
 * Project: OOPJava
 * Copyright: MIT
 * <br><br>
 * Superklass Djur som definieras som en abstrakt klass
 * Inga objekt kan skapas av en abstrakt klass
 * Klassen har en anstrakt klass foderInfo
 */
abstract public class Djur {
    //instansvariabler
    private String namn;
    private double vikt; //användare ska skriva vikt i kg
    private  String mat; //mat kommer att väljas från Enum MatTyp
    private double matvikt; //matvikt kommer att väljas från Enum MatTyp

    /**
     * Default Konstruktor
     */
    Djur(){}

    /**
     * En konstruktor som har två patameter som
     * @param namn ska användas lägga namn t.ex.hundens namn--> Sixten
     * @param vikt kg
     */
    public Djur(String namn, double vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }
    /**
     * En instansmethod som hämtar namn
     * @return namn t.ex Sixten
     */
    public String getNamn() {
        return namn;
    }

    /**
     * En instansmetod som hämtar vikt(kg)
     * @return vikt
     */
    public double getVikt() {
        return vikt;
    }
    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public double getMatvikt() {
        return matvikt;
    }

    public void setMatvikt(double matvikt) {
        this.matvikt = matvikt;
    }


    /**
     * En abstraktmetod som har ingen implementering
     * metoden arvas till subklasser
     * @return maddelage
     */
    public String foderInfo(){
     String message = getNamn() + " ska få " + String.format("%.1f",getMatvikt())+" g" ;
     return message;
    }
    //double foder=getVikt()*1000/100;
    //String meddelande="Djuret " + getNamn()+" ska få "+String.format("%.1f",foder)+ " g ";
    //return meddelande;
}
