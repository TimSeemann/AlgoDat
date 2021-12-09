package bruteForce.sort;

public abstract class Sort implements ISort{
    protected int[] zahlen;
    @Override
    public void add(int[] input) {
        zahlen=input;
    }
}
