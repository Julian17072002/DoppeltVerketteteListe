
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

	static FileWriter fw;
	final static int einf�gen = 100000; 
	final static int durchl�ufe = 1000;
	final static int durchl�ufe1 = 10;
	
	public static void DVL() {
        
		DoppeltVerketteteListe list = new DoppeltVerketteteListe(new ListElement(1), new ListElement(2)); 
		final long timeStart2 = System.nanoTime();
    	for(int i = 0; i <= einf�gen; i++) {
			list.addLast(new ListElement(i));
    	}
		final long timeEnd2 = System.nanoTime();
		System.out.println("   DVL 	  |      Einf�gen an letzter Stelle  \t|" + (timeEnd2 - timeStart2) + " ms   \t| " + (timeEnd2 - timeStart2)/einf�gen + " ms   \t|    O(1)");  
		
		final long timeStart1 = System.nanoTime(); 
    	for(int i = 0; i <= durchl�ufe; i++) {
			list.addFirst(new ListElement(i));
    	}
		final long timeEnd1 = System.nanoTime();
		System.out.println("   DVL 	  |      Einf�gen an erster Stelle     \t|" + (timeEnd1 - timeStart1) + " ms  \t| " + (timeEnd1 - timeStart1)/durchl�ufe + " ms   \t|    O(1)");  
		
		
		final long timeStart = System.nanoTime();
    	for(int i = 0; i <= durchl�ufe1; i++) {
			list.add(i,i);
    	}
		final long timeEnd = System.nanoTime();
		System.out.println("   DVL 	  |      Einf�gen an beliebiger Stelle\t|" + (timeEnd - timeStart) + " ms  \t| " + (timeEnd - timeStart)/durchl�ufe1 + " ms   \t|    O(1)");  
		
		final long timeStart4 = System.nanoTime();
    	for (int i = 0; i < durchl�ufe1; i++) {
			list.deleteFirst();
    	}
		final long timeEnd4 = System.nanoTime();
		System.out.println("   DVL 	  |      L�schen an erster Stelle     \t|" + (timeEnd4 - timeStart4) + " ms  \t| " + (timeEnd4 - timeStart4)/durchl�ufe1 + " ms   \t|    O(1)");  
		
		final long timeStart5 = System.nanoTime();
    	for (int i = 0; i < -durchl�ufe1; i--) {
			list.deleteLast();
		}
		final long timeEnd5 = System.nanoTime();
		System.out.println("   DVL 	  |      L�schen an letzter Stelle  \t|" + (timeEnd5 - timeStart5) + " ms  \t| " + (timeEnd5 - timeStart5)/durchl�ufe1 + " ms   \t|    O(1)");  
		
		
        final long timeStart3 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe1; i++) {
			list.deleteElem(i);
		}
		final long timeEnd3 = System.nanoTime();
		System.out.println("   DVL 	  |      L�schen an beliebiger Stelle\t|" + (timeEnd3 - timeStart3) + " ms \t| " + (timeEnd3 - timeStart3)/durchl�ufe1 + " ms   \t|    O(n)");  

		final long timeStart7 = System.nanoTime();
			for(int i = 0; i <= durchl�ufe1; i++) {
				list.swap(i, i+2);
			}
		final long timeEnd7 = System.nanoTime();
		System.out.println("   DVL 	  |      Vertauschen von Elementen    \t|" + (timeEnd7 - timeStart7) + " ms \t| " + (timeEnd7 - timeStart7)/durchl�ufe1 + " ms   \t|    O(n)");  
		
		final long timeStart6 = System.nanoTime();
			for(int i = 0; i <= durchl�ufe1; i++) {
				list.length();
			}
		final long timeEnd6 = System.nanoTime();
		System.out.println("   DVL 	  |      L�nge der Liste Messen    \t|" + (timeEnd6 - timeStart6) + " ms \t| " + (timeEnd6 - timeStart6)/durchl�ufe1 + " ms   \t|    O(n)");  
	}
	
	
	public static void LL() {
		final long timeStart1 = System.nanoTime();
		LinkedList<String> object = new LinkedList<String>(); 
    	for(int i = 0; i <= durchl�ufe; i++) {
			object.addFirst("i");
    	}
		final long timeEnd1 = System.nanoTime();
		System.out.println("   LL 	  |      Einf�gen an erster Stelle    \t|" + (timeEnd1 - timeStart1) + " ms  \t| " + (timeEnd1 - timeStart1)/durchl�ufe + " ms   \t|    O(1)");  
		
		final long timeStart2 = System.nanoTime();
    	for(int i = 0; i <= einf�gen; i++) {
			object.addLast("i");
    	}
		final long timeEnd2 = System.nanoTime();
		System.out.println("   LL 	  |      Einf�gen an letzter Stelle   \t|" + (timeEnd2 - timeStart2) + " ms \t| " + (timeEnd2 - timeStart2)/einf�gen + " ms \t|     O(1)");  
		
		final long timeStart = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			object.add("i");
		}
		final long timeEnd = System.nanoTime();
		System.out.println("   LL 	  |      Einf�gen an beliebiger Stelle\t|" + (timeEnd - timeStart) + " ms   \t| " + (timeEnd - timeStart)/durchl�ufe + " ms  \t|    O(1)");  
	    
		final long timeStart4 = System.nanoTime();
    	for(int i = 0; i <= durchl�ufe; i++) {
			object.removeFirst();
    	}
		final long timeEnd4 = System.nanoTime();
		System.out.println("   LL 	  |      L�schen an erster Stelle   \t|" + (timeEnd4 - timeStart4) + " ms   \t| " + (timeEnd4 - timeStart4)/durchl�ufe + " ms   \t|    O(1)");  
		
		final long timeStart5 = System.nanoTime();
    	for(int i = 0; i <= durchl�ufe; i++) {
			object.removeLast();
    	}
		final long timeEnd5 = System.nanoTime();
		System.out.println("   LL 	  |      L�schen an letzter Stelle \t|" + (timeEnd5 - timeStart5) + " ms   \t| " + (timeEnd5 - timeStart5)/durchl�ufe + " ms   \t|    O(1)");  
			
	    final long timeStart3 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe1; i++) {
			object.remove(i);
		}
		final long timeEnd3 = System.nanoTime();
		System.out.println("   LL 	  |      L�schen an beliebiger Stelle\t|" + (timeEnd3 - timeStart3) + " ms  \t| " + (timeEnd3 - timeStart3)/durchl�ufe1 + " ms   \t|    O(n)");  

		final long timeStart7 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe1; i++) {
			Collections.swap(object, i, i + 2);
		}
		final long timeEnd7 = System.nanoTime();
		System.out.println("   LL 	  |      Vertauschen von Elementen   \t|" + (timeEnd7 - timeStart7) + " ms \t| " + (timeEnd7 - timeStart7)/durchl�ufe1 + " ms   \t|    O(n)"); 
		
		final long timeStart6 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			object.size();
		}
		final long timeEnd6 = System.nanoTime();
		System.out.println("   LL 	  |      L�nge der Liste Messen   \t|" + (timeEnd6 - timeStart6) + " ms \t| " + (timeEnd6 - timeStart6)/durchl�ufe + " ms   \t|    O(n)"); 

	}
	
	public static void AL() {
		
		final long timeStart = System.nanoTime();
		ArrayList<Integer> object1 = new ArrayList<Integer>();
		for(int i = 0; i <= einf�gen; i++) {
			object1.add(i);
		}
		final long timeEnd = System.nanoTime();
		System.out.println("   AL 	  |      Einf�gen an beliebiger Stelle\t|" + (timeEnd - timeStart) + " ms   \t| " + (timeEnd - timeStart)/einf�gen + " ms   \t|    O(1)");  
		
		final long timeStart3 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			object1.add(0, i);
		}
		final long timeEnd3 = System.nanoTime();
		System.out.println("   AL 	  |      Einf�gen an erster Stelle    \t|" + (timeEnd3 - timeStart3) + " ms   \t| " + (timeEnd3 - timeStart3)/durchl�ufe + " ms   \t|    O(1)");  
		
		final long timeStart4 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			object1.add(i);
		}
		final long timeEnd4 = System.nanoTime();
		System.out.println("   AL 	  |      Einf�gen an letzer Stelle    \t|" + (timeEnd4 - timeStart4) + " ms   \t| " + (timeEnd4 - timeStart4)/durchl�ufe + " ms   \t|    O(1)");  
		
		final long timeStart1 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			object1.remove(i);
		}
		final long timeEnd1 = System.nanoTime();
		System.out.println("   AL 	  |      L�schen an beliebiger Stelle\t|" + (timeEnd1 - timeStart1) + " ms   \t| " + (timeEnd1 - timeStart1)/durchl�ufe + " ms   \t|    O(n)");   
			
		final long timeStart5 = System.nanoTime();
		int index = 0;
		for(int i = 0; i <= durchl�ufe; i++) {
			object1.remove(index);
		}
		final long timeEnd5 = System.nanoTime();
		System.out.println("   AL 	  |      L�schen an ersten Stelle     \t|" + (timeEnd5 - timeStart5) + " ms   \t| " + (timeEnd5 - timeStart5)/durchl�ufe + " ms   \t|    O(n)");   
		
		final long timeStart8 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			int index1 = object1.size() -1 - i;
			object1.remove(index1);
		}
		final long timeEnd8 = System.nanoTime();
		System.out.println("   AL 	  |      L�schen an letzten Stelle     \t|" + (timeEnd8 - timeStart8) + " ms   \t| " + (timeEnd8 - timeStart8)/durchl�ufe + " ms   \t|    O(n)");   
		
		
		final long timeStart7 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			Collections.swap(object1, i, i + 2);
		}
		final long timeEnd7 = System.nanoTime();
		System.out.println("   AL 	  |      Vertauschen von Elementen    \t|" + (timeEnd7 - timeStart7) + " ms \t| " + (timeEnd7 - timeStart7)/durchl�ufe + " ms   \t|     O(n)"); 
		
		final long timeStart6 = System.nanoTime();
		for(int i = 0; i <= durchl�ufe; i++) {
			object1.size();
		}
		final long timeEnd6 = System.nanoTime();
		System.out.println("   AL 	  |      L�nge der Liste Messen    \t|" + (timeEnd6 - timeStart6) + " ms \t|" + (timeEnd6 - timeStart6)/durchl�ufe + " ms   \t|     O(n)"); 
		
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
