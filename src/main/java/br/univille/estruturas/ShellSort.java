package br.univille.estruturas;

public class ShellSort {
  private static void shellSort(int[] vetor) {
    int n = vetor.length;
    int h = 1;
    int temp = 0;

    while (h < n) {
      h = 3 * h + 1;
    }

    h = h / 3;

    while (h > 0) {
      for (int i = h; i < n; i++) {
        temp = vetor[i];
        int j = i;
        while (j >= h && vetor[j - h] > temp) {
          vetor[j] = vetor[j - h];
          j = j - h;
        }
        vetor[j] = temp;
      }
      h = h / 2;
    }
  }

  public static void shellSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    shellSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void shellSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    shellSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void shellSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    shellSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }
}
