public class MyStringBuffer {

    private int capacity;
    private char[] value;
    private int length;
    public MyStringBuffer(){
        this(16);
    }

    public MyStringBuffer(int capacity){
        this.capacity = capacity;
        this.value = new char[capacity];
    }

    public MyStringBuffer append(String str){
        String s = str;
        if(null == str){
            s = "null";
        }
        //check if need to expand capacity
        int needCapacity = this.length + s.length();
        if(needCapacity > capacity){
            int expandTo = Math.max(needCapacity, 2*capacity);

            char[] tmp = new char[expandTo];
            for(int i = 0;i< this.length;i++){
                tmp[i] = value[i];
            }

            this.value = tmp;
            this.capacity = expandTo;
        }

        //append str
        for (int i = 0; i < s.length(); i++) {
            this.value[length + i] = s.charAt(i);
        }

        //
        this.length += s.length();
        return this;
    }

    @Override
    public String toString() {
        return new String(value,0,length);
    }
}
