// Functional Interface: consists of only one abstract method

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@FunctionalInterface
//interface MyInterface{
//    Integer display(String str);
//}

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Function<String,Integer> f1= str->str.length();
        Integer i1=f1.apply("Abhi");
        System.out.println("Value of i1: "+i1);

        BiFunction<Integer,Integer,Integer> bi=(a,b)->a+b;
        Integer i2=bi.apply(10,20);
        System.out.println("Value of i2: "+i2);

        Function<String,Integer> f3= str->str.length();
        Function<Integer,Integer> f4=value->value*10;
        Integer i3=f3.andThen(f4).apply("John");
        System.out.println("Value of i3: "+i3);

        BinaryOperator<Integer> bio=(a,b)->a+b;
        Integer i4=bio.apply(20,30);
        System.out.println("value of i4: "+i4);

        UnaryOperator<Integer> u=val->val*10;
        Integer i5=u.apply(20);
        System.out.println("Value of i5: "+i5);

        //Predicate
        List<String> countries= Arrays.asList("India","US","Japan","China","France");

        Predicate<String> p=c->!"China".equals(c);
        List<String> newCountries=countries.stream()
                .filter(p)
                .collect(Collectors.toList());

        System.out.println(newCountries);

        BiPredicate<String,Integer> bip=(str,val)->{
          return str.length()==val;
        };
        boolean flag=bip.test("Peter",5);
        System.out.println("Flag is: "+flag);

        Consumer<Integer> c=con-> System.out.println(con);
        c.accept(100);

        BiConsumer<Integer,Integer> bic=(a,b)-> System.out.println(a+b);
        bic.accept(20,30);

        List<String> values=Arrays.asList("Apple","Orange","Banana","Grapes");
//        values.forEach(fruit-> {
//            System.out.println(fruit);
//        });
        List<String> values1=values
                .stream()
                .map(f->f.toUpperCase())  //transformation
                .sorted()
                .collect(Collectors.toList());
        System.out.println(values1);

        //findAny, findFirst()

        Optional<String> fruit=values1.stream().findFirst();
        System.out.println(fruit.get());

        Optional<String> fruit1=values1.stream().findAny();
        System.out.println(fruit1.get());

        //Optional
        Optional<String> optionalStr=Optional.of("Abhi");
        if(optionalStr.isPresent()){
            System.out.println("Name is: "+optionalStr.get());
        }

        String[][] array=new String[][]{{"a","b"},{"c","d"},{"e","f"}};
       // Stream<String[]> stream=Arrays.stream(array);
        // {"a","b","c"}
        String[] data=Stream.of(array)
                .flatMap(Stream::of)
                .toArray(String[]::new);

        for (String v:data){
            System.out.println(v);
        }
    }
}

// Functional Interfaces
// Collections / Functional
// Multithreading
// Java 8 Streams
// Java Date Time
// File Handling

