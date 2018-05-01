public class HelloWorld {

    public static void main(String[] args) {
//        System.out.println(chengfa(4500, 13));
//        System.out.println(jianfa(2018, 1993));
//        System.out.println(chufa(99, 22));
//        System.out.println(add(10, 99));

//        TestFei yan = new TestFei();
//        yan.mieyan();
//        yan.dianyan();

        int i=1;

        while (i<=10){

            System.out.println(i);
            if (i==7){
            System.out.println("bingo");
            continue;
            }
            i++;
        }

    }

    static int jianfa(int a, int b) {
        return a - b;
    }

    static int chufa(int a, int b) {
        return a / b;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int chengfa(int a, int b) {
        return a * b;
    }

}