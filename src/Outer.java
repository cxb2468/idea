public class Outer {

    private  int  a = 100;
    int b =5;

    public  class  Inner{
        int b = 3;

        public void  test(){
            System.out.println("访问外部类中的a:" + a);
            System.out.println("访问外部类中的b要this指向:"+ Outer.this.b);
            System.out.println("直接调用b是内部的:"+b);
        }

    }
    public static void main(String[] args){
        Outer o = new Outer();
        Inner i = o.new Inner();
        i.test();
    }
}
