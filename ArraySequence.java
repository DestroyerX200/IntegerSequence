import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  private int currentIndex;
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
  	return data.length <= currentIndex && currentIndex <= data.length;
  }
  public int next() {
  	return 0;
  }
  public int length() {
  	return 0;
  }
  public void reset() {
  	
  }
}