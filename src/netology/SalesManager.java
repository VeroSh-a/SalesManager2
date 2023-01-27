package netology;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min(){
        int min =2147483647;
        for (int saleMin : sales){
            if (saleMin < min) {
                min = saleMin;
            }
        }
        return min;
    }
    public int middleResult(){
        // среднее арифметическое - сумма всех чисел, деленная на их количество
        int middleSales = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            middleSales = ((sum - min()) - max())  / (sales.length - 2);
        }
        return middleSales;
    }
}
