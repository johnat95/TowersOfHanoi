import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Stack;

public class TowersOfHanoi {

    private Stack<String> rod1 = new Stack<>();
    private Stack<String> rod2 = new Stack<>();
    private Stack<String> rod3 = new Stack<>();

    private String disk1 = "   *|*   ";
    private String disk2 = "  **|**  ";
    private String disk3 = " ***|*** ";
    private String disk4 = "****|****";
    private String blank = "    |     ";

    public void start(){
        setupRods();
        printStacks();
    }

    private void setupRods(){
        rod1.add(disk4);
        rod1.add(disk3);
        rod1.add(disk2);
        rod1.add(disk1);

        rod2.add(blank);
        rod2.add(blank);
        rod2.add(blank);
        rod2.add(blank);

        rod3.add(blank);
        rod3.add(blank);
        rod3.add(blank);
        rod3.add(blank);
    }

    private void sort(){


    }

    private void printStacks(){

        Object[] rod1Array = rod1.toArray();
        Object[] rod2Array = rod2.toArray();
        Object[] rod3Array = rod3.toArray();
        for(int i = rod1Array.length-1;i>=0;i--) {

            System.out.printf("%s   %s  %s\n",rod1Array[i], rod2Array[i], rod3Array[i]);
        }

    }
}
