package _6Array;
import java.util.ArrayList;
public class MergetwoSortedArray {
        public static void main(String[] args) {
                int[] arr1 = {1, 3, 5, 7};
                int[] arr2 = {2, 4, 6, 8};
                ArrayList<Integer> mergeArr = new ArrayList<>();
                int i=0,j=0;
                while (i<arr1.length && j<arr2.length) {
                        if(arr1[i]<arr2[j]){
                                mergeArr.add(arr1[i]);
                                i++;
                        }else{
                                mergeArr.add(arr2[j]);
                                j++;
                        }
                }
                while (i<arr1.length) {
                        mergeArr.add(arr1[i]);
                        i++;
                }
                while (j<arr2.length) {
                        mergeArr.add(arr2[j]);
                        j++;
                }
                System.out.println("Merged Sorted Array using ArrayList: " + mergeArr);
        }
}
