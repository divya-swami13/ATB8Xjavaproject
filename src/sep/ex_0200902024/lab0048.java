package sep.ex_0200902024;

public class lab0048 {
    public static void main(String[] args) {
         // write code
        char grade = 'F';
        int score = 89;// in the future we will get this from the users.input

        if (score >=90 && score <= 100){
            grade= 'A';
        }else if (score >=80 && score <=89){
            grade = 'B';
        }else if (score >=70 && score <=79){
            grade = 'C';
        }else if (score >= 60 && score <= 69){
            grade = 'D';
        }else if (score <= 0 || score > 100){
            System.out.println("LOL!!, are you god?");
            grade = 'o';
        }else {
            grade = 'F';
        }
        System.out.println("your grade is ->" + grade);
    }
}