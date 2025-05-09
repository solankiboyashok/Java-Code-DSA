

import java.util.PriorityQueue;
public class PriorityQueue1 {
    public static int findProductOfThreeLargestDistinctElements(int[] nums) {
      
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            if (!pq.contains(num)) {
                pq.offer(num);
            }
        }
        int largest1 = pq.poll();
        int largest2 = pq.poll();
        int largest3 = pq.poll();
        return largest1 * largest2 * largest3;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 9, 10, 7, 3, 15};

        int product = findProductOfThreeLargestDistinctElements(arr);
        
        System.out.println("Product of three largest distinct elements: " + product);
    }

}

