package _6Array;

import java.util.Vector;

public class MergetwoSortedArray {
        public static void main(String[] args) {
                int[] arr1 = {1, 3, 5, 7};
                int[] arr2 = {2, 4, 6, 8};
                Vector<Integer> mergeArr=new Vector<>();
                int i=0,j=0;
                while (i<arr1.length && j<arr2.length) {
                        if(arr1[i]<=arr2[j]){
                                mergeArr.add(arr1[i]);
                                i++;
                        }else{
                                mergeArr.add(arr2[j]);
                                j++;
                        }
                }
                //adding remaining elements  if any
                while (i<arr1.length) {
                        mergeArr.add(arr1[i]);
                        i++;
                }
                while (i<arr2.length) {
                        mergeArr.add(arr2[i]);
                        j++;
                }
                System.out.println("Merged Sorted Array using Vector: " + mergeArr);
        }
}
