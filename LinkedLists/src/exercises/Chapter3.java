/**
 * 
 */
package exercises;

import tad.IntegerCell;

/**
 * @author rsouza
 *
 * 
 */

public class Chapter3 implements Chapter
{

	public static int[] values = new int[]{31, 72, 47, 9};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chapter3 exercise = new Chapter3();
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

		System.out.println("printList");
		printList(sentinel);
		
		/** Tem que imprimir 47 */
		System.out.println("findCellByValue");
		System.out.println(findCellByValue(sentinel, 72).getNext().getValue());
		
		System.out.println("addCellAtTheBeginning");
		addCellAtTheBeginning(sentinel, 66);

		System.out.println("printList");
		printList(sentinel);

		System.out.println("addCellAtTheEnd");
		addCellAtTheEnd(sentinel, 666);

		System.out.println("printList");
		printList(sentinel);

	}

	public IntegerCell deleteCellByValye(IntegerCell sentinel, int newValue) {
		
		return null;
	}
	
	public void addCellAtTheBeginning(IntegerCell sentinel, int newValue) {
		
		addCellAtTheBeginning(sentinel, new IntegerCell(newValue));
	}
	
	public void addCellAtTheBeginning(IntegerCell sentinel, IntegerCell newCell) {
		
		newCell.setNext(sentinel.getNext());
		sentinel.setNext(newCell);
	}

	public void addCellAtTheEnd(IntegerCell sentinel, int newValue) {
		addCellAtTheEnd(sentinel, new IntegerCell(newValue));
	}

	public void addCellAtTheEnd(IntegerCell sentinel, IntegerCell newCell) {
		
		IntegerCell currentCell = sentinel;

		while(currentCell.getNext() != null) {
			currentCell = currentCell.getNext();
		}
		
		currentCell.setNext(newCell);
	}
	
	
	public IntegerCell findCellByValue(IntegerCell sentinel, int value) {
		
		IntegerCell currentCell = sentinel;

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
