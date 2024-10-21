package br.univille.estruturas;

public class MergeSort {
  private static void mergeSort(int[] vetor, int inicio, int fim) {
    if (inicio < fim) {
      int meio = (inicio + fim) / 2;
      mergeSort(vetor, inicio, meio);
      mergeSort(vetor, meio + 1, fim);
      merge(vetor, inicio, meio, fim);
    }
  }

  private static void merge(int[] vetor, int inicio, int meio, int fim) {
    int n1 = meio - inicio + 1;
    int n2 = fim - meio;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) {
      L[i] = vetor[inicio + i];
    }

    for (int j = 0; j < n2; j++) {
      R[j] = vetor[meio + 1 + j];
    }

    int i = 0, j = 0;
    int k = inicio;

    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        vetor[k] = L[i];
        i++;
      } else {
        vetor[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      vetor[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      vetor[k] = R[j];
      j++;
      k++;
    }
  }

  public static void mergeSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    mergeSort(vetor, 0, vetor.length - 1);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void mergeSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    mergeSort(vetor, 0, vetor.length - 1);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void mergeSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    mergeSort(vetor, 0, vetor.length - 1);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }
}
