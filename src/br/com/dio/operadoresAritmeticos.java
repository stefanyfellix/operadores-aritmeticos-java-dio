package br.com.dio;

public class operadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("prePos: ");
        prePos();
        System.out.println("aritmetico");
        aritmetico();
        System.out.println("atribuições");
        atribuicoes();

    }

    public static void prePos() {

        int a = 10;


        int b = ++a;
        int c = a--;
        int d = a;

        System.out.println("b: " + b);
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);

    }

    public static void aritmetico() {

        int x = 10;
        int y = 20;
        int z = 30;


        int r1 = x + y;
        int r2 = z - y;
        int r3 = z * x;
        int r4 = y / x;
        int r5 = z % y;

        System.out.println("x + y: " + r1);
        System.out.println("z - y: " + r2);
        System.out.println("z * x: " + r3);
        System.out.println("y / x: " + r4);
        System.out.println("z % y: " + r5);

    }

    public static void atribuicoes(){
        int i = 100;
        short s = 17;
        byte b = 2;
        long l = 500L;
        float f = 3.5F;
        double d = f;


        System.out.println("d: " + d);

        i += 5;
        s -= 7;
        b *= 100;
        l /= 100L;
        f %= d;

        System.out.println("i += 5: " + i);
        System.out.println("s -= 7: " + s);
        System.out.println("b *= 100: " + b);
        System.out.println("l /= 100L: " + l);
        System.out.println("f %= d: " + f);
    }

}
