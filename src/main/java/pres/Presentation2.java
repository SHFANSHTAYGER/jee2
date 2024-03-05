package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(new File("config.txt"));

        String classDaoName = scan.nextLine();
        Class<?> cDao = Class.forName(classDaoName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
        System.out.println(dao.getData());

        String classMetierName = scan.nextLine();
        Class<?> cMetier = Class.forName(classMetierName);
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();


        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier, dao);
        System.out.println(metier.calculation());
    }
}
