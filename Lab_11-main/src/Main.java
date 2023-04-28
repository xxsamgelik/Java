import java.text.NumberFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Employee romanSemenyk = new Employee("Semenyuk Roman Olegovich", 15000.545);
        System.out.println("Выберите язык: \n 1 - ru \n 2 - us");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
                printInfo("ru", "RU");
                System.out.println(FullReport.Printinfo(romanSemenyk, "ru", "RU"));
                NumberFormat numberFormat1 = NumberFormat.getInstance(new Locale("ru"));
                System.out.println("ЗП - " + numberFormat1.format(romanSemenyk.getSalary()));
                break;
            case 2:
                printInfo("us", "US");
                System.out.println(FullReport.Printinfo(romanSemenyk, "us", "US"));
                NumberFormat numberFormat2 = NumberFormat.getInstance(new Locale("us"));
                System.out.println("ZP - " + numberFormat2.format(romanSemenyk.getSalary()));
                break;
        }
    }
    public static void printInfo(String language, String county)
    {
        Locale current = new Locale(language, county);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("java", current);
        for (String key: resourceBundle.keySet())
        {
            System.out.println(resourceBundle.getString(key));
        }
    }
}