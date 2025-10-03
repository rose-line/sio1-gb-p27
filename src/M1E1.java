public class M1E1 {
  public static void main(String[] args) throws Exception {
    // Récupérer nom1

    // Initialisation du Scanner pour le clavier
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez un nom commun : ");
    String nom1 = clavier.next();

    // Récupérer nombre
    System.out.print("Entrez un nomnre : ");
    int nombre = clavier.nextInt();

    // Récupérer nom2
    System.out.print("Entrez un nom commun : ");
    String nom2 = clavier.next();

    // Récupérer adjectif
    System.out.print("Entrez un adjectif : ");
    String adjectif = clavier.next();

    clavier.close();

    // Afficher la phrase résultante
    System.out.println("Il était une fois un " + nom1 + " qui avait " + nombre + " " + nom2
        + ". Cela le rendait très " + adjectif + ".");
  }
}
