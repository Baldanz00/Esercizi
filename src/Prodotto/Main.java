package Prodotto;

public class Main {

    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Computer", 10);
        Prodotto p2 = new Prodotto("Cuffie", 0);
        Prodotto p3 = new Prodotto("Tastiera", 0);
    
    
        System.out.println("Numero di prodotti creati : " + Prodotto.getNumeroProdottiCreati());
        p1.infoProdotto();
        p2.infoProdotto();
        p3.infoProdotto();
    }

}
