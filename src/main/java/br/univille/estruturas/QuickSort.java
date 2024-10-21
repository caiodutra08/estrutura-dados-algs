package br.univille.estruturas;

public class QuickSort {
  private static void quickSort(int[] vetor, int inicio, int fim) {
    if (inicio < fim) {
      int posicaoPivo = separar(vetor, inicio, fim);
      quickSort(vetor, inicio, posicaoPivo - 1);
      quickSort(vetor, posicaoPivo + 1, fim);
    }
  }

  private static int separar(int[] vetor, int inicio, int fim) {
    int pivo = vetor[inicio];
    int i = inicio + 1, f = fim;
    while (i <= f) {
      if (vetor[i] <= pivo) {
        i++;
      } else if (pivo < vetor[f]) {
        f--;
      } else {
        int troca = vetor[i];
        vetor[i] = vetor[f];
        vetor[f] = troca;
        i++;
        f--;
      }
    }
    vetor[inicio] = vetor[f];
    vetor[f] = pivo;
    return f;
  }

  public static void quickSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    quickSort(vetor, 0, vetor.length - 1);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void quickSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    quickSort(vetor, 0, vetor.length - 1);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void quickSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass
        .generateVetor(100000);

    long inicio = System.currentTimeMillis();

    quickSort(vetor, 0, vetor.length - 1);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

}
