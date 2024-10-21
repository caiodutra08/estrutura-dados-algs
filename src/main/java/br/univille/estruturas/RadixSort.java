package br.univille.estruturas;

public class RadixSort {
  private static void radixSort(int[] vetor) {
    int n = vetor.length;
    int m = vetor[0];
    int exp = 1;
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      if (vetor[i] > m) {
        m = vetor[i];
      }
    }

    while (m / exp > 0) {
      int[] bucket = new int[10];

      for (int i = 0; i < n; i++) {
        bucket[(vetor[i] / exp) % 10]++;
      }

      for (int i = 1; i < 10; i++) {
        bucket[i] += bucket[i - 1];
      }

      for (int i = n - 1; i >= 0; i--) {
        b[--bucket[(vetor[i] / exp) % 10]] = vetor[i];
      }

      for (int i = 0; i < n; i++) {
        vetor[i] = b[i];
      }

      exp *= 10;
    }
  }

  public static void radixSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    radixSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void radixSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    radixSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void radixSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    radixSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }
}
