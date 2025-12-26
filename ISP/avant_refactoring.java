interface travail {
    void suivre_cour();
  void enseigner();
}

public class etudiant implement travail {
    public void suivre_cour(){
        System.out.println("l'eudiant peut suivre un cour");
    } 

    public void enseigner(){
        thow new UnsupportedOperationException("l'eudiant un etudiant une peut pas enseigner");
    }
}