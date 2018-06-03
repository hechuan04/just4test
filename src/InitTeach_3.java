import com.Iclazz_3;

public class InitTeach_3 {

    {
        Iclazz_3 homeWork = new Iclazz_3(20);
        System.out.println("tttt");
    }

    InitTeach_3(int i) {
        System.out.println(i);
    }

    InitTeach_3() {
        //com.Iclazz_3 homeWork = new com.Iclazz_3(20);
        System.out.println("init initTeach");
    }

    static void dtsfun() {
        System.out.println("static initTeach");
    }

    public static void main(String[] args) {
        InitTeach_3 initTeach = new InitTeach_3(21);
//        InitTeach_3.dtsfun();
    }

}