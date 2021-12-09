package bruteForce.sort;

public class Main {
    public static void main(String[] args) {

        Bubble bubble = new Bubble();
        bubble.add(InAndOut.getZahlen(10,10));
        InAndOut.out(bubble.sort());
    }
}
