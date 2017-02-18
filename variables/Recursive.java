class Recursive {
    public static void main(String[] args){
        Recursive r = new Recursive();
        r.someMethodRecursive(3);

    }

    void someMethod() {
        for (int i=0; i<3; i++){
            System.out.println(i);
        }
    }

    int someMethodRecursive(int i) {
        if (i == 0){
            return 0;
        }
        System.out.println(i);
        return someMethodRecursive(i-1);
    }
}
