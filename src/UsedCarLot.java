import java.util.ArrayList;
/**
 * This class represents a used car lot
 *
 * @author Maimuna Ullah
 */
public class UsedCarLot {
    /** The car lot's inventory */
    private ArrayList<Car> inventory;

    /**
     * Used car lot constructor.
     * Sets its inventory to an empty car list.
     */
    public UsedCarLot() {

        inventory = new ArrayList<Car>();
    }

    /** Returns the car lot's inventory */
    public ArrayList<Car> getInventory() {

        return inventory;
    }

    /**
     * Adds a car object to the car lot's inventory
     *
     * @param car The car object being added to the inventory
     */
    public void addCar(Car car) {

        inventory.add(car);
    }

    /**
     * Swaps the cars at idx1 and idx2
     *
     * @param idx1 The index of the first car object being swapped
     * @param idx2 The index of the second car object being swapped
     * @return True if the indexes are valid (0 &lt;= idx &lt; inventory.size()) and swap was completed.
     * False if the indexes are invalid (inventory.size() &lt;= idx &lt; 0) and swap was not completed.
     */
    public boolean swap(int idx1, int idx2) {
        if ((idx1 > 0 && idx1 < inventory.size()) && (idx2 > 0 && idx2 < inventory.size())) {
            Car car1 = inventory.get(idx1);
            Car car2 = inventory.get(idx2);
            inventory.set(idx1, car2);
            inventory.set(idx2, car1);
            return true;
        }
        return false;
    }

    /**
     * Adds a car to inventory at specified index.
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index where the car object will be added
     * @param carToAdd The car object that is being added
     */
    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Removes a car object from the car lot's inventory at specified index.
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car object being removed
     * @return The car object being removed
     */
    public Car sellCarShift(int indexOfCarToSell) {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Sets the car object at the specified index to null.
     * PRECONDITION: 0 &lt;= indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car object that will be set to null
     * @return The car object that is being set to null
     */
    public Car sellCarNoShift(int indexOfCarToSell) {
        return inventory.set(indexOfCarToSell, null);
    }

    /**
     * Moves a car object at one index to another index.
     * PRECONDITION: 0 &lt;= indexOfCarToMove &lt; inventory.size()
     * PRECONDITION: 0 &lt;= destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the car object being moved
     * @param destinationIndex The index where the car object is being moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }
}
