import java.util.Random;
public class selectionsort {
    public static void main(String[] args) {
        StopWatch measure = new StopWatch();
        measure.start();
        long [] array = new long[100000];
        for (int i=0;i<array.length;i++){
            Random generator = new Random();
            array[i] = generator.nextLong();
        }
        long temp = 0;
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++)
            if (array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j]=temp;
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        measure.stop();
        long time = measure.getElapsedTime();
        System.out.println("Tổng thời gian: " + time + " millisecond");
    }
}
