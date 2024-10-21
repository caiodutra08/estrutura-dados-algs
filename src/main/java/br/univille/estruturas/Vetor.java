package br.univille.estruturas;

public class Vetor {
  private int[] vetor;

  public int[] generateVetor(int tamanho) {
    this.vetor = new int[tamanho];

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (int) (Math.random() * vetor.length);
    }

    return vetor;
  }

}
