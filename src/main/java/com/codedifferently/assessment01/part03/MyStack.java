package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T>{

    private List<T> s = new ArrayList<T>();

    public boolean isEmpty() {
        return true;
    }

    public void push(T i) {
        s.add(i);
    }

    public T pop() throws EmptyStackException {
        if ( s.isEmpty()){
            throw new IllegalStateException();
        }
        return s.remove(0);
    }

    public T peek() {
        return null;
    }

    public Integer size(){
        return null;
    }
}
