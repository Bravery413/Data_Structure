public class A {
    public static int i=1;
    public A(int i){
        int k=this.i;//为10
        int j=i;
        System.out.println(k);
        System.out.println(j);
        this.i=i;
//        i=this.i;//对象值为1
    }
    public A(){

    }

}
