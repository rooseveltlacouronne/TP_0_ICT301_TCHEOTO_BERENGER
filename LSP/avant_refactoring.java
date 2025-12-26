public class Personne {
  void Tp_temps(){
    System.out.println("une personne peut travailler en plait temps peut importe les horaires");
  }

  public void Tt_partiel () {
        System.out.println("une personne peut travailler en tempts patiel");
    }
}

public class Etudiant extend Personne {
    public void Tp_temps(){
        thow new UnsupportedOperationException("un tudiant ne peut pas travailler en plein temps");
    }

    public void Tt_partiel () {
        System.out.println("une personne peut travailler en tempts patiel");
    }
}
