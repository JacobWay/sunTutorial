class ArithmeticDemo{
    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int originalResult = result;
        result -=  1;
        System.out.println(originalResult + " - 1 = " + result);
    }
}
