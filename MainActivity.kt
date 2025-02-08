package com.mehmetacar.learnkotlinwithatilsamancioglubtk

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Kotlin Giriş

        println("-------------KOTLIN GIRIS---------------")

        println("merhaba dunya")
        println("hello kotlin")
        // comment line
        println(5 - 2)
        println(5 / 2)

        //Kotlin Veri Tipleri ve Değişkenler

        println("-------------VERI TIPLERI VE DEGISKENLER---------------")

        // var = variable
        // val = constant

        //implicit : kotline biraktık kendisi tanımlasın
        var x = 10
        println(x)
        println(x * 20)

        x = 30
        println(x * 20)

        var y = 5
        println(x + y)
        println(y)

        val pi = 3.1415
        println(pi + 10)

        var ornek: Long = 10
        println(ornek * 10)

        var ornek2: Short = 4
        var ornek4: Byte = 1
        var ornek3: Int = 50

        //Değişken İsimlendirme

        println("-------------DEGISKEN DEGISTIRME---------------")

        val kullaniciyasi = 35
        val kullanici_yasi = 35
        val kullaniciYasi = 35

        // snake_case => Alt tire ile yazım
        // camelCase =>Büyük harf ile yazım
        // Kotlinde camelCase tercih edilebilir.

        val m = 10
        val n = 20
        val sonuc = m + n

        println(sonuc)

        println("-------------KESIRLI SAYILAR---------------")

        // int/int = int
        println(5 / 2)
        // float/float = float
        println(5.0 / 2.0)

        val ornekDouble = 3.0

        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat: Float = 2.25f
        println(ornekFloat * 2)

        //unsigned integer

        val unsignedByte: UByte = 10u
        val unsignedShort: UShort = 10u
        val unsignedInteger: UInt = 10u
        val unsignedLong: ULong = 10u

        println("-------------STRINGLER-METINLER---------------")

        //Buna gerek yok tekrar string olduğunu belirtmeye gerek yok

        val ornekString: String = "ornek"

        val isim = "mehmet"
        val soyisim = "acar"
        println(isim.uppercase())
        println(isim + " " + soyisim)

        println("-------------DONUSUMLER-INIT---------------")

        val yas = "15"
        val ornekDeger = "20"
        println(yas + ornekDeger)

        val benimStr: String //içine değer atamadan oluşturma

        benimStr = "hello world"  //initialize , init, initialization

        //conversion

        val yasInt = yas.toInt()
        println(yas.toInt() * 20)
        println(yasInt)

        val yasLong = yas.toLong()


        /*
        Not : stringte conversion işlemi mantıklı yapılmalıdır.
        Eğer kalkıpta onbeş yazan bir string i toInt yaparsan
        PROGRAM ÇÖKER !!!
        kullanıcıya güven problemidir.
         */

        println("-------------BOOLEAN---------------")

        var benimBool: Boolean = true
        benimBool = false

        println("atil" == "atil")
        println(10 != 9)

        println(4 > 3 && 3 > 5)
        println(1 == 2)


        println("-------------VERI TAPILARI / DIZILER / ARRAY---------------")

        val stringOrnegi = "atil"

        val benimDizim = arrayOf(stringOrnegi, "samacioglu", "zeynep", "fatih")
        //index sıfırdan başlar

        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim.last())
        benimDizim.shuffle()
        println(benimDizim.last())

        benimDizim[1] = "sam"
        println(benimDizim[1])

        /*
        NOT : Normal şartlarda val sabit elemanlar için kullanılır
        ve içeriği değiştirilemez. Fakat dizi olduğu zaman , dizi sabittir
        ancak içeriği değiştirilebilir.
         */

        println(benimDizim[1])
        println(benimDizim.get(3))

        //diziye yeni bir index ve yeni bir eleman ekleyemeyiz.

        val numaraDizisi = arrayOf(1, 10, 20, 15, 2, 4)
        println(numaraDizisi[3] * 10)

        val karisikDizi = arrayOf(10, 3.14, 20, "atil", false, true)
        println(karisikDizi[2])

        println("-------------LISTELER/ARRAYLIST---------------")

        val isimListesi = arrayListOf("atil", "samacioglu", "zeynep")

        println(isimListesi[0])
        println(isimListesi[1])
        println(isimListesi[2])


        println("Dizideki Eleman sayisi : " + isimListesi.size)

        //Yeni Eleman Eklenebiliyor
        isimListesi.add("mahmut")
        println(isimListesi.get(3))
        isimListesi[3] = "mehmet"
        println(isimListesi.get(3))

        //remove ile direkt bir eleman çıkarilabılır
        //veya şu indextedi elemanı çıkar denilebilir
        //isimListesi.remove("mehmet")
        // isimListesi.removeAt(0)

        // 2side aynı oluşturma yöntemidir
        val numaraListesi = arrayListOf<Int>()
        val digerOrnekListe = ArrayList<Int>()
        //eğer listenin içine eleman koymazsak onun yerine
        //<> içine hangi veri tipini koyacağını yaz.

        numaraListesi.add(10)
        numaraListesi.add(20)
        numaraListesi.add(30)

        digerOrnekListe.add(40)
        digerOrnekListe.add(50)
        digerOrnekListe.add(60)

        println(numaraListesi[1] * digerOrnekListe[2])

        // numaraListesi.add("atil")  //int olması gerekir o yüzden eklemez

        //peki karışık liste nasıl yapılır ?
        //hem boş kalıcak hem de sonra doldurucaz

        val karisikBosListe = arrayListOf<Any>()
        karisikBosListe.add(10)
        karisikBosListe.add("atil")
        karisikBosListe.add(false)

        println(karisikBosListe.get(0))

        println("----------SET--------")
        /*
        İçinde unique/tekil eleman barındıran yapı.
        aynı şeyden 2 tane koyamazsınız.
        Örneğin 2 tane atıl koyamazsınız.
        2 tane 30 sayısını koyamazsınız.
         */

        val ornekDizi = arrayOf(10, 10, 10, 10, 20, 30, 40)
        //set olunca yukarıdaki örnek olmaz
        println(ornekDizi[0])
        println(ornekDizi[1])

        val ornekSet = setOf(10, 10, 10, 10, 20, 30, 40)
        //buradaki 10'lardan dadece bir tanesini tutacaktır.

        println(ornekSet.size)

        //SETLERDE INDEX MANTIĞI YOKTUR !!!

        ornekSet.forEach {
            println(it)
        }

        val bosSetOrnegi = HashSet<String>()

        bosSetOrnegi.add("Atil")
        bosSetOrnegi.add("Atil")
        bosSetOrnegi.add("Atil")
        bosSetOrnegi.add("Atil")
        bosSetOrnegi.add("Atiil")
        bosSetOrnegi.add("Zeynep")

        bosSetOrnegi.forEach() {
            println(it)
        }

        val ornekTekilSet = ornekDizi.toHashSet()
        ornekTekilSet.forEach() {
            println(it)
        }

        println("------------MAP / HASHMAP----------")

        //anahtar değer eşleşmesidir.
        //sözlük olarakta geçer (farklı dillerde)
        //key value

        //Yemek ve Kalori Eşleştirmesi

        val yemekDizisi = arrayListOf("Elma", "Armut", "Karpuz")
        val kaloriDizisi = arrayListOf(100, 150, 200)

        println("Elma'nın kalorisi 100")
        println("${yemekDizisi[0]}'nın kalorisi ${kaloriDizisi[0]}")

        yemekDizisi.forEach() {
            println(it)
        }

        //Böyle yapmak basit gelebilir ama çok eleman olunca bir index kayarsa hepsi kayabilir

        //HashMap Kullanırız
        //<Key,Value>
        val yemekKaloriMapi = hashMapOf<String, Int>()
        yemekKaloriMapi.put("Elma", 100)
        yemekKaloriMapi.put("Armut", 150)
        yemekKaloriMapi.put("Karpuz", 200)

        println(yemekKaloriMapi["Elma"])
        println(yemekKaloriMapi.get("Armut"))

        yemekKaloriMapi.put("Elma", 300) // güncelliyor
        println(yemekKaloriMapi.get("Elma"))

        val ornekHashMap = HashMap<String, String>()
        ornekHashMap.put("atil", "")
        ornekHashMap.put("abc", "def")

        println("----------IF----------")

        println(3 > 5)
        var sayi = 0
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        //kalanını bulma
        println(10 % 3)

        val skor = 60

        if (skor < 10) {
            println("lose")
        } else if (skor >= 10 && skor < 20) {
            println("bad")
        } else if (skor >= 20 && skor < 30) {
            println("good")
        } else {
            println("congragulation!")
        }

        println("----------WHEN--------")
        /*
        ÇOK FAZLA Koşulu kontrol ederseniz when kullanmak
        daha okunaklıdır.If else ile de yapılır
         */

        val notRakam = 0
        var notString = ""
        /*
        if(notRakam == 0){
            notString="Gecersiz  Not"
        }else if(notRakam == 1){
            notString = "Zayıf"
        }
    */
        when (notRakam) {
            0 -> notString = "Geçersiz Not"
            1 -> notString = "Zayıf"
            2 -> notString = "Kötü"
            3 -> notString = "Orta"
            4 -> notString = "İyi"
            5 -> notString = "Pek İyi"
            else -> notString = "Boyle Bir not bilmiyoruz"
        }
        println(notString)

        println("--------WHILE-----------")

        var j = 0
        println("dongu basladi")
        while (j <= 10) {
            println(j)
            j = j + 1
        }
        println("dongu bitti")

        println("------------FOR DONGUSU----------")

        val baskaDizi = arrayListOf(5, 10, 15, 20, 25, 30)
        println(baskaDizi[0] / 5 * 3)
        println(baskaDizi[1] / 5 * 3)

        println("döngü başladı")
        for (numara in baskaDizi) {
            println(numara / 5 * 3)
        }
        println("döngü bitti")

        for(num in 0..9){
            println(num*10)
        }

        val benimStringDizim = ArrayList<String>()
        benimStringDizim.add("atil")
        benimStringDizim.add("mehmet")
        benimStringDizim.add("atlas")

        for (kelime in benimStringDizim){
            println(kelime.uppercase())
        }

        benimStringDizim.forEach(){kelime ->
            println(kelime.lowercase())
//hiçbirşey tanımlamazsan it keywordu var
        }
        benimStringDizim.forEach(){
            println(it.uppercase())
        }


    }

}