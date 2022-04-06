class DoStuff {
    DoStuff() {
        return;
    }

    public int addingUpTo(int[] ar, int num) {
        int result = ar[num];

        if(num == 0) {
            return result;
        }

        return result + addingUpTo(ar, num - 1);
    }

    public String reverseString(String string) {
        if(string == "") {
            return "";
        }

        return string.charAt(string.length() - 1) + reverseString(string.substring(0, string.length() - 1));
    }

    public int notFun(int x) {
        if(x < 1) {
            return 1;
        }else {
            return x + notFun(x - 3) - notFun(x - 2);
        }
    }

    public int remember(int x) {
        if(x < 1) {
            return 1;
        }else {
            return x + notFun(x - 3) + notFun(x - 2);
        }
    }

    public void build(int x) {
        if(x / 5 <= 0) {
            System.out.print(x % 5);
        }else {
            System.out.print((x % 5));
            build(x / 5);
        }
    }

    public void wow(String huh, int pos) {
        if(pos >= huh.length()) {
            System.out.print(huh.substring(0, huh.length() / 2));
        }else {      
            System.out.print(huh.substring(pos));
            wow(huh.substring(pos), pos + 2);
        }
    }

    //Test
    public int test1(int x) {
        if(x < 1) {
            return 0;
        }else {
            int stare = x - test1(x - 3) + test1(x - 2);
            
            System.out.print(stare + " ");
            return stare;
        }
    }
}