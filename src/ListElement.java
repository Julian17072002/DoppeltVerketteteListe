class ListElement {

    Object obj;
    ListElement nextElem, prevElem;

    public ListElement(Object obj) {
        this.obj = obj;
        nextElem = null;
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

    public Object getObj() {
        return obj;
    }
} 