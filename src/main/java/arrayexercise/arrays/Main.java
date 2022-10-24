package arrayexercise.arrays;

public class Main {

        public static void main(String[] args) {
            int [] myIntArray = new int[100];//{1,2,3,4,5,6,7};
            for (int i = 0; i <myIntArray.length ; i++) {
                myIntArray[i] = i * 10;

            }
           printArray(myIntArray);
        }
        public static void printArray (int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println("element " + i + " value is  " + array[i]);

            }
        }
}
