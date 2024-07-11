import java.util.ArrayList;

public class Library<T> implements Collection {

    ArrayList<T> arrayList;
    int index;

    public Library(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
        this.index = 0;
    }

    private class Itr implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return index < arrayList.size();
        }

        @Override
        public T next() {
            if (index < arrayList.size()) {
                return arrayList.get(index++);
            } else {
                return null;
            }
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }
}
