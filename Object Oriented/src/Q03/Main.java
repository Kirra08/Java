package Q03;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "tarou";
        s1.score = 75;
        s2.name = "hanako";
        s2.score = 80;

        s1.showScore();
        s2.showScore();
    }
}
