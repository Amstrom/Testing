public class ForLoop {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        do
        {
            x1+=v1;
            x2+=v2;
            if (x1==x2)
                return "YES";
        }while (x1<=100000);

        return "NO";

    }

    public static void main(String[] args) {
        System.out.println(kangaroo(1113 ,612 ,1331 ,610));
        System.out.println("Sdsdkfhskjdfh hd");

    }
}
