class NumberIsEven {
    public static void main(String[] args) {
        Integer number = Integer.parseInt(args[0]);
        System.out.printf("%s is %s \n", number, number % 2 == 0 ? "Even" : "Odd");
    }    
}