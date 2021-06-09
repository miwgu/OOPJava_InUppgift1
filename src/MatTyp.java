/**
 * Created by Miwa Guhrés
 * Date: 08/06/2021
 * Time: 13:37
 * Project: Inlämningsuppgift1
 * Copyright: MIT
 */
public enum MatTyp {
    HUND(100,"Hundfoder"),
    KATT(150,"Kattfoder"),
    ORM(20,"Ormpellet");

    protected int matV;
    protected String matType;

    MatTyp(int matV, String matType){
        this.matV=matV;
        this.matType=matType;

    }
}
