import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int reponse, quantite;
        double montant, Montant, tva, frais, fraisTOtal;
        String produit;


        System.out.println("Bienvenue dans le module de vente de produit pharmacetique !");

        System.out.println("Voulez-vous mettre un produit en vente ? (OUI/NON)");
        if (sc.nextLine().toLowerCase().equals("oui")) {

            System.out.println("Entrez le nom du produit");
            produit = sc.nextLine();
            if (produit.equals("")) {
                System.out.println("Nom de produit invalide ! Recommencer");
            }else{
                System.out.println("Entrez le montant par unité du produit ".concat(produit));
                montant = sc.nextDouble();

                System.out.println("Entrez la quantité de ".concat(produit).concat(" disponible"));
                quantite = sc.nextInt();

                System.out.println("Entrez le taux TVA du produit ".concat(produit));
                tva = sc.nextDouble();

                System.out.println("Entrez les frais eventuels qui s'appliquent au produit ".concat(produit).concat(". Saisir 0 si inexistant "));
                frais = sc.nextInt();

                fraisTOtal = ((frais + tva) * montant);
                Montant =(montant * quantite);


                System.out.println("Mise en vente en cours:");
                System.out.println("|\tnom de produit: \t|\t".concat(produit) + "\n" + '\n' + "|\tPrix unitaire: \t|\t"+ montant + "\n" + '\n' + "|\tTVA:\t|\t " + tva + "\n" + '\n' +"|\tautres frais: \t|\t" + frais + "\n" +
                                '\n' + "|\tfrais total: \t|\t" + fraisTOtal + "\n"+ '\n' + "|\tMontant total hors taxe: \t|\t" +Montant + "\n" + '\n' + "|\tMontant total facturer: \t|\t" +(Montant + fraisTOtal) + "\n");

                System.out.println("\nSaisir 1 pour confirmer");
                reponse = sc.nextInt();
                if (reponse == 1){
                    System.out.println("|\tnom de produit: \t|\t".concat(produit) + "\n" +
                            "|__________________________________________________________|" + '\n' +
                            "|\tPrix unitaire: \t|\t"+ montant + "\n" +
                            "|__________________________________________________________|" + '\n' +
                            "|\tTVA:\t|\t " + tva + "\n" +
                            "|__________________________________________________________|" + '\n' +
                            "|\tautres frais: \t|\t" + frais + "\n" +
                            "|__________________________________________________________|" + '\n' +
                            "|\tfrais total: \t|\t" + fraisTOtal + "\n" +
                            "|__________________________________________________________|" + '\n' +
                            "|\tMontant total hors taxe: \t|\t" +Montant + "\n" +
                            "|__________________________________________________________|" + '\n' +
                            "|\tMontant total facturer: \t|\t" +(Montant + fraisTOtal) + "\n" +
                            "|__________________________________________________________n\n" +
                            "|\t\t|\t Vente confirmer\t|\n"  +
                            "|__________________________________________________________|");
                    System.out.println("Veuillez vous assurer d'imprimer votre reçu");
                }else {
                    System.out.println("Vente abandonner");
                }
            }
        }
    }
}