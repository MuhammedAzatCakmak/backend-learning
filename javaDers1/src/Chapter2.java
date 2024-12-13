public class Chapter2 {
    public static void main(String[] args) {
        new B("string");
    }


    // ACCESS MODIFIER
        // public = her yerden erisilebilir.
        // private = sadece bulundugu class'tan erisilebilir.
        // protected = sadece ayni package veya subclass'lardan erisilebilir.


    // VARIABLE ARGUMENTS
        // bir fonksiyonun degisken sayida parametre almasini istiyorsak bu ozelligi kullanmaliyiz.
        // sadece walk1 ve walk2 seklinde olusturabilir. diger turlu asagida gordugun uzere hata verecektir.
        public void walk1(int... nums){}
        public void walk2(int start, int... nums){}
        public void walk3(int... nums, int end){}
        public void walk4(int... nums, int... nums){}


    //  STATIC vs INSTANCE
        // static bir fonksiyonun icerisinde yanlizca static bir degisken veya fonksiyon kullanabilirim. ayni sekilde bir variable icin de gecerli.
        // ornegin:

        public static int statcVar;
        public int instanceVar
        public static void staticFunc(){
            statcVar++;
            instanceVar--;
        }

        public void instanceFunc(){  // her iki turdeki variable ve function call edilebilir.
            statcVar++;
            instanceVar++;
        }

        public static void staticFunc2(){  // yalnizca static function call edilebilir.
            staticFunc();
            instanceFunc();
        }




    // METHOD OVERLOADING
        // parametre turune ve sayisine gore ayni fonksiyon ismiyle fonksiyonumuzu kullanabiliriz.
        public void talk(int myNumber){}
        public void talk(String myString){}
        public void talk(short myShortNumber){}
        public void talk(String myString, int... manyNumber){}



    // CONSTRUCTOR
        // bir nesneyi olusturdugumuz anda referans class'in icindeki, class ile ayni ada sahip fonksiyonun calismasidir.
        // baska bir class'i extend eden class ilk once super class'i yaratir !!
        // super() ve this() kullanimlari da bu durumdan etkilenir.
        // bir class'i extend ettigimizde extend ettigimiz class icerisindeki constructorin parametresini super() ile kullanmamiz gerekiyor dikkat!!!



    // ORDER OF INITIALIZATION
        // 1- Static variable declarations
        // 2- Superclass constructor
        // 3- Instance variable declarations
        // 4- Constructor



    // ENCAPSULATING DATA
        // class icerisindeki verilerimizi korumak icin gelistirilmis bir yontemdir.
        // degiskenlerimizi private tanimlanmalidir. get ve set fonksiyonlarini kullanarak belirledigimiz verilere erisim saglanabilecek.
        // Asagidaki Human class'ini incele !

}



class A{
    public A(String a){

    }
    private String a;
    public int b;
}


class B extends A{
    public B(String a){
        super(a);  // super kullanimini dikkatli incele. A classindaki constructor'in parametresini B classinda da gecerli kilmak icin yapiyoruz.
    }
}



class Human{
    private int age;
    private String name;
    private Boolean isMale;
    private Boolean isKnowJava;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Boolean getKnowJava() {
        return isKnowJava;
    }

    public void setKnowJava(Boolean knowJava) {
        isKnowJava = knowJava;
    }
}