package pack1;

public class Main {
    public static void main(String[] args) {

        NumbersFunction nf = number -> Integer.parseInt(String.valueOf(new StringBuilder(number + "").reverse()));
        int result = nf.process(1234);
        System.out.println("Развернутое число - " +  result);

        nf = number -> Integer.parseInt(String.valueOf(number).replaceAll("0", ""));
        result = nf.process(10203040);
        System.out.println("Число без нулей - " + result);


        StringFunction sf = str -> String.valueOf(new StringBuilder(str).reverse());
        String res = sf.process("Задом наперед");
        System.out.println("Резвернутая строка - " + res);

        sf = str -> str.replaceAll("\\d", "");
        res = sf.process("c1т2р3о4к5а");
        System.out.println("Строка без цифр - " + res);

        sf = String::toUpperCase;
        res = sf.process("строка");
        System.out.println("Строка большими буквами - " + res);
    }
}
