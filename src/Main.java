
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

	public static void DVL() {
		final long timeStart = System.currentTimeMillis();
		DoppeltVerketteteListe list = new DoppeltVerketteteListe(new ListElement(1), new ListElement(2));  
    	for(int i = 0; i <= 100000; i++) {
			list.addLast(new ListElement(i));
    	}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Zeit die bei der DVL für das anlegen 100000 Elemente benötigt wird: " + (timeEnd - timeStart) + " ms");  
        list.addFirst(new ListElement(0));
        
        final long timeStart1 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			list.deleteElem(i);
		}
		final long timeEnd1 = System.currentTimeMillis();
		System.out.println("Zeit die bei der DVL für das löschen von 50000 Elemente benötigt wird: " + (timeEnd1 - timeStart1) + " ms");  

		final long timeStart2 = System.nanoTime();
		list.length();
		list.swap(678,345);
		list.addFirst(new ListElement(0));
		list.addLast(new ListElement(1024545));
		final long timeEnd2 = System.nanoTime();
		System.out.println("Zeit die bei der DVL für weitere Methoden benötigt wird:" + (timeEnd2 - timeStart2) + " ns");  
    	
    	//list.writeList();
        //System.out.println("Länge der Liste: " +list.length());

	}
	
	
	public static void LL() {
		 final long timeStart = System.currentTimeMillis();
		 LinkedList<String> object = new LinkedList<String>(); 
		 for(int i = 0; i <= 100000; i++) {
			 object.add("i");
		 }
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Zeit die bei der LL für das anlegen 100000 Elemente benötigt wird: " + (timeEnd - timeStart) + " ms");  
	     object.addLast("3"); 
	     object.addFirst("4"); 
	    
	    final long timeStart1 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object.remove(i);
		}
		final long timeEnd1 = System.currentTimeMillis();
		System.out.println("Zeit die bei der LL für das löschen von 50000 Elemente benötigt wird: " + (timeEnd1 - timeStart1) + " ms");  

		final long timeStart2 = System.nanoTime();
		object.size();
		object.removeFirst(); 
	    object.removeLast(); 
	    object.set(1, "25"); 
		final long timeEnd2 = System.nanoTime();
		System.out.println("Zeit die bei der LL für weitere Methoden benötigt wird: " + (timeEnd2 - timeStart2) + " ns");  


	}
	
	public static void AL() {
		final long timeStart = System.currentTimeMillis();
		ArrayList<Integer> object1 = new ArrayList<Integer>();
		for(int i = 0; i <= 100000; i++) {
			object1.add(i);
		}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Zeit die bei der AL für das anlegen von 100000 Elemente benötigt wird: " + (timeEnd - timeStart) + " ms");  
	
		final long timeStart1 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object1.remove(i);
		}
		final long timeEnd1 = System.currentTimeMillis();
		System.out.println("Zeit die bei der AL für das löschen von 50000 Elemente benötigt wird: " + (timeEnd1 - timeStart1) + " ms");  

		final long timeStart2 = System.nanoTime();
		object1.size();
		object1.isEmpty();
		final long timeEnd2 = System.nanoTime();
		System.out.println("Zeit die bei der AL für weitere Methoden benötigt wird: " + (timeEnd2 - timeStart2) + " ns");  
			
	}
	
	public static void main(String[] args) {
		DVL();
		System.out.println("");
		LL();
		System.out.println("");
		AL();

	}

}
