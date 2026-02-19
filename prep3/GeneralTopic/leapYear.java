package GeneralTopic;

public class leapYear {
    static void main() {
        checkLeaptyear(2000);
    }


    static void checkLeaptyear(int year) {
        while (year > 0) {
            if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
                System.out.println(year + " <=> is Leap year");
                break;
            } else {
                System.out.println(year + " <=> is not the leap Year !!!");
                break;
            }
        }
    }
}
