public class initTeach {

    int t = 10;


    {
        int a = 10;
        int b = a * 7;
        if (a == b)
            System.out.println(333);
    }

    static int tt = 9;

    private void homework(int index) {
        int a = 1;
        int b = 1;
        int s;

        for (int i = 1; i <= index; i++) {

            if (index == 1 || index == 2) {
                System.out.println(1);

            } else {


                s = a + b;
                a = b;
                b = s;
                System.out.println(s);
            }
        }
    }

    initTeach(int t) {
       //t=this.t;/
        System.out.println("start 构造函数");
    }


    public static void main(String[] args) {
        initTeach testFei = new initTeach(5);
      // testFei.homework(4);
    }

}

