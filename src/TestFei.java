public class TestFei {

    public static void main(String[] args) {
        TestFei testFei = new TestFei();
        testFei.homework(13);
    }

    private void homework( int index) {
        /**
         *
         */
        int a =1;
        int b =1;
        int s =0;
        if (index<3) {
            System.out.println(1);
        }
            else
            for (index = 3; index <= 13; index++) {


                s = a + b;
                a = b;
                b = s;
            }
            System.out.println(s);
        }
    }

