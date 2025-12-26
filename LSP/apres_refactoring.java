

interface travail {
    void Tp_temps(){
    System.out.println("une personne peut travailler en plait temps peut importe les horaires");
  }
}

public class Personne implement travail{
    public void Tt_partiel () {
        System.out.println("une personne peut travailler en tempts patiel");
    }
}

public class Etudiant extend Personne {
    public void Tt_partiel () {
        System.out.println("une personne peut travailler en tempts patiel");
    }
}