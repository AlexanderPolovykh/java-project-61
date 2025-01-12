package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        var result = scanner.next();
        scanner.close();
        return result;
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        var result = scanner.nextInt();
        scanner.close();
        return result;
    }
}
