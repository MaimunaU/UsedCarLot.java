import java.util.ArrayList;
import java.util.Arrays;
public class Runner {
    public static void main(String [] args) {
        Integer[] intsArray = {1, 2, 3, 4, 5};
        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Idk", 2345);
        Car car2 = new Car("Hehe", 1234);
        Car car3 = new Car("Squeek", 6789);
        Car[] carList = {car1, car2, car3};
        ArrayList<Car> carArray = new ArrayList<Car>(Arrays.asList(carList));
        System.out.println(carArray);
    }
}
