public class PrintArray {

        public <T> void PrintArr(T[] items) {
            for (T item : items) {
                System.out.print(" " + item);
            }
            System.out.println();
        }

}
