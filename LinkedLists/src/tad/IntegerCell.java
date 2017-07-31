package tad;

public class IntegerCell {
	
	private int value = 0;
	private IntegerCell next = null;
	private IntegerCell previous = null;
	
	public IntegerCell getPrevious() {
		return previous;
	}

	public void setPrevious(IntegerCell previous) {
		this.previous = previous;
	}

	public IntegerCell() { }
	
	public IntegerCell(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public IntegerCell getNext() {
		return next;
	}
	public void setNext(IntegerCell next) {
		this.next = next;
	}
	
	
}