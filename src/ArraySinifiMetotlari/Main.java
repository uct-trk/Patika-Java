
package ArraySinifiMetotlari;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,15,595,774,251,14};
        HelperArray helper = new HelperArray();
        helper.print(list);

        // bu metot sayesinde hızlıca dizimizi yazdırabiliriz
        int[] list2 = {123,322,553,554,3415,1595,76574,2251,21314};
        System.out.println(Arrays.toString(list2));

        // istediğmiz değeri arrayın icine yazdırabiliyoruz
        int[] list3 = {51,59,959,48,514,95,213,445,4462,595,484,4894,998,2312};
        Arrays.fill(list3,9,10,11);
        System.out.println(Arrays.toString(list3));

        // sort metodu ile sıralama yapabiliyoruz
        int[] list4 = {484,84,878,-485,-51,5959,454,15,69595,74,14};
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));

        // binary search bulmak istediğimiz değerin index numarasını döner
        // önce sort ile sıralamamız gerekiyor
        int[] list5 = {484,84,878,-485,-51,5959,454,15,69595,74,14};
        Arrays.sort(list5);
        System.out.println( Arrays.binarySearch(list5,15));

        // mevcut arrayden istediğmiz uzunlukta yeni bir array oluştururuz
        int[] list6 = {13,24,4,65,3,6,7,9,77};
        int[] copyList = Arrays.copyOf(list6,5);
        System.out.println(Arrays.toString(copyList));

        // aralık belirterek kopyalayabiliriz
        int[] list7 = {1,7,8,6,4,277,26,33,68};
        int[] copyRange = Arrays.copyOfRange(list7,3,7);
        System.out.println(Arrays.toString(copyRange));

        // arraylerin eşitliklerini custom sorguladık
        int[] listEq = {1,2,3};
        int[] listEq2 = {1,2,3};
        int[] listEq3 = {1,2,3,6};
        System.out.println(HelperArray.equals(listEq,listEq2));
        System.out.println(HelperArray.equals(listEq,listEq3));

        // Equals metodu sayesnde kolaylıkla karşılaştırabiliriz
    }
}
