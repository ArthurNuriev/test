import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }

        list.remove(5);
        System.out.println(list);

    }
}
