class Main {
    public static int recursionTest(int counter) {
        //System.out.println(summers);
        
        if(counter >= 7) {
            return counter - 0;
        }

        return recursionTest(counter + 1) - 1;
    }
    
    public static void main(String[] args) {
        DoStuff n = new DoStuff();
        MyStuff y = new MyStuff();
        
        //System.out.println(n.addingUpTo(new int[] {1, 4, 5, 6}, 2));

        System.out.println(n.notFun(7));
        System.out.println(n.remember(5));
        n.build(51);
        n.wow("pacman", 2);

        
        System.out.println("\nrows:");
        n.test1(7);
        //System.out.println(y.getTotalFromArray(new int[] {76, 64, 1, 7, 54, 7, 9, 10, 1, 0, 7, 8}));
    }
}