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

    /**
     * Default Konstruktor
     */
    Djur(){}

    /**
     * En konstruktor som har två patameter som
     * @param namn ska användas lägga namn t.ex.hundens namn--> Sixten
     * @param vikt kg
     */
    public Djur( String namn,double vikt){
        this.namn=namn;
        this.vikt=vikt;
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

    //Den här instansmetoden användas inte eftersom
    // public void calculatePortionFoder(){
    //     double foder=getVikt()*1000/100;
    //     System.out.println("Djuret " + getNamn()+" ska få "+String.format("%.1f",foder)+ " g " );
    //}

    /**
     * En abstraktmetod som har ingen implementering
     * metoden arvas till subklasser
     * @return maddelage
     */
    abstract public String foderInfo();
    //double foder=getVikt()*1000/100;
    //String meddelande="Djuret " + getNamn()+" ska få "+String.format("%.1f",foder)+ " g ";
    //return meddelande;
}
