package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The implementation of the algorithm must be in-place!
 */
public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		int posicao = leftIndex + 1;
		while(posicao <= rightIndex) {
			if(array[posicao].compareTo(array[posicao -1]) >= 0 ) {
				posicao ++;
			}
			else {
				Util.swap(array, posicao, posicao -1);
				
				if(posicao > leftIndex + 1) {
					posicao --;
					
				}
				else {
					posicao ++;
				}
			}
		}
	}
}
