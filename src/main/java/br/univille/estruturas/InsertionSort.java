package br.univille.estruturas;

public class InsertionSort {
  private static void insertionSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 1; i < n; i++) {
      int key = vetor[i];
      int j = i - 1;

      while (j >= 0 && vetor[j] > key) {
        vetor[j + 1] = vetor[j];
        j = j - 1;
      }
      vetor[j + 1] = key;
    }
  }

  public static void insertionSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    insertionSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void insertionSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    insertionSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void insertionSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    insertionSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }
}
