public class AverageScore {
    public static void main(String[] args) {
        int [] scores = {61,57,95,85,75,65,44,66,90,32};
        int sum = 0;
        for (int i = 0;i<scores.length;i++){
            sum += scores[i];
        }
        float avg = sum / scores.length;
        System.out.println("Avg"+ avg);
    }
}

