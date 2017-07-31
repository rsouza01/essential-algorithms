/**
 * 
 */
package exercises;

import tad.IntegerCell;

/**
 * @author rsouza
 *
 *
 *
 * The section “Adding Cells at the End” gives an O(N) algorithm for adding an item at the end of a singly linked list. 
 * If you keep another variable, bottom, that points to the last cell in the list, you can add items to the end of 
 * the list in O(1) time. Write such an algorithm. How does this complicate other algorithms that add an item at 
 * the beginning or end of the list, find an item, and remove an item? 
 * Write an algorithm for removing an item from this kind of list.
 * 
 */

public class Exercise1 implements Exercise
{

	public static int[] values = new int[]{31, 72, 47, 9};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise1 exercise = new Exercise1();
		exercise.run();
	}
	
	@Override
	public void run() {

		IntegerCell sentinel = new IntegerCell(); 
		
		IntegerCell currentCell = sentinel; 
		
		for(int i = 0; i < values.length; i++) {
			IntegerCell newCell = new IntegerCell(values[i]);
			currentCell.setNext(newCell);
			currentCell = newCell;
		}

		printList(sentinel);
		
		/** Tem que imprimir 47 */
		System.out.println(findCellByValue(sentinel, 72).getNext().getValue());
	}

	public void addCellAtTheEnd(IntegerCell top, IntegerCell newCell) {
		
		
	}

	public IntegerCell findCellByValue(IntegerCell top, int value) {
		
		if(top == null) return null;
		
		IntegerCell currentCell = top;

		while(currentCell != null) {
			if(currentCell.getValue() == value) {
				return currentCell;
			}
			currentCell = currentCell.getNext();
		}

		return null;
	}

	public void printList(IntegerCell sentinel) {
		
		IntegerCell currentCell = sentinel;

		while(currentCell.getNext() != null) {
			System.out.println(currentCell.getNext().getValue());
			currentCell = currentCell.getNext();
		}
	}
}
