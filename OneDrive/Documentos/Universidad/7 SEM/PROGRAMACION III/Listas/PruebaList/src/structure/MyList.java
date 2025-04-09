package structure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import structure.Node;

public class MyList<T> implements List<T> {
    private Node<T> head;

    @Override
    public int size() {
        int size = 0;
        Node<T> auxNode = head;
        while (auxNode.getNext() != null) {
            size++;
            auxNode = auxNode.getNext();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.equals(null);
    }

    @Override
    public boolean contains(Object o) {
        Node<T> auxNode = head;
        while (auxNode != null) {
            if (auxNode.getData().equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> auxNode = head;

            @Override
            public boolean hasNext() {

                return auxNode.getNext() != null;

            }

            @Override
            public T next() {
                T info = auxNode.getData();
                auxNode = auxNode.getNext();
                return info;
            }

        };
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int size = 0;
        Node<T> current = (Node<T>) this;

        // Calculate the size of the linked list
        while (current != null) {
            size++;
            current = current.getNext();
        }

        // If the array passed as a parameter is too small, create a new one
        if (a.length < size) {
            a = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
        }

        // Reset the current node to the start of the list
        current = (Node<T>) this;
        int i = 0;

        // Populate the array with the data from the linked list
        while (current != null) {
            a[i++] = current.getData();
            current = current.getNext();
        }

        // If there's extra space in the array, set the next element to null
        if (a.length > size) {
            a[size] = null;
        }

        return a;
    }

    @Override
    public boolean add(T e) {
        boolean attached = false;
        Node<T> node = new Node<>(e, null);
        if (head == null) {
            head = node;
        } else {
            Node<T> auxNode = head;
            while (auxNode.getNext() != null) {
                auxNode = auxNode.getNext();
            }
            auxNode.setNext(node);
            attached = true;
        }
        return attached;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> auxNode = head;
        Node<T> prevNode = null;
        boolean deleted = false;
        while (auxNode != null) {
            if (auxNode.getData().equals(o)) {
                if (prevNode == null) {
                    head = auxNode.getNext();
                } else {
                    prevNode.setNext(auxNode.getNext());
                    deleted = true;
                }
            }
            prevNode = auxNode;
            auxNode = auxNode.getNext();

        }
        return deleted;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public T set(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}
