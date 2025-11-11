package test;

public class MyArrayList {

    private String[] array = new String[10];
    private int size = 0;

    public String get(int index) {
        if (index == 0 || index < size) {
            return array[index];
        }
        return "Error. Wrong index";
    }

    public void add(String element) {
        array[size] = element;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = null;

    }

    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }


}
