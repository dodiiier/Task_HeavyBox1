import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<HeavyBox> treeSetHeavyBox = new TreeSet<HeavyBox>();
        HeavyBox oneBox = new HeavyBox(100, 80, 10, 5000);
        HeavyBox twoBox = new HeavyBox(120, 90, 3, 6000);
        HeavyBox freeBox = new HeavyBox(98, 95, 6, 3500);
        HeavyBox fourBox = new HeavyBox(112, 98, 7, 4800);
        treeSetHeavyBox.add(oneBox);
        treeSetHeavyBox.add(twoBox);
        treeSetHeavyBox.add(freeBox);
        treeSetHeavyBox.add(fourBox);
        Task1.sortSet(treeSetHeavyBox);
    }

    public static void sortSet(Set<HeavyBox> treeSetHeavyBox) {
        for (HeavyBox box1 : treeSetHeavyBox) {
            System.out.println(box1);
        }
    }
}
