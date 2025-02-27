package Java_M_Task;

public class class133_strBuild_strBuff_performance {
    public static void main(String[] args) {
        long startTime, endTime;

        // StringBuffer Test
        StringBuffer sb = new StringBuffer("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // StringBuilder Test
        StringBuilder sbuilder = new StringBuilder("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sbuilder.append(" World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}



