import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miwa Guhrés
 * Date: 2020-09-28
 * Time: 11:29
 * Project: OOPJava
 * Copyright: MIT
 * <br><br>
 * Husdjurshotellet HealtyPets
 * alla djur blir matade med hotellets eget
 * hemlagade djurfoder, i portioner där portionsstorlekarna är noga uträknade för att passa djurens
 * behov.
 * Användare: Dietcoach
 * Översikt:
 * Mata in djurets namn(t.ex. Hund)
 * Visa meddelande hur mycket mat varje djur ska få och vilken sort mat ska sarveras
 * Detaljer:
 * En meddelande-ruta dyker upp på skärmen med texten ”Vilket djur ska få mat?” och en tom rad
 * under. Dietcoachen fyller i djurets namn på tomma raden
 * programmet visar information (en ny ruta eller konsol)
 * Information: står hur många gram mat djuret ska få
 * samt vilken sorts mat (kattfoder, hundfoder eller ormpellets) som ska serveras
 * Implementera nödvändiga felkontroller.
 * Krav:
 * Det ska innehålla minst ett arv och minst ett interface, implementerade  på ett relevant sätt
 */
public class HealthyPetsDemo {
    // Metoden användas inte (ibörjan jag tänkte att skapa Interface Printable)
    //public void printViaInterface(Printable whatever) {
    //      whatever.calculatePortionFoder();
    //}

    // Metoden printMat genom att inplementera interface VilkenMat
    public void printMat(VilkenMat whatever){
        System.out.println("Mat: " +whatever.getMatTyp());
    }

    HealthyPetsDemo() {
        //         Djur[] alladjur = {
        //         new Hund("Sixten", 5),
        //         new Hund("Dogge", 10),
        //         new Katt("Venus", 5),
        //         new Katt("Ove", 3),
        //         new Orm("Hypo", 1)
        // };

        //TEST Print alladjurs fodinformation
        //for(Djur d: alladjur){
        //    printViaInterface(d);
        //}

        //Skapa Objekt (verje klassens konstruktorer instanseras)
        // t.ex. Hund klass har namn och vikt i klassfield
        Hund Sixten = new Hund("Sixten", 5);
        Hund Dogge = new Hund("Dogge", 10);
        Katt Venus = new Katt("Venus", 5);
        Katt Ove = new Katt("Ove", 3);
        Orm Hypo = new Orm("Hypo", 1);
        //För att implementera interface VikenMat skapar tre olika objekt
        Hund h=new Hund();
        Katt k=new Katt();
        Orm o=new Orm();

        //printViaInterface(Sixten);

        VilketDjur Hund= new VilketDjur("Hund");
        VilketDjur Katt= new VilketDjur("Katt");
        VilketDjur Orm= new VilketDjur("Orm");

        //List <Djur> alladjur =new ArrayList<>();

        Kund g1= new Kund(Hund, Sixten);
        Kund g2= new Kund(Hund,Dogge);
        Kund g3= new Kund(Katt,Venus);
        Kund g4= new Kund(Katt,Ove);
        Kund g5= new Kund(Orm,Hypo);

        List<Kund> kunder =new ArrayList();
        kunder.add(g1);
        kunder.add(g2);
        kunder.add(g3);
        kunder.add(g4);
        kunder.add(g5);

        String djuretsnamn = JOptionPane.showInputDialog("Vilket djur ska få mat?\n t.ex. Hund");
//Testcode
//String djuretsnamn=KATT;

        while (true) {
            //String djuretsnamn = JOptionPane.showInputDialog("Vilket djur ska få mat?\n t.ex. Hund");

            if (djuretsnamn==null) {
                JOptionPane.showMessageDialog(null, "Avsluta att mata in djurets namn");
                System.out.println("Avsluta att mata in djurets namn.");
                System.exit(0);
                // djuretsnamn = JOptionPane.showInputDialog("Ange djurets namn");
            } else if (djuretsnamn.isEmpty()) {  //när strängen är tom returnerar den true
                System.out.println("Fel! Uttrycket får inte vara tomt.");
                djuretsnamn = JOptionPane.showInputDialog("Fel! Uttrycket får inte vara tomt.\nAnge djurets namn");
                continue;

            } else {

                String input = djuretsnamn.toLowerCase(); //metoden för skiftlägeskonvertering från Stora bokstaver till små bokstäver
                if(input.equals("hund")) {
                    System.out.println(djurSort.Hund);
                    printMat(h);
                    printKunder(Hund, kunder);
                }else if(input.equals("katt")) {
                    System.out.println(djurSort.Katt);
                    printMat(k);
                    printKunder(Katt, kunder);
                }else if(input.equals("orm")){
                    System.out.println(djurSort.Orm);
                    printMat(o);
                    printKunder(Orm, kunder);
                } else{
                    System.out.println("Fel! Det finns inte sådant namn");
                    djuretsnamn = JOptionPane.showInputDialog("Fel! Det finns inte sådant namn.\nAnge djurets namn");
                    continue;}

            }
            System.exit(0);
        }
    }

    public enum djurSort{
        Hund,
        Katt,
        Orm,
    }
    public void printKunder(VilketDjur vilketDjur, List<Kund> kunder){
        //System.out.println("Djurets namn: "+ vilketDjur.getNamn());
        for(Kund k: kunder){
            if (k.getVilketdjur()== vilketDjur )
                System.out.println(k.getDjur().foderInfo());
        }
    }

    public static void main(String[] args) {
        HealthyPetsDemo test=new HealthyPetsDemo();

    }

}
