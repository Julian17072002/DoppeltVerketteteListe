
public class DoppeltVerketteteListe {

    ListElement firstElem = new ListElement("firstElem");
    ListElement lastElem = new ListElement("lastElem");

    public DoppeltVerketteteListe() {
    	firstElem.setNextElem(lastElem);
        lastElem.setPrevElem(firstElem);
    }

    public void addLast(Object o){
        ListElement newElem = new ListElement(o);
        ListElement lastElem = getLastElem();
        lastElem.setNextElem(newElem);
        newElem.setPrevElem(lastElem);
    }

    public void insertAfter(Object prevItem, Object newItem) {
        ListElement newElem, nextElem = null, pointerElem;
        pointerElem = firstElem.getNextElem();
        while(pointerElem != null && !pointerElem.getObj().equals(prevItem)){
            pointerElem = pointerElem.getNextElem();
        }
        newElem = new ListElement(newItem);
        if(pointerElem != null){
            nextElem = pointerElem.getNextElem();
            pointerElem.setNextElem(newElem);
            newElem.setNextElem(nextElem);
            newElem.setPrevElem(pointerElem);
        }
        if(nextElem != null)
            nextElem.setPrevElem(newElem);
    }
    
    public void insertBefore(Object insertItem, Object newItem){
        ListElement newElem, pointerElem;
        newElem = new ListElement(newItem);
        pointerElem = firstElem.getNextElem();
        while(pointerElem != null){
            if(pointerElem.getObj().equals(insertItem)){
                newElem.setPrevElem(pointerElem.getPrevElem());
                pointerElem.getPrevElem().setNextElem(newElem);
                pointerElem.setPrevElem(newElem);
                newElem.setNextElem(pointerElem);
                break;
            }
            pointerElem = pointerElem.getNextElem();
        }
    }

    public void delete(Object o){
        ListElement le = firstElem;
        while (le.getNextElem() != null && !le.getObj().equals(o)){
            if(le.getNextElem().getObj().equals(o)){
                if(le.getNextElem().getNextElem()!=null){
                    le.setNextElem(le.getNextElem().getNextElem());
                    le.getNextElem().setPrevElem(le);
                }else{
                    le.setNextElem(null);
                    break;
                }
            }
            le = le.getNextElem();
        }
    }
    

    public boolean find(Object o){
        ListElement le = firstElem;
        while (le != null){
            if(le.getObj().equals(o))
            return true;
            le = le.nextElem;
        }
        return false;
    }
    

    public ListElement getFirstElem() {
        return firstElem;
    }

    public ListElement getLastElem() {
        ListElement le = firstElem;
        while(le.getNextElem() != null){
            le = le.getNextElem();
        }
        return le;
    }

    public int length() {
    	int length = 1;
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
            System.out.println(le.getObj());
            le = le.getNextElem();
        }
    }

    public static void main(String[] args) {
        DoppeltVerketteteListe list = new DoppeltVerketteteListe();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.insertAfter("2", "2.5");
        list.delete("4");
        list.insertBefore("3", "2.7");
        System.out.println("erstes Element: " + list.getFirstElem().getObj());
        System.out.println("ist '4' enthalten? " + list.find("4"));
        System.out.println("ist '5' enthalten? " + list.find("5"));
        System.out.println("letztes Element: " + list.getLastElem().getObj());
        list.writeList();
        System.out.println("Länge der Liste: " +list.length());
    }
}