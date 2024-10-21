package br.univille.estruturas;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
  private static void bucketSort(int[] vetor) {
    int n = vetor.length;

    int maxVal = vetor[0], minVal = vetor[0];
    for (int i = 1; i < n; i++) {
      if (vetor[i] > maxVal)
        maxVal = vetor[i];
      if (vetor[i] < minVal)
        minVal = vetor[i];
    }

    int range = (maxVal - minVal) / n + 1;

    ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      buckets.add(new ArrayList<>());
    }

    for (int i = 0; i < n; i++) {
      int bucketIndex = (vetor[i] - minVal) / range;
      buckets.get(bucketIndex).add(vetor[i]);
    }

    int index = 0;
    for (ArrayList<Integer> bucket : buckets) {
      Collections.sort(bucket);
      for (int value : bucket) {
        vetor[index++] = value;
      }
    }
  }

  public static void bucketSort10000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(10000);

    long inicio = System.currentTimeMillis();

    bucketSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void bucketSort50000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(50000);

    long inicio = System.currentTimeMillis();

    bucketSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }

  public static void bucketSort100000() {
    Vetor vetorClass = new Vetor();
    int[] vetor = vetorClass.generateVetor(100000);

    long inicio = System.currentTimeMillis();

    bucketSort(vetor);

    long fim = System.currentTimeMillis();

    System.out.println("Tempo em milisegundos: " + (fim - inicio));

    // System.out.println("Vetor ordenado");
    // for (int i = 0; i < vetor.length; i++) {
    //   System.out.println(vetor[i]);
    // }

  }
}
