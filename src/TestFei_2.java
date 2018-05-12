public class TestFei_2 {

    private void homework(int index) {
        int a = 0;
        int b = 1;
        int s;

        for (int i = 1; i <= index; i++) {

            if (i == 1 || index == 2) {
                System.out.println(1);
            } else {
                s = a + b;
                a = b;
                b = s;

                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        TestFei_2 testFei = new TestFei_2();
        testFei.homework(1);
    }

}

