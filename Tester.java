public class Tester {
	public static void main(String[] args) {
	    IntegerSequence r = new Range(10,15);
	    System.out.println(r.length());
	    while(r.hasNext()){
	      System.out.print(r.next());
	      if(r.hasNext() ){       
	         System.out.print( ", " );
	      }
	    }
	    System.out.println();
	    // r.next();
	    
	    r.reset();

	    while(r.hasNext()){
	      System.out.print(r.next());
	      if(r.hasNext() ){       
	         System.out.print( ", " );
	      }
	    }
	    System.out.println();
	    r.next(); // should throw NoSuchElementException error
	}
}