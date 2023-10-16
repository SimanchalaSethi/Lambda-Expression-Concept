public class Lambda {
    public static void main(String[] args) {
        System.out.println("hello");
//     MyInter myInter = new MyInterImpl();
//     myInter.sayHello();

//        MyInter myInter = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is my first anonymous class");
//            }
//        };
//        myInter.sayHello();;
//
        // using our interface with the help of lambda
        MyInter i = () -> {
            System.out.println("This is first time am using Lambda");
        };
        i.sayHello();
        MyInter i2 = () -> System.out.println("This is second time am using lambda");
        i2.sayHello();

        SumInter sumInter = (a, b) -> {
            return a + b;
        };
        System.out.println(sumInter.sum(12, 12));

        SumInter sumInter2 = (a, b) -> a + b;
        System.out.println(sumInter2.sum(10, 10));

        LengthInter lengthInter = str -> str.length();

        System.out.println(lengthInter.getlength("simanchala"));
    }


}
