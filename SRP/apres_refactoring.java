public class Etudiant {
 string nom;
 string matricule;
double mgp;

 public Etudiant(string nom, string matricule, doubl mgp) {
    this.nom = nom;
    this.matricule = matricule;
    this.mgp = mgp;
 }

 public double afficher_mgp() {
    return mgp;    
 } 

 public void tirer_la_fiche_de_preinscription() {
    System.out.println("la fiche de preinscription de l'etudiant "+ nom +"est le suivante");
 }

 public void afficher_les_info_de_etudiant() {
    System.out.println("Nom : "+ nom + "Matricule : "+ matricule +"");
 }
}