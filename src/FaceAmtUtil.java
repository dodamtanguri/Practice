
import java.net.Inet4Address;
import java.text.DecimalFormat;
import java.util.stream.Stream;

public class FaceAmtUtil {
    public static void main(String[] args) {
        String[] test = {
                "123.000",
                "               5123123",
                "0.3212332111",
                "()()()@#$%#@#$@#$35000",
                "35,000",
                "150000000",
                "78",
                "0"
        };
        Integer[] arr = Stream.of(test).map(el -> {
            String temp = el.replaceAll("[^0-9.]","");
            return Integer.parseInt(new DecimalFormat("#").format(Double.parseDouble(temp)));
        }).toArray(Integer[]::new);
        for(int el : arr) {
            System.out.println(el + " ");
        }
    }
}
