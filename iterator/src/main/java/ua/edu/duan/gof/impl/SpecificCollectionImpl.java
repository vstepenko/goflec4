package ua.edu.duan.gof.impl;

public class SpecificCollectionImpl implements  SpecificCollection {

    private  final String[] names = {"Bob", "Martin", "Jul"};

    @Override
    public Iterator iterator() {
        return new SpecIterator();
    }

    public class SpecIterator implements  Iterator{

        private int index = 0 ;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
