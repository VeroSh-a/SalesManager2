import netology.SalesManager;

public class SalesManagerRuner {
    public static void main(String[] args) {
//        long result;
//        long[] sales = {1, 3, 5, 7};
        int result;
        int[] sales = {1, 3, 5, 7};
        SalesManager SM = new SalesManager(sales);
        //result = SM.max();
        result = SM.middleResult();
        System.out.println(result);
    }
}
