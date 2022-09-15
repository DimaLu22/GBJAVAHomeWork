public class triangnum {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d - %d\n", i, calc3num(i));
        }
    }    
        static int calc3num(int n) {
        return (n * (n + 1))/2;
        }
}
