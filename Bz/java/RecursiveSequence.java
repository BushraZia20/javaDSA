public class RecursiveSequence {
    
    
        private static int ans = 0;
        private static int start = 1;
    
        public static void main(String[] args) {
            int p = fn(5 );
            System.out.println(ans + p);
        }
    
        public static int fn(int num_of_terms) {
            if (num_of_terms == 0)
                return 0;
            ans += fn(num_of_terms - 1);
            int mul = 1;
            for (int i = start; i < start + num_of_terms; i++) {
                mul *= i;
            }
            start = start + num_of_terms;
            return mul;
    
        }
    
    }
    

