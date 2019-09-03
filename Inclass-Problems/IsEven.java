class IsEven {
    public static void main(String[] args) {
        int input = 3;
        if (isEven(input)) {
            System.out.printf("%s is an even number \n", input);
        } else {
            System.out.printf("%s is an odd number \n", input);
        }
    }
    
    public static boolean isEven(int input) {
        return input % 2 == 0 ? true : false;
    }
}