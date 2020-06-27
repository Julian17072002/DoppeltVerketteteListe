
public class DoppeltVerketteteListe {

    ListElement firstElem;
    ListElement lastElem;

    public DoppeltVerketteteListe(ListElement firstElem, ListElement lastElem) {
    	this.firstElem = firstElem;
    	this.lastElem = lastElem;
    	
    	this.firstElem.prevElem = null;
    	this.firstElem.nextElem = this.lastElem;
    	
    	this.lastElem.nextElem = null;
    	this.lastElem.prevElem = this.firstElem;
    }
    
    public void addLast(ListElement e) {		//Element hinten einfügen
    	lastElem.nextElem = e;
    	e.prevElem = lastElem;
    	lastElem = e;
    }
    
    public void addFirst(ListElement e) {		//Element vorne einfügen
    	firstElem.prevElem = e;
    	e.nextElem = firstElem;
    	firstElem = e;
    }  
    
	private ListElement getElemByIndex(int index) {
		ListElement currentElem = firstElem;
		int counter = 0;
		while (index != counter) {
			currentElem = currentElem.nextElem;
			counter++;
			if (currentElem == null) {
				System.out.println("No Element with Index: " + index + " exists!");
				return null;
			}
		}
		return currentElem;
	}
	private int getIndexByElem(ListElement e) {
		int index = 0;
		ListElement currentElem = firstElem;
		while (currentElem != e) {
			index++;
			currentElem = currentElem.nextElem;
		}
		return index;
	}
    
//	public void add(ListElement listElement) {
//		// TODO Auto-generated method stub
//		
//	}

	public void add(int val, int index) {
		if (index < 0) {
			System.out.println("Positive index (0 included) expected!");
			return;
		}
		if (index > length()) {
			System.out.println("Index out of Bounds!");
			return;
		}
	
		ListElement addElem = new ListElement(val);
		if (index == length()) {
			lastElem.nextElem = addElem;
			addElem.prevElem = lastElem;
			lastElem = addElem;
			return;
		}
		
		if (index == getIndexByElem(firstElem)) {
			firstElem.prevElem = addElem;
			addElem.nextElem = firstElem;
			firstElem = addElem;
			return;
		}
	
		ListElement nextElem = getElemByIndex(index);
		ListElement lastElem = getElemByIndex(index - 1);
		addElem.prevElem = lastElem;
		addElem.nextElem = nextElem;
		nextElem.prevElem = addElem;
		lastElem.nextElem = addElem;
	}
	
    public void deleteElem(int index) {
//		if (index < 0) {
//			System.out.println("Positive index (0 included) expected!");
//			return;
//		}
//		if (index >= length()) {
//			System.out.println("Index out of Bounds!");
//			return;
//		}

		if (index == getIndexByElem(firstElem)) { 
			firstElem = firstElem.nextElem;
			return;
		}

		if (index == getIndexByElem(lastElem)) {
			lastElem = lastElem.nextElem;
			return;
		}

		ListElement deleteElem = getElemByIndex(index);
		ListElement lastElem = deleteElem.prevElem;
		ListElement nextElem = deleteElem.nextElem;
		lastElem.nextElem = nextElem;
		nextElem.prevElem = lastElem;

	}
    
    public void deleteFirst() {
		deleteElem(getIndexByElem(firstElem));
	}
	public void deleteLast() {
		deleteElem(getIndexByElem(lastElem));
	}

    public void swap(int index1, int index2) {
		if (index1 == index2) {
			System.out.println("Nothing to swap here!");
			return;
		}
		if (index1 > index2) { 
			int temp = index1;
			index1 = index2;
			index2 = temp;
		}
		ListElement e1 = getElemByIndex(index1);
		ListElement e2 = getElemByIndex(index2);
		if (e1 == null || e2 == null) {
			System.out.println("Index out of Bounds!");
			return;
		}
		if (e1 == firstElem) {
			firstElem = e2;
		}
		if (e2 == lastElem) {
			lastElem = e1;
		}
		if (e1.nextElem == e2) { 
			e1.nextElem = e2.nextElem;
			e2.prevElem = e1.prevElem;
			
			if (e1.nextElem != null) {
				e1.nextElem.prevElem = e1;
			}
			if (e2.prevElem != null) {
				e2.prevElem.nextElem = e2;
			}
			
			e2.nextElem = e1;
			e1.prevElem = e2;
		} else {
			ListElement l = e2.prevElem;
			ListElement n = e2.nextElem;
			
			e2.prevElem = e1.prevElem;
			e2.nextElem = e1.nextElem;
			
			e1.prevElem = l;
			e1.nextElem = n;
			
			if (e2.nextElem != null) {
				e2.nextElem.prevElem = e2;
			}
			if (e2.prevElem != null) {
				e2.prevElem.nextElem = e2;
			}
			
			if (e1.nextElem != null) {
				e1.nextElem.prevElem = e1;
			}
			if (e1.prevElem != null) {
				e1.prevElem.nextElem = e1;
			}
		}
	}
    
    public int length() {
    	int length = 0;
    	ListElement le = firstElem;
		while (le != null) {
			length++;
			le = le.nextElem;
		}
		return length;
    }
    
    public void writeList() {
        ListElement le = firstElem;
        while(le != null){
            System.out.println(le);
            le = le.getNextElem();
        }
    }

    public static void main(String[] args) {
//    	final long timeStart = System.nanoTime();
            DoppeltVerketteteListe list = new DoppeltVerketteteListe(new ListElement(1), new ListElement(2));
//          list.addLast(new ListElement(3));
//          list.addLast(new ListElement(4));
//          list.addLast(new ListElement(5));
//          list.addFirst(new ListElement(0));
//          list.deleteElem(4);
          list.add(6, 3);
//          list.swap(1, 5);
//          list.writeList();
//          System.out.println("Länge der Liste: " +list.length());
//  		final long timeEnd = System.nanoTime();
//  		System.out.println("Zeit die für sämtliche Operationen benötigt wird: " + (timeEnd - timeStart) + " ns");  
    	
	    	for(int i = 0; i <= 100000; i++) {
				list.addLast(new ListElement(i));
	    	}
	    	
	    	list.writeList();
            System.out.println("Länge der Liste: " +list.length());
	    	
    }

}