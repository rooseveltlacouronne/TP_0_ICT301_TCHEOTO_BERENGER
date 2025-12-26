interface Typechargeur {
    void charge();
}



public class Chargeur implement typechargeur {
    public void charge() {
    System.out.println("le chargeur fonctionne  ");
    }
}

public class Chargeur_itel implement typechargeur {
    public void charge() {
    System.out.println("le chargeur fonctionne  ");
    }
}

public class Chargeur_techno implement typechargeur {
    public void charge() {
    System.out.println("le chargeur fonctionne  ");
    }
}

public class Telephone {
public  Typechargeur typechargeur;

public Telephone(Typechargeur typechargeur) {
    this.typechargeur = typechargeur;
}

public void brancher{
    typechargeur.charge();
}

}