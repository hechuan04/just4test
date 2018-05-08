public class HomeWork {
    int t = 10;
//  sout
    HomeWork(int t) {
        t++;
        System.out.println("2.t=" + t);
    }

    public void hm(int t) {
        t++;
        System.out.println("3.t=" + t);
    }

    static void hm2(int t) {
        System.out.println("static");

    }

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork(5);
        homeWork.hm(2);
        homeWork.hm2(3);


    }
}
