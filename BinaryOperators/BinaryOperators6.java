public class Task3Loop {
    public static void main(String[] args) {
        short x=7;
        System.out.println(Integer.toBinaryString(x));
        int counter=0;
        for (int i = 0; i < 32; i++) {
           int pos=(x&(1<<i))>>i;

            if(pos==1){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
