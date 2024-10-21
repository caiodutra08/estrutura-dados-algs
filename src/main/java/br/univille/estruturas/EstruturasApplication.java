package br.univille.estruturas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstruturasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstruturasApplication.class, args);

		System.out.println("=====================================");
		System.out.println("BubbleSort");

		BubbleSort.bubbleSort10000();
		BubbleSort.bubbleSort50000();
		BubbleSort.bubbleSort100000();

		System.out.println("=====================================");
		System.out.println("BubbleSortMelhorado");

		BubbleSortMelhorado.bubbleSortMelhorado10000();
		BubbleSortMelhorado.bubbleSortMelhorado50000();
		BubbleSortMelhorado.bubbleSortMelhorado100000();

		System.out.println("=====================================");
		System.out.println("QuickSort");

		QuickSort.quickSort10000();
		QuickSort.quickSort50000();
		QuickSort.quickSort100000();

		System.out.println("=====================================");
		System.out.println("InsertionSort");

		InsertionSort.insertionSort10000();
		InsertionSort.insertionSort50000();
		InsertionSort.insertionSort100000();

		System.out.println("=====================================");
		System.out.println("ShellSort");

		ShellSort.shellSort10000();
		ShellSort.shellSort50000();
		ShellSort.shellSort100000();

		System.out.println("=====================================");
		System.out.println("SelectionSort");

		SelectionSort.selectionSort10000();
		SelectionSort.selectionSort50000();
		SelectionSort.selectionSort100000();

		System.out.println("=====================================");
		System.out.println("HeapSort");

		HeapSort.heapSort10000();
		HeapSort.heapSort50000();
		HeapSort.heapSort100000();

		System.out.println("=====================================");
		System.out.println("MergeSort");

		MergeSort.mergeSort10000();
		MergeSort.mergeSort50000();
		MergeSort.mergeSort100000();

		System.out.println("=====================================");
		System.out.println("RadixSort");

		RadixSort.radixSort10000();
		RadixSort.radixSort50000();
		RadixSort.radixSort100000();

		System.out.println("=====================================");
		System.out.println("CountingSort");

		CountingSort.countingSort10000();
		CountingSort.countingSort50000();
		CountingSort.countingSort100000();

		System.out.println("=====================================");
		System.out.println("BucketSort");

		BucketSort.bucketSort10000();
		BucketSort.bucketSort50000();
		BucketSort.bucketSort100000();

		System.out.println("=====================================");

	}
}
