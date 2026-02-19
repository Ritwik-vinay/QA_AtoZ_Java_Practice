package GeneralTopic;

public class evenAndOddInRange {
    static void main() {
        even_and_odd_Checker(1, 10);
    }

    static void even_and_odd_Checker(int startNum, int endNum) {
        startNum = 1;
        endNum = 10;
        System.out.println(" Even Number in the range [ " + startNum + " , " + endNum + " ];");
        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Odd Number in the range [ " + startNum + " , " + endNum + " ];");
        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
