package br.univille.estruturas;

public class HeapSort {
  private static void heapSort(int[] vetor) {
    int n = vetor.length;

    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(vetor, n, i);
    }

    for (int i = n - 1; i > 0; i--) {
      int temp = vetor[0];
      vetor[0] = vetor[i];
      vetor[i] = temp;

      heapify(vetor, i, 0);
    }
  }

  private static void heapify(int[] vetor, int n, int i) {
    int maior = i;
    int esquerda = 2 * i + 1;
    int direita = 2 * i + 2;

    if (esquerda < n && vetor[esquerda] > vetor[maior]) {
      maior = esquerda;
    }

    if (direita < n && vetor[direita] > vetor[maior]) {
      maior = direita;
    }

    if (maior != i) {
      int temp = vetor[i];
      vetor[i] = vetor[maior];
      vetor[maior] = temp;

      heapify(vetor, n, maior);
    }
  }

  public static void heapSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    heapSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void heapSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    heapSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void heapSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    heapSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

}
