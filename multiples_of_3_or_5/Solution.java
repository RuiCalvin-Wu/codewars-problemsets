public class Solution {

  public int solution(int number) {
    
      int total = 0;
      for (int i = 1; i <= number; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
           total += i;
         }
       
      } 
    return total;
    
  }

  public static void main(String[] args) {
    
    Solution sol = new Solution();
    System.out.println(sol.solution(22));
    

  }

}