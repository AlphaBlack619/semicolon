package MyList;

import java.util.Collection;

public class ArrayListBuilder {
    private int size;
    private Collection<? extends Enum> c;

    public ArrayListBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public ArrayListBuilder setC(Collection<? extends Enum> c) {
        this.c = c;
        return this;
    }

    public MyArrayList createArrayList() {
        return new MyArrayList(size);
    }
}