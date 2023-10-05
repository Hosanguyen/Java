import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        Date ngayDen = sdf.parse(scanner.nextLine());
        Date ngayDi = sdf.parse(scanner.nextLine());
        System.out.println(ngayDen);
        System.out.println(ngayDi);
        scanner.close();
    }
}
