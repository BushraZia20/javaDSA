
    public class Functions {

        /*
         * functions/methods
         * seraching - linear and binary
         * sorting - bubble,insertion,selection,quick and merge
         * oops
         * 
         * create a method
         * 
         */
    
        static void method() {
            // code to executed
            System.out.println("HelloWorld:");
        }
    
        static void Bushra() {
            System.out.println("Heavy driver");
        }
    
        static void Sum(int a, int b) {
    
            System.out.println(a + b);
        }
    
        static void Name(String s, int age) {
            System.out.println(s + " is " + age);
        }
    
        static int sum(int x) {
            return 5 + x;
        }
    
        public static int summ(int x, int y) {
            return x + y;
        }
    
       // if a person is above 18 then he can get a drive licence
        public static void checkAge(int age) {
            if (age >= 18) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    
        public static void main(String args[]) {
            method();
            Bushra();
            Sum(8, 10);
            Name("Bushra", 25);
            Sum(5, 7);
            System.out.println(sum(3));
            System.out.println(summ(8, 90));
            int sum4 = summ(6, 9);
            System.out.println(sum4);
            checkAge(16);
        }
    
    }

