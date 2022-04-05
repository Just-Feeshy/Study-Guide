import java.util.Arrays;

/**
* Practice recursion for my AP class.
*/

/**
* getTotalFromArray rules:
* 1) ArrayList isn't allowed
* 2) Only have one parameter.
* 3) No index integers allowed.
* 4) Must use recursion.
* 5) No outside variables allowed.
* 6) Must return the sum of the array put inside.
* 7) No loops of any kind allowed
*/
class MyStuff {
    MyStuff() {
        return;
    }

    public int getTotalFromArray(int[] ar) {
        if(ar.length > 1) {
            return getTotalFromArray(Arrays.copyOfRange(ar, 1, ar.length)) + ar[0];
        }else {
            return ar[0];
        }
    }
}