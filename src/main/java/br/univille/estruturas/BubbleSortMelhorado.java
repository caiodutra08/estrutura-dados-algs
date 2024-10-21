package br.univille.estruturas;

public class BubbleSortMelhorado {
  private static void bubbleSortMelhorado(int[] vetor) {
    int n = vetor.length;

    for (int i = 0; i < n; i++) {
      boolean trocou = false;
      for (int j = 1; j < (n - i); j++) {
        if (vetor[j - 1] > vetor[j]) {
          int temp = vetor[j - 1];
          vetor[j - 1] = vetor[j];
          vetor[j] = temp;
          trocou = true;
        }
      }
      if (!trocou) {
        break;
      }
    }

  }

  public static void bubbleSortMelhorado10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    bubbleSortMelhorado(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void bubbleSortMelhorado50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    bubbleSortMelhorado(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void bubbleSortMelhorado100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    bubbleSortMelhorado(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

}
