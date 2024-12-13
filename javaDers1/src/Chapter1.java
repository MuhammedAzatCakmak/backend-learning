import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter1 {
    public static void main(String[] args) {

        // STRING BUILDER
        // asagidaki ornekte sb1 i olusturduk ve ardindan sb2 yi olusturup sb1'i atadik.
        // beklenen cikti = ab iken abc olmus. Cunku ikisi de memoryde ayni yeri gosteriyor sb1'de olusacak herhangi bir
        // degisim direkt sb2'yi de etkileyecek ve sonuc ona gore belirlenecek.
         StringBuilder sb1 = new StringBuilder();
         sb1.append("a");

         StringBuilder sb2 = sb1.append("b");

         sb2.append("c");

        System.out.println(sb1.toString());


        // AYNILIK VE ESITLIK KARSILASTIRILMASI
        // equals() fonksiyonu degerlerin ESITLIK olup olmamasini kontrol eder. o yuzde sonuc true cikar.
        // == kullaniminda AYNILIK kontrolu yapilir. yani memoryde ayni yeri gosterip gostermediginie bakar !

        String stringWithObject = new String("Hello");
        String stringWithoutObject = "Hello";

        System.out.println(stringWithObject == stringWithoutObject);
        System.out.println(stringWithObject.equals(stringWithoutObject));


        // SORTING
        int[] numberArray = {4,2,7,4,9,1,3};
        Arrays.sort(numberArray);

        for(int number : numberArray){
            System.out.print(number + " ");
        }


        // SEARCHING
        int[] searchNumber = {2,5,1,7,9,4};

        System.out.println(Arrays.binarySearch(searchNumber, 4));
        System.out.println(Arrays.binarySearch(searchNumber, 8));


        //WRAPPER CLASSES
        // primitive tiplerimizin constructor tanimlanmasini saglayabilecegimiz bir yontem.
        // kisacasi primitive turunden nesne olusturabiliriz. ornegin:


        // ARRAYLIST
        // arraylist'ler Collection sinifindan miras alir. COLLECTION sinifindan miras alinan Class'lar = LIST, QUEUE, SET
        // bazi list fonksiyonlari:
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.remove(2); // parametre olarak index kabul eder. o yuzden 3 elemanini siler.
        integerList.get(1);
        integerList.indexOf(2); // parametredeki degerin indexini dondurur.
        integerList.contains(4); // belirtilen(paramtrede bulunan) elemanin listede bulunup bulunmadigini kontrol eder.
        integerList.isEmpty(); // listenin bos olup olmadigini kontrol eder. ama oncelikle null kontrolu gereklidir.
        integerList.clear();
        integerList.size();



        // AUTOBOXING AND UNBOXING
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(50.5);
        doubleList.add(new Double(60.5));  // java 9 itibariyle bu kullanim deprecate edilmistir. artik otomatik objeleme yapiyor.
        doubleList.remove(0);
        double firstNumber = doubleList.get(0);




    }
}