interface cour {
    void suivre_cour();
}

interface Td {
  void enseigner();
}

public class etudiant implement cour {
    public void suivre_cour(){
        System.out.println("l'etudiant peut suivre un cour");
    } 

    
}

public class charge_td implement cour, Td {
    public void suivre_cour(){
        System.out.println("le charger de Td  peut suivre un cour il a deux fonction");
    } 

    public void enseigner(){
        System.out.println("le charger de Td peut enseigner il a deux fonction");
    }
}