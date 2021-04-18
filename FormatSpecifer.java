package BeginnerJava;

public class FormatSpecifer {
    public static void main(String[] args){
        boolean b = true;
        char c = 'A';
        short s = 32757;
        int i = 346456;
        float f = 43.643f;
        double d = 35.534534;

        System.out.printf("boolean = %b\n",b);
        System.out.printf("char = %c\n",c);
        System.out.printf("short = %d\n",s);
        System.out.printf("int = %d\n",i);
        System.out.printf("float = %.1f\n",f);
        System.out.printf("double = %.2f\n",d);

    }
}
