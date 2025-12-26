interface Universite {
    void departement(String nom, double nombre );
}

public class informatique implement Universite {
    void departement(double nombre ){
System.out.println("le nombre d'etudiant de ce departement est : "+ nombre);
}
} 

public class mathemetique implement Universite {
    void departement(double nombre ){
System.out.println("le nombre d'etudiant de ce departement est : "+ nombre);
}
} 

public class geographie implement Universite {
    void departement(double nombre ){
System.out.println("le nombre d'etudiant de ce departement est : "+ nombre);
}
} 

public class Recteur {
    Universite universite;

   public Recteur (Universite universite) {
    this.universite = universite;
   }

   public void creer_depart( double nombre) {
    universite.departement(nombre);
   }

}