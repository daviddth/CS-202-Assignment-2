import org.junit.Test;

import static org.junit.Assert.*;

public class generic_binary_searchTest {
    @Test
    public void binarySearch() throws Exception {
        generic_binary_search tester = new generic_binary_search();
        int testUserInputKey1 = 5;
        Integer[] testSomeList1 = new Integer[10];
        testSomeList1[0] = 1;
        testSomeList1[1] = 2;
        testSomeList1[2] = 3;
        testSomeList1[3] = 3;
        testSomeList1[4] = 5;
        testSomeList1[5] = 7;
        testSomeList1[6] = 8;
        testSomeList1[7] = 8;
        testSomeList1[8] = 9;
        testSomeList1[9] = 9;
        System.out.println(testSomeList1);
        //assertEquals("UserInputSize: 10 and UserInputKey: 5", 4, tester.binarySearch(testSomeList1, testUserInputKey1));

       /* int testUserInputKey2 = 7;
        int testSomeList2[] = {3, 1, 18, 8, 1, 9, 19, 4, 6, 15, 5, 16, 4, 3, 19, 10, 8, 17, 13, 14};
        assertEquals("UserInputSize: 20 and UserInputKey: 7", -1, tester.binarySearch(testSomeList2, testUserInputKey2));*/
    }

}