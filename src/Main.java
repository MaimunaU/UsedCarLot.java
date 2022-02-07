import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(5);
        ints.add(24);
        System.out.println(ints);

        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;
        ArrayList<Integer> numList1 = new ArrayList<Integer>();
        numList1.add(num1);
        numList1.add(num2);
        numList1.add(num3);
        int sum = num1 + num2 + num3;
        numList1.add(sum);
        System.out.println(numList1);

        //--------------------------------
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]
        numList.add(0, 6);  //numList: [6, 3]
        numList.add(7);
        numList.add(2, 8);
        numList.set(3, 9);
        numList.add(1, 2);
        numList.add(1, numList.size());
        numList.remove(4);
        numList.set(4, 0);
        System.out.println(numList);

    }
}
