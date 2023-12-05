package Hw7_21000659_DauVanAn.excercise1.arraysearch;

import Hw7_21000659_DauVanAn.excercise1.simplearraylist.SimpleArrayList;

public class UnsortedArrayListSearch {
    public static <T> int linearSearchUnsorted(SimpleArrayList<T> array, T target) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(5);
        System.out.println(linearSearchUnsorted(arrayList, 4));
    }
}
