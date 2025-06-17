import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("BIENVENUE À LA PHARMACIE 2000");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quels produits souhaiterai vous achetez :");
            String produit = scanner .nextLine();

        System.out.print("Le prix est:" );
            double prix = scanner.nextDouble();

        System.out.print("Quantité a achetée :");
            int qté = scanner.nextInt();


            String TVA = "18%";
            String Ttva = scanner.nextLine();

        do {
            System.out.print("Taux de la TVA :");
            Ttva = scanner.nextLine();
        }while (!Ttva.equals(TVA));

        System.out.print("Autres taux :");
            double A_taux = scanner.nextDouble();


        System.out.println("Comfirmez votre achats :");
        System.out.println("1. Valider");
        System.out.println("2. Annuler");

        int choice = scanner.nextInt();

        if (choice==1){
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            double mb = prix * qté;
            System.out.println("Le montant brut est :" +mb);

            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            double mtTva = mb * 18/100;
            System.out.println("Le montant de la TVA est :" +mtTva);

            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

            double NAP = mb + mtTva;
            System.out.println("Le Net À Payer est :" +NAP);
            System.out.println("------------------------------------------------");
            System.out.println("                       FACTURE                       ");
            System.out.println("------------------------------------------------");
            System.out.println("|Le Montant brut           |         " +mb);
            System.out.println("------------------------------------------------");
            System.out.println("|Le taux de la TVA         |         " +Ttva);
            System.out.println("------------------------------------------------");
            System.out.println("|Le Montant de la TVA      |         " +mtTva );
            System.out.println("------------------------------------------------");
            System.out.println("|Le montant total          |         " +NAP );
            System.out.println("------------------------------------------------");
        } else if (choice==2) {
            System.out.println("Merci");
        }


    }
}
