# Min_Max_Array
Dato un array di numeri interi, trovare e stampare il valore minimo e il valore massimo.

# RIFLESSIONE:
Ho un array di interi (int[]), quindi una lista di numeri già pronta.
Devo guardare tutti gli elementi, quindi userò un ciclo.

# STRUMENTI CHE USERÒ:
- int[] -> per contenere i numeri
- due variabili -> min e max
- ciclo for (o for-each) -> per scorrere l'array
- if -> per confrontare i valori
- .length -> per conoscere la lunghezza dell'array

# PROCEDIMENTO:

1) Inserisco dentro l'array i numeri da analizzare.

2) Uso numeri[0] come riferimento iniziale reale.
   min = numeri[0];
   max = numeri[0];

3) Il ciclo parte da indice 1
   perché l'indice 0 è già stato usato
   e confrontarlo con se stesso non serve.

   for (int i = 1; i < numeri.length; i++)

4) Per ogni numero mi faccio due domande:
   - È più piccolo del minimo?
     -> se sì, aggiorno min
   - È più grande del massimo?
     -> se sì, aggiorno max

5) Alla fine stampo min e max.
