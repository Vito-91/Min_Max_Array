package Min_Max_Array;

public class Min_Max_Array {
    public static void main(String[] args) {

        // Array di numeri gia forniti.
        int[] numeri = {10, 5, 30, 2, 8};

        // Scelgo un riferimento iniziale reale (primo elemento dell'array)

        int min = numeri[0];
        int max = numeri[0];

        // Il ciclo parte da 1 perché l'indice 0 è già stato usato.
        for (int i = 1; i < numeri.length; i++) {

            // Se il numero corrente è più piccolo del minimo, aggiorno il minimo
            if (numeri[i] < min) {
                min = numeri[i];
            }
            // Se il numero corrente è più grande del massimo, aggiorno il massimo
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }
        // Stampo i risultati finali
        System.out.println("Minimo: " + min);
        System.out.println("Massimo: " + max);
    }
}
