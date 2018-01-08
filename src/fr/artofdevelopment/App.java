package fr.artofdevelopment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jprec on 18/02/2017.
 */
public class App {
    public static void main(String[] args) {

        Filiere[] filieres = new Filiere[3];

        filieres[0] = new Filiere("INFO", "Developpement");
        filieres[1] = new Filiere("INFO", "Cryptographie");
        filieres[2] = new Filiere("INFO", "Bdd");

        List<Etudiant> listEtudiant = new ArrayList<>();
        listEtudiant.add(new Etudiant("marc","dupont", new Date("01/01/1998"), filieres[0]));
        listEtudiant.add(new Etudiant("henri","durand", new Date("04/07/1995"), filieres[1]));
        listEtudiant.add(new Etudiant("joe","doo", new Date("02/08/1991"), filieres[2]));
        listEtudiant.add(new Etudiant("jimy","lo", new Date("01/10/1994"), filieres[0]));
        listEtudiant.add(new Etudiant("jean","henri", new Date("01/10/1997"), filieres[0]));

        for (Filiere f : filieres) {
            System.out.println(f);
            for (Etudiant e : listEtudiant) {
                if (e.getFiliere().getId() == f.getId()) {
                    System.out.println(e);
                }
            }
        }

    }
}
