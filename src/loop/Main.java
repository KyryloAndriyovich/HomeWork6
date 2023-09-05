package loop;

public class Main {
    public static void main(String[] args) {
        int currentNum = 1;
        int range = 6;
        int sum = 0;
        int lineNum = 1;

        while (currentNum <= range) {
            sum += currentNum;
            System.out.println(lineNum + ")Num is " + currentNum + ", sum is " + sum);
            currentNum++;
            lineNum++;
        }
        System.out.println("------------------------\n" +
                "Sum of numbers is " + sum);
    }

}
