
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	static FileWriter fw;
	final static int einfügen = 100000; 
	final static int durchläufe = 1000;
	final static int durchläufe1 = 10;
	
	public static void DVL() {
        
		DoppeltVerketteteListe list = new DoppeltVerketteteListe(new ListElement(1), new ListElement(2)); 
		final long timeStart2 = System.nanoTime();
    	for(int i = 0; i <= einfügen; i++) {
			list.addLast(new ListElement(i));
    	}
		final long timeEnd2 = System.nanoTime();
		System.out.println("   DVL 	  |      Einfügen an letzter Stelle  \t|" + (timeEnd2 - timeStart2) + " ms   \t| " + (timeEnd2 - timeStart2)/einfügen + " ms   \t|    O(1)");  
		
		final long timeStart1 = System.nanoTime(); 
    	for(int i = 0; i <= durchläufe; i++) {
			list.addFirst(new ListElement(i));
    	}
		final long timeEnd1 = System.nanoTime();
		System.out.println("   DVL 	  |      Einfügen an erster Stelle     \t|" + (timeEnd1 - timeStart1) + " ms  \t| " + (timeEnd1 - timeStart1)/durchläufe + " ms   \t|    O(1)");  
		
		
		final long timeStart = System.nanoTime();
    	for(int i = 0; i <= durchläufe1; i++) {
			list.add(i,i);
    	}
		final long timeEnd = System.nanoTime();
		System.out.println("   DVL 	  |      Einfügen an beliebiger Stelle\t|" + (timeEnd - timeStart) + " ms  \t| " + (timeEnd - timeStart)/durchläufe1 + " ms   \t|    O(1)");  
		
		final long timeStart4 = System.nanoTime();
    	for (int i = 0; i < durchläufe1; i++) {
			list.deleteFirst();
    	}
		final long timeEnd4 = System.nanoTime();
		System.out.println("   DVL 	  |      Löschen an erster Stelle     \t|" + (timeEnd4 - timeStart4) + " ms  \t| " + (timeEnd4 - timeStart4)/durchläufe1 + " ms   \t|    O(1)");  
		
		final long timeStart5 = System.nanoTime();
    	for (int i = 0; i < -durchläufe1; i--) {
			list.deleteLast();
		}
		final long timeEnd5 = System.nanoTime();
		System.out.println("   DVL 	  |      Löschen an letzter Stelle  \t|" + (timeEnd5 - timeStart5) + " ms  \t| " + (timeEnd5 - timeStart5)/durchläufe1 + " ms   \t|    O(1)");  
		
		
        final long timeStart3 = System.nanoTime();
		for(int i = 0; i <= durchläufe1; i++) {
			list.deleteElem(i);
		}
		final long timeEnd3 = System.nanoTime();
		System.out.println("   DVL 	  |      Löschen an beliebiger Stelle\t|" + (timeEnd3 - timeStart3) + " ms \t| " + (timeEnd3 - timeStart3)/durchläufe1 + " ms   \t|    O(n)");  

		final long timeStart7 = System.nanoTime();
			for(int i = 0; i <= durchläufe1; i++) {
				list.swap(i, i+2);
			}
		final long timeEnd7 = System.nanoTime();
		System.out.println("   DVL 	  |      Vertauschen von Elementen    \t|" + (timeEnd7 - timeStart7) + " ms \t| " + (timeEnd7 - timeStart7)/durchläufe1 + " ms   \t|    O(n)");  
		
		final long timeStart6 = System.nanoTime();
			for(int i = 0; i <= durchläufe1; i++) {
				list.length();
			}
		final long timeEnd6 = System.nanoTime();
		System.out.println("   DVL 	  |      Länge der Liste Messen    \t|" + (timeEnd6 - timeStart6) + " ms \t| " + (timeEnd6 - timeStart6)/durchläufe1 + " ms   \t|    O(n)");  
	}
	
	
	public static void LL() {
		final long timeStart1 = System.nanoTime();
		LinkedList<String> object = new LinkedList<String>(); 
    	for(int i = 0; i <= durchläufe; i++) {
			object.addFirst("i");
    	}
		final long timeEnd1 = System.nanoTime();
		System.out.println("   LL 	  |      Einfügen an erster Stelle    \t|" + (timeEnd1 - timeStart1) + " ms  \t| " + (timeEnd1 - timeStart1)/durchläufe + " ms   \t|    O(1)");  
		
		final long timeStart2 = System.nanoTime();
    	for(int i = 0; i <= einfügen; i++) {
			object.addLast("i");
    	}
		final long timeEnd2 = System.nanoTime();
		System.out.println("   LL 	  |      Einfügen an letzter Stelle   \t|" + (timeEnd2 - timeStart2) + " ms \t| " + (timeEnd2 - timeStart2)/einfügen + " ms \t|     O(1)");  
		
		final long timeStart = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			object.add("i");
		}
		final long timeEnd = System.nanoTime();
		System.out.println("   LL 	  |      Einfügen an beliebiger Stelle\t|" + (timeEnd - timeStart) + " ms   \t| " + (timeEnd - timeStart)/durchläufe + " ms  \t|    O(1)");  
	    
		final long timeStart4 = System.nanoTime();
    	for(int i = 0; i <= durchläufe; i++) {
			object.removeFirst();
    	}
		final long timeEnd4 = System.nanoTime();
		System.out.println("   LL 	  |      Löschen an erster Stelle   \t|" + (timeEnd4 - timeStart4) + " ms   \t| " + (timeEnd4 - timeStart4)/durchläufe + " ms   \t|    O(1)");  
		
		final long timeStart5 = System.nanoTime();
    	for(int i = 0; i <= durchläufe; i++) {
			object.removeLast();
    	}
		final long timeEnd5 = System.nanoTime();
		System.out.println("   LL 	  |      Löschen an letzter Stelle \t|" + (timeEnd5 - timeStart5) + " ms   \t| " + (timeEnd5 - timeStart5)/durchläufe + " ms   \t|    O(1)");  
			
	    final long timeStart3 = System.nanoTime();
		for(int i = 0; i <= durchläufe1; i++) {
			object.remove(i);
		}
		final long timeEnd3 = System.nanoTime();
		System.out.println("   LL 	  |      Löschen an beliebiger Stelle\t|" + (timeEnd3 - timeStart3) + " ms  \t| " + (timeEnd3 - timeStart3)/durchläufe1 + " ms   \t|    O(n)");  

		final long timeStart7 = System.nanoTime();
		for(int i = 0; i <= durchläufe1; i++) {
			Collections.swap(object, i, i + 2);
		}
		final long timeEnd7 = System.nanoTime();
		System.out.println("   LL 	  |      Vertauschen von Elementen   \t|" + (timeEnd7 - timeStart7) + " ms \t| " + (timeEnd7 - timeStart7)/durchläufe1 + " ms   \t|    O(n)"); 
		
		final long timeStart6 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			object.size();
		}
		final long timeEnd6 = System.nanoTime();
		System.out.println("   LL 	  |      Länge der Liste Messen   \t|" + (timeEnd6 - timeStart6) + " ms \t| " + (timeEnd6 - timeStart6)/durchläufe + " ms   \t|    O(n)"); 

	}
	
	public static void AL() {
		
		final long timeStart = System.nanoTime();
		ArrayList<Integer> object1 = new ArrayList<Integer>();
		for(int i = 0; i <= einfügen; i++) {
			object1.add(i);
		}
		final long timeEnd = System.nanoTime();
		System.out.println("   AL 	  |      Einfügen an beliebiger Stelle\t|" + (timeEnd - timeStart) + " ms   \t| " + (timeEnd - timeStart)/einfügen + " ms   \t|    O(1)");  
		
		final long timeStart3 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			object1.add(0, i);
		}
		final long timeEnd3 = System.nanoTime();
		System.out.println("   AL 	  |      Einfügen an erster Stelle    \t|" + (timeEnd3 - timeStart3) + " ms   \t| " + (timeEnd3 - timeStart3)/durchläufe + " ms   \t|    O(1)");  
		
		final long timeStart4 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			object1.add(i);
		}
		final long timeEnd4 = System.nanoTime();
		System.out.println("   AL 	  |      Einfügen an letzer Stelle    \t|" + (timeEnd4 - timeStart4) + " ms   \t| " + (timeEnd4 - timeStart4)/durchläufe + " ms   \t|    O(1)");  
		
		final long timeStart1 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			object1.remove(i);
		}
		final long timeEnd1 = System.nanoTime();
		System.out.println("   AL 	  |      Löschen an beliebiger Stelle\t|" + (timeEnd1 - timeStart1) + " ms   \t| " + (timeEnd1 - timeStart1)/durchläufe + " ms   \t|    O(n)");   
			
		final long timeStart5 = System.nanoTime();
		int index = 0;
		for(int i = 0; i <= durchläufe; i++) {
			object1.remove(index);
		}
		final long timeEnd5 = System.nanoTime();
		System.out.println("   AL 	  |      Löschen an ersten Stelle     \t|" + (timeEnd5 - timeStart5) + " ms   \t| " + (timeEnd5 - timeStart5)/durchläufe + " ms   \t|    O(n)");   
		
		final long timeStart8 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			int index1 = object1.size() -1 - i;
			object1.remove(index1);
		}
		final long timeEnd8 = System.nanoTime();
		System.out.println("   AL 	  |      Löschen an letzten Stelle     \t|" + (timeEnd8 - timeStart8) + " ms   \t| " + (timeEnd8 - timeStart8)/durchläufe + " ms   \t|    O(n)");   
		
		
		final long timeStart7 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			Collections.swap(object1, i, i + 2);
		}
		final long timeEnd7 = System.nanoTime();
		System.out.println("   AL 	  |      Vertauschen von Elementen    \t|" + (timeEnd7 - timeStart7) + " ms \t| " + (timeEnd7 - timeStart7)/durchläufe + " ms   \t|     O(n)"); 
		
		final long timeStart6 = System.nanoTime();
		for(int i = 0; i <= durchläufe; i++) {
			object1.size();
		}
		final long timeEnd6 = System.nanoTime();
		System.out.println("   AL 	  |      Länge der Liste Messen    \t|" + (timeEnd6 - timeStart6) + " ms \t|" + (timeEnd6 - timeStart6)/durchläufe + " ms   \t|     O(n)"); 
		
	}
	
	public static void main(String[] args) throws IOException {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("_dd-MM-yyyy-HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		String timeStamp = dtf.format(now);
		fw = new FileWriter("spreng_Listen-Vergleich"+timeStamp+".txt");
		fw.write("  Liste   |              Operation              | Zeitdauer | Aufwandsklasse\t");
		fw.close();
		
		System.out.println("  Liste   |              Operation              |   Zeitdauer   |\u00D8 Zeitdauer    | Aufwandsklasse");
		System.out.println("----------+-------------------------------------+---------------+---------------+----------------");
		DVL();
		System.out.println("----------+-------------------------------------+---------------+---------------+----------------");
		LL();
		System.out.println("----------+-------------------------------------+---------------+---------------+----------------");
		AL();
		System.out.println("----------+-------------------------------------+---------------+---------------+----------------");

	}

}
