class ListElement {

    int val;
    ListElement nextElem, prevElem;

    public ListElement(int val) {
    	this.val = val;
    }
    
    public int getVal() {
    	return val;
    }

    public void setVal(int val) {
    	this.val = val;
    }
    
    public void setNextElem(ListElement nextElem) {
        this.nextElem = nextElem;
    }
    
    public void setPrevElem(ListElement prevElem) {
        this.prevElem = prevElem;
    }

    public ListElement getNextElem() {
        return nextElem;
    }
    
    public ListElement getPrevElem() {
        return this.prevElem;
    }

} 