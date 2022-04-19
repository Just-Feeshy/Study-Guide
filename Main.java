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

        int[] arr = {5, 7, 2, 1, 9, 3};
        
        int j = 0;
        int k = arr.length - 1;

        while(j < k) {
            int x = arr[j];
            arr[j] = arr[k];
            arr[k] = x;

            j++;
            k--;
        }

        System.out.println(arr[0]);
    }
}