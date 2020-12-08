import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  public int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
  	data = new int[other.length];
  	currentIndex = 0;
  	for (int i = 0; i < other.length; i++) {
  		data[i] = other[i];
  	}
  }
  public boolean hasNext() {
  	return 0 <= currentIndex && currentIndex < data.length;
  }
  public int next() {
  	if (hasNext()) {
  		currentIndex++;
  		return data[currentIndex - 1];
  	}
  	else {
  		throw new NoSuchElementException("IntegerSequence " + this + " does not contain an element at index " + currentIndex);
  	}
  }
  public int length() {
  	return data.length;
  }
  public void reset() {
  	currentIndex = 0;
  }
}