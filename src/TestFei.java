public class TestFei {

    private void homework(int index) {
        int a = 1;
        int b = 1;
        int s;

        for (int i = 1; i <= index; i++) {

            if (i == 1 || i == 2) {
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
        TestFei testFei = new TestFei();
        testFei.homework(5);
    }

}

