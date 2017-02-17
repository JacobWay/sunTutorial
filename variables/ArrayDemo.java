class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 3 integers
        anArray = new int[3];

        // initializes the array
        for (int i=0; i<3; i++) {
            anArray[i] = i + 1;
        }

        // prints out the elements of the array
        for (int i=0; i<3; i++){
            System.out.println(anArray[i]);
        }
    }
}
