import easy.DetectCapital;

public class Main {

    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();
        if (!dc.detectCapitalUse("USA")) {
            return;
        }
        System.out.print("USA");
    }

}
