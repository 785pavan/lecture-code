package de.ovgu.icse.lecture02;

public class AverageWithoutMethod {

    public static void main(String[] args) {
        int[] data = {7, 8, 5, 3, 7, 7, 6, 9};

        int sum = 0;
        int i = 0;
        int counter = 0;
        double avg = 0.0;
        while(counter < data.length){
            sum += data[i];
            counter++;
        }
        if (counter > 0) {
            avg = (double) sum/(double) counter;
        }
        System.out.println(avg);
    }
}
