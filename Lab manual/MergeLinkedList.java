class merge {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
  int n1 = nums1.length;
  int n2 = nums2.length;
  int[] merged = new int[n1 + n2];
  
  int i = 0;
  int j = 0; 
  int k = 0; 
  
  while (i < n1 && j < n2) {
  
    if (nums1[i] < nums2[j]) {
      merged[k] = nums1[i];
      i++; 
    } else {
      merged[k] = nums2[j];
      j++; 
    }
    k++; 
  }
  
  while (i < n1) {
    merged[k] = nums1[i];
    i++;
    k++;
  }
  while (j < n2) {
    merged[k] = nums2[j];
    j++;
    k++;
  }
  int len=merged.length;
  double count=0;
  int ans=len/2;
  if(len%2==0){
      count=(merged[ans-1]+merged[ans])/2.0;
  }
  else{
      count=merged[ans];
  }
  return count;
    }
  
      public static void main(String[] args){
        int nums1[]={1,3};
        int nums2[]={2,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
  
      }
  
  }

// Java Program to Merge Two Sorted
// Linked Lists in New List
// Iteratively

// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// public class merge {
//     public static ListNode findMedianSortedArrays(ListNode l1, ListNode l2) {
//         ListNode mergedHead = new ListNode(-1); // dummy node
//         ListNode current = mergedHead;

//         while (l1 != null && l2 != null) {
//             if (l1.val < l2.val) {
//                 current.next = l1;
//                 l1 = l1.next;
//             } else {
//                 current.next = l2;
//                 l2 = l2.next;
//             }
//             current = current.next;
//         }

//         if (l1 != null) {
//             current.next = l1;
//         }
//         if (l2 != null) {
//             current.next = l2;
//         }

//         ListNode merged = mergedHead.next;
//         int len = 0;
//         ListNode temp = merged;
//         while (temp != null) {
//             len++;
//             temp = temp.next;
//         }
//       return temp;
//     }

//     public static void main(String[] args) {
//         ListNode nums1 = new ListNode(1);
//         nums1.next = new ListNode(3);
//         ListNode nums2 = new ListNode(2);
//         nums2.next = new ListNode(4);
//         System.out.println(findMedianSortedArrays(nums1, nums2));
//     }
// // }
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {}

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

// public class MergeLinkedList {
//     public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(-1);
//         ListNode current = dummy;

//         while (l1 != null && l2 != null) {
//             if (l1.val < l2.val) {
//                 current.next = l1;
//                 l1 = l1.next;
//             } else {
//                 current.next = l2;
//                 l2 = l2.next;
//             }
//             current = current.next;
//         }

//         if (l1 != null) {
//             current.next = l1;
//         }
//         if (l2 != null) {
//             current.next = l2;
//         }

//         return dummy.next;
//     }

//     public static void main(String[] args) {
//         ListNode l1 = new ListNode(1);
//         l1.next = new ListNode(3);

//         ListNode l2 = new ListNode(2);
//         l2.next = new ListNode(4);

//         System.out.println(mergeTwoLists(l1, l2));
//     }
// }

