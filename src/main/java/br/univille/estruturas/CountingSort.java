package br.univille.estruturas;

public class CountingSort {
  private static void countingSort(int[] vetor) {
    if (vetor == null || vetor.length <= 1) {
      return;
    }

    int min = vetor[0], max = vetor[0];
    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] < min) {
        min = vetor[i];
      } else if (vetor[i] > max) {
        max = vetor[i];
      }
    }

    int range = max - min + 1;

    int[] count = new int[range];

    // Contar a ocorrência de cada elemento
    for (int num : vetor) {
      count[num - min]++;
    }

    // Modificar o array de contagem para conter as posições reais
    for (int i = 1; i < range; i++) {
      count[i] += count[i - 1];
    }

    // Construir o array de saída
    int[] saida = new int[vetor.length];
    for (int i = vetor.length - 1; i >= 0; i--) {
      saida[count[vetor[i] - min] - 1] = vetor[i];
      count[vetor[i] - min]--;
    }

    // Copiar o array de saída de volta para o vetor original
    System.arraycopy(saida, 0, vetor, 0, vetor.length);
  }

  public static void countingSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    countingSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void countingSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    countingSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void countingSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    countingSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

}
