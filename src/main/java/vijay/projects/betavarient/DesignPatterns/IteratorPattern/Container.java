package vijay.projects.betavarient.DesignPatterns.IteratorPattern;

public class Container implements Iterator{

    private int cursor = 0;
    private int[] values = new int[10];

    public Container() {
        for (int i = 0; i<values.length;  i++) {
            values[i] = i*10;
        }
    }


    @Override
    public boolean hasNext() {
        return cursor != values.length;
    }

    @Override
    public int next() {
        if (hasNext()) {
            return values[cursor++];
        }
        throw new UnsupportedOperationException("Reached End of Container");
    }

    @Override
    public int get() {
        return values[cursor++];
    }

    @Override
    public boolean hasPrevious() {
        return cursor > 0;
    }

    @Override
    public int previous() {
        if (hasPrevious()) {
            return values[--cursor];
        }
        throw  new UnsupportedOperationException("Reached Beginning of Container");
    }
}
