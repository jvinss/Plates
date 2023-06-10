package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> ingredienti = new ArrayList<>();
        ingredienti.add("Pasta");
        ingredienti.add("Sale");
        ingredienti.add("Olio");
        ingredienti.add("Acqua");

        First primo = new First("Pasta al pesto",
                "La pasta al pesto è un classico primo piatto che si prepara con il pesto di basilico. Piace davvero a tutti, grandi e piccini!",
                ingredienti,
                "Per preparare la pasta al pesto mettiamo subito a scaldare l’acqua per cuocere la pasta.\n" +
                        "\n" +
                        "Intanto laviamo e asciughiamo per bene il basilico con un canovaccio pulito.\n" +
                        "\n" +
                        "Mettiamo il basilico nel boccale del frullatore, aggiungiamo l’olio, il sale, l’aglio e i pinoli.\n" +
                        "\n" +
                        "Frulliamo a intermittenza per qualche secondo. In questo modo il pesto non si scalderà troppo, mantenendo il suo colore verde brillante.\n" +
                        "\n" +
                        "Aggiungiamo quindi il formaggio grattugiato e frulliamo ancora a intermittenza fino a ottenere la giusta consistenza.\n" +
                        "\n" +
                        "Scoliamo la pasta al dente e condiamola con abbondante pesto. La nostra pasta al pesto è pronta! Spolveriamola con del formaggio grattugiato e decoriamo con due foglie di basilico prima di servirla."
                );

        System.out.println(primo.getFullRecipe());

    }
}
