public class Table {
    private int legs;
    private int items;
     
    public boolean isTable(int l) {
        legs = l;
        if (legs == 4) return true;
        return false;
    }

    public int howManyItems(int i) {
        items = i;
        return items;
    }

    public Table() {}
}