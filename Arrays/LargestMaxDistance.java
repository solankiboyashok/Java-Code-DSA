public class LargestMaxDistance {
    public static int largestMaxDistance(int[] arr) {
        int maxDistance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int distance = Math.abs(arr[i] - arr[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 19, 18, 25};
        int largestDistance = largestMaxDistance(arr);
        System.out.println("Largest maximum distance: " + largestDistance);
    }
}