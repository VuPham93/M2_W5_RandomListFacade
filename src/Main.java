import com.codegym.ListFilter;
import com.codegym.ListPrinter;
import com.codegym.RandomList;

public class Main {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(), new ListFilter(), new ListPrinter());

        randomListFacade.printRandomEvenList(30,1, 20);
    }
}
