package bruteForce.sort;

public class Bubble extends Sort{

    @Override
    public int[] sort() {
        for(int i=0; i<zahlen.length;i++){
            for(int j=i;j>0;j--){
                int temp;
                if(zahlen[j]<zahlen[j-1]){
                    temp=zahlen[j];
                    zahlen[j]=zahlen[j-1];
                    zahlen[j-1]=temp;
                }
            }
        }
        return zahlen;
    }
}
