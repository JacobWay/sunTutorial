class MultiDimensionalArrayDemo {
    public static void main(String[] args){
        String[][] names = {
            {"Mr.", "Mrs."},
            {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names.length);
    }
}
