import recursion.*;
import arraysHashing.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("hello","there" , "How","are","you");
        System.out.println(StringEncodeAndDecode.encode(list));
        System.out.println(StringEncodeAndDecode.decode("Hello there how are you"));

    }
}