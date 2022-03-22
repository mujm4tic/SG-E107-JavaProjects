package com.sparta.mm.week2.generics;

public class Box {
    public class Box<T extends Number> {
        private T item;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public static void main(String[] args) {
            Box<Integer> numberBox = new Box<>();
            numberBox.setItem(7);
        }
    }
}
