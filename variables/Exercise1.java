class Exercise1 {
    static int anInt;

    void get(){
        int localVariable = 5;
        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        Exercise1 anExercise = new Exercise1();
        anExercise.get();
    }
}
