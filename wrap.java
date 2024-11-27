public class wrap {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // Integer num =new Integer(45);
        // Integer num=45;

        Integer a=10;
        Integer b=34;
        swap(a, b);
        System.out.println(a + "" +b);
        
    }
    // static void swap(int a,int b){
    //     int temp =a;
    //     a=b;
    //     b=temp;

    static void swap(Integer a,Integer b){
        int temp =a;
        a=b;
        b=temp;
    }
}
