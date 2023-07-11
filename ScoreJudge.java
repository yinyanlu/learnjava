public class ScoreJudge{
    public static void main(String[] args) {
        int score = 78;
        if (score >= 60) {
            if (score >=80){
                if (score >=90) {
                    System.out.println("Excelant");
                }else{
                    System.out.println("WellDone");
                }
            }
            else {
                System.out.println("Good");
            }
        }
        else {
            System.out.println("Bad.");
        }
    }
}
