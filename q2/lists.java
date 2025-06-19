package oop.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class lists {
   public static List<String> computeThirdList(List<Integer> firstList, List<String> secondList) {
      List<String> essential = new ArrayList();

      for(int i = 1; i < secondList.size(); i += 2) {
         essential.add((String)secondList.get(i));
      }

      List<String> result = new ArrayList();
      Iterator var4 = firstList.iterator();

      while(true) {
         while(var4.hasNext()) {
            Integer n = (Integer)var4.next();
            if (n != null && n >= 1 && n <= essential.size()) {
               result.add((String)essential.get(n - 1));
            } else {
               result.add((Object)null);
            }
         }

         return result;
      }
   }

   public static void main(String[] args) {
      List<Integer> firstList = Arrays.asList(6, 5, 3, 5, 5, 3, 3, 5, 7, 6, 4, 5, 6);
      List<String> secondList = Arrays.asList("PqH", "F5W", "nQ6", "RIOBH", "mMVH", "2ku9", "dkttR", "qrJBp", "4P1fy", "XRu", "Q2R", "XJVWA", "dxuzv", "T8e", "3Yn", "Se32", "Dg4cU", "qsP");
      List<String> thirdList = computeThirdList(firstList, secondList);
      System.out.println("First list: " + String.valueOf(firstList));
      System.out.println("Second list: " + String.valueOf(secondList));
      System.out.println("Essential subset of second list:");
      Iterator var4 = extractEssential(secondList).iterator();

      while(var4.hasNext()) {
         String s = (String)var4.next();
         System.out.print(s + " ");
      }

      System.out.println();
      System.out.println("Third list result: " + String.valueOf(thirdList));
   }

   private static List<String> extractEssential(List<String> secondList) {
      List<String> essential = new ArrayList();

      for(int i = 1; i < secondList.size(); i += 2) {
         essential.add((String)secondList.get(i));
      }

      return essential;
   }
}
