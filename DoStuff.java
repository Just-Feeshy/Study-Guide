class DoStuff {
    DoStuff() {
        return;
    }

    public int addingUpTo(int[] ar, int num) {
        int result = ar[num];

        if(num == 0) {
            System.out.println(result);
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
}