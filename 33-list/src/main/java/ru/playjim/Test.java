package ru.playjim;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("size=" + myList.size());
        System.out.println("myList[1]=" + myList.get(1));
        System.out.println(myList.toString());
        myList.clear();
        System.out.println(myList.toString());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.println(myList.toString());
        myList.set(0,99);
        myList.set(1,98);
        myList.set(2,97);
        myList.set(3,96);
        System.out.println(myList.toString());
        //myList.set(9,0);
    }
}
