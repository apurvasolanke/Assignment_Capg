import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaXFinder1Test {

    @Test
    void main() {
        int[] arr={56,34,7,3,54,3,34,34,53};
        int n=3;
        int m=56;
        assertEquals(n,MinMaXFinder1.findMin(arr));
        assertEquals(m,MinMaXFinder1.findMax(arr));

    }
    @Test
    void mainNeg(){

        int[] arr1={5,34,7,3,54,3,34,34,53};
        int n=3;
        int m=56;
        assertEquals(n,MinMaXFinder1.findMin(arr1));
        assertEquals(m,MinMaXFinder1.findMax(arr1));
    }
    @Test
            void exception(){
int[] a={1,2,3};
        ClassCastException thrown = Assertions
                .assertThrows(ClassCastException.class, () -> {
                    int n=a[0];
                }, "type casting exception");

        Assertions.assertEquals(" ", thrown.getMessage());
    }


    @Test
    void findMin() {
        int[] arr={56,34,7,3,54,3,34,34,53};

        int n=3;
        assertEquals(n,MinMaXFinder1.findMin(arr));

    }
    @Test
    void findMinNeg(){
        int[] arr1={5,34,7,30,54,34,34,34,53};
        int n=3;
        assertEquals(n,MinMaXFinder1.findMin(arr1));
    }

    @Test
    void findMax() {
        int[] arr={56,34,7,3,54,3,34,34,53};
        int m=56;
        assertEquals(m,MinMaXFinder1.findMax(arr));

    }
    @Test
    void findMaxNeg(){
        int[] arr1={5,34,7,3,54,3,34,34,53};
        int m=56;
        assertEquals(m,MinMaXFinder1.findMax(arr1));
    }
}


