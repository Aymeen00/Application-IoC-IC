package pres;

import dao.CalculV1;
import metier.Gestion;

public class InstanciationStatique {
    public static void main(String[] args) throws Exception
    {
        Gestion gestion = new Gestion();
        CalculV1 cal =new CalculV1();
        gestion.setCal(cal);
        System.out.println(gestion.calcul());
    }
}
