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

            System.out.println("-----------------------------------Facture-------------------------------------");
            System.out.println("Le montant brut|\t\t Le Taux de la TVA\t\t Le montant de la TVA|\t\t Le Net À Payer ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(mb +"\t|\t" +Ttva + "\t|\t" + mtTva +"\t|\t" + NAP);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Merci pour votre fidélité");
        } else if (choice==2) {
            System.out.println("Merci");
        }


    }
}
