package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListInterface {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        // thêm phần tử vào listString
        listString.add("Monday");
        listString.add("Tuesday");
        listString.add("Wednesday");
        listString.add("Thursday");
        listString.add("Friday");
        listString.add("Saturday");
        listString.add("Sunday");

        // hiển thị các phần tử sử dụng Iterator
        Iterator<String> iterator = listString.iterator();

        System.out.println("Hiển thị phần tử sử dụng Iterator: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // hiển thị các phần tử sử dụng ListIterator
        ListIterator<String> listIterator = listString.listIterator();

        System.out.println("\nHiển thị phần tử sử dụng ListIterator: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nHiển thị các phần tử của List theo thứ tự từ dưới lên: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // thay đổi phần tử bất kỳ trong listString
        System.out.println("\nNhập vào phần tử mới: ");
        String element = scanner.nextLine();
        System.out.println("Nhập vào giá trị của phần tử cần thay đổi: ");
        int index = scanner.nextInt();
        listString.set(index, element);

        System.out.println("Các phần tử có trong listString sau khi thay đổi: ");
        for (String str : listString) {
            System.out.println(str);
        }

        // xóa phần tử vừa thay đổi trong listString
        listString.remove(index);

        System.out.println("\nCác phần tử có trong listString sau khi xóa: ");
        for (String str : listString) {
            System.out.println(str);
        }

        List<String> listSource = new ArrayList<String>();

        listSource.add("A");
        listSource.add("B");
        listSource.add("C");
        listSource.add("D");

        // danh sách đích
        // số phần tử của listDest phải lớn hơn hoặc bằng
        // với số phần tử của listSource
        List<String> listDest = new ArrayList<String>();

        listDest.add("V");
        listDest.add("W");
        listDest.add("X");
        listDest.add("Y");
        listDest.add("Z");

        // sao chép các phần tử của listSource
        // vào trong listDest
        Collections.copy(listDest, listSource);

        System.out.println("Các phần tử có trong listDest: ");
        for (String str : listDest) {
            System.out.println(str);
        }

        // tạo 1 listNumber có kiểu dữ liệu là Integer
        List<Integer> listNumber = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            listNumber.add(i);
        }

        System.out.println("Các phần tử trong listNumber trước khi hoán vị: ");
        // hiển thị các phần tử trong listNumber ở dạng mảng
        System.out.println(listNumber);

        Collections.shuffle(listNumber);

        System.out.println("Các phần tử trong listNumber sau khi hoán vị: ");
        System.out.println(listNumber);

    }
}
