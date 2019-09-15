import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
// 1
        Stream.iterate(0, n -> n + 1 )
              .map(n -> n*(n+1)/2)
              .limit(10)
              .forEach(System.out::println);
// 2
// a
        System.out.println("Please enter some words: ");
        var stopWords = List.of("a", "an", "the", "so", "it", "do", "did", "for", "by", "of", "to");
// b
        var usrList = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        String s;

        while(!(s = sc.nextLine()).isEmpty()) {
            usrList.add(s);
        }

        sc.close();
// c
        usrList.stream()
               .distinct()
               .filter(str -> !(stopWords.contains(str)))
               .sorted(Comparator.reverseOrder())
               .forEach(System.out::println);

    }
}