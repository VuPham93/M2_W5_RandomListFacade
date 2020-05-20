import com.codegym.ListFilter;
import com.codegym.ListPrinter;
import com.codegym.RandomList;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }

    public void printRandomEvenList(int size, int min, int max) {
        List<Integer> numbers = randomList.generateList(size, min, max);
        List<Integer> filterNumbers = listFilter.filterOdd(numbers);
        listPrinter.printList(filterNumbers);
    }
}
