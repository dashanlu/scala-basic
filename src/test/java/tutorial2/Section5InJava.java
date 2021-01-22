package tutorial2;

import oo.variance.Apple;
import oo.variance.Fruit;
import oo.variance.Pear;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class Section5InJava {

    @Test(expected = ArrayStoreException.class)
    public void arrayCovariance() {
        Apple[] apples = {new Apple(), new Apple(), new Apple()};

        Fruit[] fruits = apples;

//        it is not immutable
        fruits[0] = new Pear();
    }

    @Test
    public void listInvariance() {//type erasure
//        Collection<Apple> appleList = Arrays.asList(new Apple(), new Apple(), new Apple());
        //invariance
//        FruitProcessor.count(appleList);

    }


}

class FruitProcessor {

//    public static int count(final Collection<Object> trickyOne) {
//        return Optional.ofNullable(trickyOne).map(x -> x.size()).orElseGet(() -> 0);
//    }

    public static int count(final Collection<Fruit> fruits) {
        return Optional.ofNullable(fruits).flatMap(x -> Optional.of(x.size())).orElse(0);
    }

}

