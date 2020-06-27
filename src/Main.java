
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	public static void DVL() {
        
		DoppeltVerketteteListe list = new DoppeltVerketteteListe(new ListElement(1), new ListElement(2)); 
		final long timeStart2 = System.currentTimeMillis();
    	for(int i = 0; i <= 1000000; i++) {
			list.addLast(new ListElement(i));
    	}
		final long timeEnd2 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Einfügen an letzter Stelle  |" + (timeEnd2 - timeStart2) + " ms       |     O(1)");  
		
		final long timeStart1 = System.currentTimeMillis(); 
    	for(int i = 0; i <= 1000000; i++) {
			list.addFirst(new ListElement(i));
    	}
		final long timeEnd1 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Einfügen an erster Stelle     |" + (timeEnd1 - timeStart1) + " ms       |     O(1)");  
		
		
		final long timeStart = System.currentTimeMillis();
    	for(int i = 0; i <= 10; i++) {
			list.add(i,i);
    	}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Einfügen an beliebiger Stelle    |" + (timeEnd - timeStart) + " ms       |     O(1)");  
		
		final long timeStart4 = System.currentTimeMillis();
    	for (int i = 0; i < 100; i++) {
			list.deleteFirst();
    	}
		final long timeEnd4 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Löschen an erster Stelle     |" + (timeEnd4 - timeStart4) + " ms       |     O(1)");  
		
		final long timeStart5 = System.currentTimeMillis();
    	for (int i = 0; i < -100; i--) {
			list.deleteLast();
		}
		final long timeEnd5 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Löschen an letzter Stelle  |" + (timeEnd5 - timeStart5) + " ms       |     O(1)");  
		
		
        final long timeStart3 = System.currentTimeMillis();
		for(int i = 0; i <= 100; i++) {
			list.deleteElem(i);
		}
		final long timeEnd3 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Löschen an beliebiger Stelle    |" + (timeEnd3 - timeStart3) + " ms   |     O(n)");  

		final long timeStart7 = System.currentTimeMillis();
			for(int i = 0; i <= 50000; i++) {
				list.swap(i, i+2);
			}
		final long timeEnd7 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Vertauschen von Elementen    |" + (timeEnd7 - timeStart7) + " ms   |     O(n)");  
		
		final long timeStart6 = System.currentTimeMillis();
			for(int i = 0; i <= 100; i++) {
				list.length();
			}
		final long timeEnd6 = System.currentTimeMillis();
		System.out.println("   DVL 	  |      Länge Messen    |" + (timeEnd6 - timeStart6) + " ms   |     O(n)");  
	}
	
	
	public static void LL() {
		final long timeStart1 = System.currentTimeMillis();
		LinkedList<String> object = new LinkedList<String>(); 
    	for(int i = 0; i <= 1000000; i++) {
			object.addFirst("i");
    	}
		final long timeEnd1 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Einfügen an erster Stelle    |" + (timeEnd1 - timeStart1) + " ms       |     O(1)");  
		
		final long timeStart2 = System.currentTimeMillis();
    	for(int i = 0; i <= 1000000; i++) {
			object.addLast("i");
    	}
		final long timeEnd2 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Einfügen an letzter Stelle    |" + (timeEnd2 - timeStart2) + " ms       |     O(1)");  
		
		final long timeStart = System.currentTimeMillis();
		for(int i = 0; i <= 1000000; i++) {
			object.add("i");
		}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("   LL 	  |      Einfügen an beliebiger Stelle    |" + (timeEnd - timeStart) + " ms       |     O(1)");  
	    
		final long timeStart4 = System.currentTimeMillis();
    	for(int i = 0; i <= 100000; i++) {
			object.removeFirst();
    	}
		final long timeEnd4 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Löschen an erster Stelle     |" + (timeEnd4 - timeStart4) + " ms       |     O(1)");  
		
		final long timeStart5 = System.currentTimeMillis();
    	for(int i = 0; i <= 100000; i++) {
			object.removeLast();
    	}
		final long timeEnd5 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Löschen an letzter Stelle  |" + (timeEnd5 - timeStart5) + " ms       |     O(1)");  
			
	    final long timeStart3 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object.remove(i);
		}
		final long timeEnd3 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Löschen an beliebiger Stelle     |" + (timeEnd3 - timeStart3) + " ms    |     O(n)");  

		final long timeStart7 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			Collections.swap(object, i, i + 2);
		}
		final long timeEnd7 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Vertauschen von Elementen    |" + (timeEnd7 - timeStart7) + " ms   |     O(n)"); 
		
		final long timeStart6 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object.size();
		}
		final long timeEnd6 = System.currentTimeMillis();
		System.out.println("   LL 	  |      Länge Messen    |" + (timeEnd6 - timeStart6) + " ms   |     O(n)"); 

	}
	
	public static void AL() {
		
		final long timeStart = System.currentTimeMillis();
		ArrayList<Integer> object1 = new ArrayList<Integer>();
		for(int i = 0; i <= 1000000; i++) {
			object1.add(i);
		}
		final long timeEnd = System.currentTimeMillis();
		System.out.println("   AL 	  |      Einfügen an beliebiger Stelle    |" + (timeEnd - timeStart) + " ms       |     O(1)");  
		
		final long timeStart3 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object1.add(0, i);
		}
		final long timeEnd3 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Einfügen an erster Stelle    |" + (timeEnd3 - timeStart3) + " ms       |     O(1)");  
		
		final long timeStart4 = System.currentTimeMillis();
		for(int i = 0; i <= 100000; i++) {
			object1.add(i);
		}
		final long timeEnd4 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Einfügen an letzer Stelle    |" + (timeEnd4 - timeStart4) + " ms       |     O(1)");  
		
		final long timeStart1 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object1.remove(i);
		}
		final long timeEnd1 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Löschen an beliebiger Stelle     |" + (timeEnd1 - timeStart1) + " ms     |     O(n)");   
			
		final long timeStart5 = System.currentTimeMillis();
		int index = 0;
		for(int i = 0; i <= 50000; i++) {
			object1.remove(index);
		}
		final long timeEnd5 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Löschen an ersten Stelle     |" + (timeEnd5 - timeStart5) + " ms     |     O(n)");   
		
		final long timeStart8 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			int index1 = object1.size() -1 - i;
			object1.remove(index1);
		}
		final long timeEnd8 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Löschen an letzten Stelle     |" + (timeEnd8 - timeStart8) + " ms     |     O(n)");   
		
		
		final long timeStart7 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			Collections.swap(object1, i, i + 2);
		}
		final long timeEnd7 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Vertauschen von Elementen    |" + (timeEnd7 - timeStart7) + " ms   |     O(n)"); 
		
		final long timeStart6 = System.currentTimeMillis();
		for(int i = 0; i <= 50000; i++) {
			object1.size();
		}
		final long timeEnd6 = System.currentTimeMillis();
		System.out.println("   AL 	  |      Länge Messen    |" + (timeEnd6 - timeStart6) + " ms   |     O(n)"); 
		
	}
	
	public static void main(String[] args) {
		System.out.println("  Liste   |              Operation              | Zeitdauer | Aufwandsklasse");
		System.out.println("----------+-------------------------------------+-----------+----------------");
		DVL();
		System.out.println("----------+-------------------------------------+-----------+----------------");
		LL();
		System.out.println("----------+-------------------------------------+-----------+----------------");
		AL();
		System.out.println("----------+-------------------------------------+-----------+----------------");

	}

}
