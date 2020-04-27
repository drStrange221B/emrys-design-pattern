import com.emrys.design.factory.FruitFactory;
import com.emrys.design.factory.Fruits;

public class Main {

    public static void main(String[] args) {
        System.out.println("#########  Factory Design pattern  ############");

        Fruits fruits = new FruitFactory().getFruits("apple");

        System.out.println(fruits.color());
    }
}
