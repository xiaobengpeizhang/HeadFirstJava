public class Duck {
    private int size;

    public Duck(int duckSize) {

        System.out.println("Class Duck Init");

        size = duckSize;
        System.out.println("size is " + size);
    }

    public  Duck() {
        size = 27;
    }

    public boolean isBig() {
        System.out.println(size);
        return size > 10;
    }
}

class Duck2 extends Duck {
    public Duck2(){

    }
}
