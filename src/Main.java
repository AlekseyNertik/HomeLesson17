import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; // целочисленный массив
        Double[] arrDouble = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0}; // массив doublе

        // Задание 1.
        System.out.println("1. Поменять местами элементы массива");
        System.out.println("Исходные массивы");
        printArray.PrintArr(arrInt);
        printArray.PrintArr(arrDouble);
        System.out.println("\nМеняю местами элементы 1 и 7: ");
        changeArr(arrInt, 0, 6);
        changeArr(arrDouble, 0, 6);
        System.out.println("Результирующие массивы");
        printArray.PrintArr(arrInt);
        printArray.PrintArr(arrDouble);

        // Задание 2.
        System.out.println("\n2. Массивы в ArrayList");
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList1=Array_ToArrayList(arrInt);
        arrayList2=Array_ToArrayList(arrDouble);
        System.out.println(arrayList1);
        System.out.println(arrayList2);

        //Задание 3.
        //как сделать через массив?
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();

        int menu; //выбор типа действия
        boolean ask = true;
        Scanner scanner = new Scanner(System.in);
        do {
            PrintMenuInfo();
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ящик 1: апельсины кол-во "+orange1.getNum()+"  вес: " + orange1.getWeight());
                    System.out.println("Ящик 2: апельсины кол-во "+orange2.getNum()+"  вес: " + orange2.getWeight());
                    System.out.println("Ящик 1: яблоки кол-во "+apple1.getNum()+"  вес: " + apple1.getWeight());
                    System.out.println("Ящик 2: яблоки кол-во "+apple2.getNum()+"  вес: " + apple2.getWeight());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Сравниваю ящики 1-3 и 2-4");
                    System.out.println("Ящик 1 вес: "+orange1.getWeight()+" и 3 вес: "+apple1.getWeight() +"  результат: "+orange1.compare(apple1));
                    System.out.println("Ящик 2 вес: "+orange2.getWeight()+" и 4 вес: "+apple2.getWeight() +"  результат: "+orange2.compare(apple2));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Сливаю фрукты в один ящик по типам: апельсины-яблоки");
                    orange2.change(orange1);
                    apple2.change(apple1);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Добавляю фрукты. Один раз по 10 в каждый ящик яблок и апельсинов и Второй раз по 20");
                    orange1.addFruit(new Orange(), 10);
                    orange2.addFruit(new Orange(), 20);
                    apple1.addFruit(new Apple(), 10);
                    apple2.addFruit(new Apple(), 20);
                    System.out.println("Добавление выполнено!");
//PrintBox(); как вывод на печать сделать в методе? В методе не цепляется orange1.getNum() и orange1.getWeight()
                    System.out.println("Ящик 1: апельсины кол-во "+orange1.getNum()+"  вес: " + orange1.getWeight());
                    System.out.println("Ящик 2: апельсины кол-во "+orange2.getNum()+"  вес: " + orange2.getWeight());
                    System.out.println("Ящик 1: яблоки кол-во "+apple1.getNum()+"  вес: " + apple1.getWeight());
                    System.out.println("Ящик 2: яблоки кол-во "+apple2.getNum()+"  вес: " + apple2.getWeight());
                    System.out.println();
                    break;
                case 5: ask=false;
                    break;
                default: System.out.println("Выбор только 1-5!\n?");
                    break;
            }
        }while (ask);
    }

    // Задание 1.
    private static void changeArr(Object[] a, int i, int i1) { //для задания 1. обмен элементов массива
        Object a1 = a[i];
        a[i] = a[i1];
        a[i1] = a1;
    }

    // Задание 2.
    private static ArrayList Array_ToArrayList(Object [] aA) {
        ArrayList array_list = new ArrayList(List.of(aA));
        return array_list;
    }

    public static void PrintMenuInfo() {
        System.out.println("Выбор действия: 1 - информация по заполнению коробок фруктами");
        System.out.println("                2 - информация по сравнению коробок с фруктами");
        System.out.println("                3 - пересыпание фруктов между коробоками");
        System.out.println("                4 - добавление фруктов в коробоку");
        System.out.println("                5 - выход\n?");
    }
// Как обойти и выполнить метод?
//    public void PrintBox(Box q){
//        System.out.println("Ящик 1: "+ q.getWeight());    //тут не цепляется q.getWeight()
//    }

}
