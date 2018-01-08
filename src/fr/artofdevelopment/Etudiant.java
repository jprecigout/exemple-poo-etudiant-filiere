package fr.artofdevelopment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Filiere filiere;

    private static int count;

    public Etudiant(String nom, String prenom, Date dateNaissance,
                    Filiere filiere) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Etudiant " + this.nom + " " + this.prenom
                + " Date de naissance : "
                + sdf.format(this.dateNaissance);
    }

}
