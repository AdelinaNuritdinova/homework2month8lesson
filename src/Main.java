public class Main {
    public static void main(String[] args) {
        Box<Double , Integer> box1 = new Box<>(1.0, 1);
        Box<Float , Float> box2 = new Box<>(1.0f, 1.0f);


        addition(box1 , box2);
        multiplication(box1 , box2);

    }

    public static void addition(Box <? extends Double , ?extends Integer> box1 , Box <? extends  Float , ? extends Float> box2) {
        Number number = box1.getNumber1()+box1.getNumber2()+box2.getNumber1()+box2.getNumber2();
        System.out.println(number);
    }

    public static void multiplication(Box <? extends Double , ?extends Integer> box1 , Box <? extends  Float , ? extends Float> box2) {
        Number number1 = box1.getNumber1()*box1.getNumber2()*box2.getNumber1()*box2.getNumber2();
        System.out.println(number1);

    }
}
