package pres;

import dao.DaoImpl;
import metier.MetierImpl;



public class Presentation {
    public static void main(String[] args) {

        // Dependency injection using static initialization (the use of new)
        DaoImpl IDao = new DaoImpl();
        MetierImpl iMetier = new MetierImpl(IDao);
        iMetier.setDao(IDao);
        System.out.println(iMetier.calculation());
    }
}
