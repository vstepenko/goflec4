package ua.edu.duan.gof.impl;

public class IteratorTest {
    public static void main(String[] args) {
        SpecificCollection specificCollection = new SpecificCollectionImpl();

        Iterator iterator = specificCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
