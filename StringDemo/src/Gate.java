public class Gate {
    public static void main(String []args){
        System.out.println("test begin");
        MyStringBuffer msb = new MyStringBuffer();
        msb.append("hello");
        System.out.println("after append hello: "+msb.toString());
        msb.append(null);
        System.out.println("after append null : "+msb.toString());
        msb.append("this is a long string need to append for test");
        System.out.println("after append a long: "+msb.toString());

        //to test run long
        testRunSpeed();
        testRunSpeedOri();

    }
    public static void testRunSpeed(){
        long start = System.nanoTime();
        MyStringBuffer msb = new MyStringBuffer().append("hello");
        System.out.println(msb.toString());
        long end = System.nanoTime();
        System.out.println("cost MyStringBuffer: "+(end-start));
    }
    public static void testRunSpeedOri(){
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer().append("hello");
        System.out.println(sb.toString());
        long end = System.nanoTime();
        System.out.println("cost StringBuffer: "+(end-start));
    }

}
