public class HomeWork {
    int t = 10;

    HomeWork(int t) {
        this.t=t;
        System.out.println("2.t=" + t);
    }

    public void hm() {
        t++;
        System.out.println("3.t=" + t);
    }

    static void hm2() {
        System.out.println("static");

    }

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork(20);
//        homeWork.hm(2);
//        homeWork.hm2(3);


    }
}
