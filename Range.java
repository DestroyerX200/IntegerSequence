import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
  private int start,end,current;
  public Range(int start, int end) {
  	this.start = start;
  	this.end = end;
  	this.current = start;
  }
  public void reset() {
  	current = start;
  }
  public int length() {
  	return end - start + 1;
  }
  public boolean hasNext() {
  	return start <= current && current <= end;
  }

  //@throws NoSuchElementException
  public int next() {
  	if (hasNext()) {
  		current++;
  		return current - 1;
  	}
  	else {
  		throw new NoSuchElementException("IntegerSequence " + this + "does not contain " + current);
  	}
  }
  
}