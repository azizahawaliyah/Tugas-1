/* NIM : 13020210090
   Nama : Azizah Awaliyah
   Hari/Tanggal : Selasa, 07 Maret 2023
   Waktu pengerjaan : 17.07 */

/*contoh pengoperasian variabel bertype dasar */

public class Oprator {
    
    public static void main (String[] args){
        // Auto-generated method stub
        /*Kamus */
        boolean Bool1, Bool2, TF;
        int i,j, hsl;
        float x,y,res;
        /* algoritma */
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program dibawah ini untuk menampilkan output program");
            System.out.println("Operasi Logika");
            //AND
            System.out.println("==AND==");
            Bool1 = true; Bool2 = false;
            TF = Bool1 && Bool2; /*Boolean AND */
            System.out.println(Bool1 + "&&" + Bool2+ "=" + TF);
            //OR
            System.out.println("==OR==");
            Bool1 = true; Bool2 = false;
            TF = Bool1 || Bool2; /*Boolean OR */
            System.out.println(Bool1 + "||" + Bool2 + "=" + TF);
            //NOT
            System.out.println("==NEGASI==");
            Bool1 = true; Bool2 = false;
            TF = ! Bool1;        /* NOT */
            System.out.println("!" +Bool1+ "=" + TF);
            //XOR
            System.out.println("==XOR==");
            Bool1 = true; Bool2 = false;
            TF = Bool1 ^Bool2;  /* XOR */
            System.out.println(Bool1 + "^" + Bool2 + "=" + TF);

         /*operasi numerik */
            System.out.println("Operasi Numerik");
            //Penjumlahan
            i = 5; j = 2;
            hsl = i + j;
            System.out.println(i + "+" + j + "=" + hsl);
            //Pengurangan
            i = 5; j = 2;
            hsl = i - j;
            System.out.println(i + "-" + j + "=" + hsl);
            //Pembagian pecahan
            i = 5; j = 2;
            float hasil = (float) i / j;
            System.out.println(i + "/" + j + "=" + hasil);
            //Perkalian
            i =5; j=2;
            hsl = i * j;
            System.out.println(i + "*" + j + "=" + hsl);
            //Pembagian Bulat
            i = 5; j = 2;
            hsl = i / j;
            System.out.println(i + "/" + j + "=" + hsl);
            //Modulo
            i = 5; j = 2;
            hsl = i % j;
            System.out.println(i + "%" + j + "=" + hsl);

        /*operasi numerik */
            System.out.println("Operasi Numerik");
            //Penjumalahn
            x = 5; y = 5;
            res = x + y;
            System.out.println(x + "+" + y + "=" + res);
            //Pengurangan
            x = 5; y = 5;
            res = x - y;
            System.out.println(x + "-" + y + "=" + res);
            //Pembagian
            x = 5; y = 5;
            res = x / y;
            System.out.println(x + "/" + y + "=" + res);
            //Perkalian
            x = 5; y = 5;
            res = x * y;
            System.out.println(x + "*" + y + "=" + res);

        /*operasi relasional numerik */
            System.out.println("Operasi Relasional Numerik");
            //Persamaan
            i = 5; j = 2;
            TF = (i==j);
            System.out.println(i + "==" + j + ":" + TF);
            //Pertidaksamaan
            i = 5; j = 2;
            TF = (i!=j);
            System.out.println(i + "!=" + j + ":" + TF);
            //Kurang dari
            i = 5; j = 2;
            TF = (i < j);
            System.out.println(i + "<" + j + ":" + TF);
            //Lebih dari
            i =5; j =2;
            TF = (i > j);
            System.out.println(i + ">" + j + ":" + TF);
            //Kurang dari atau sama dengan
            i =5; j =2;
	    TF = (i <= j);
            System.out.println(i + "<=" + j + ":" + TF);
            //Lebih dari atau sama dengan
            i =5; j=2;
            TF = (i >= j);
            System.out.println(i + ">=" + j + ":" + TF);
        
        /* operasi relasional numerik */
            System.out.println("Operasi Relasional Numerik");
            
            //Pertidaksamaan
            x = 5; y = 5;
            TF = (x != y);
            System.out.println(x + "!=" + y + ":" + TF);
            //Kurang dari
            x = 5; y = 5;
            TF = ( x < y);
            System.out.println(x + "<" + y + ":" + TF);
            //Lebih dari
            x = 5; y = 5;
            TF = (x > y);
            System.out.println(x + ">" + y + ":" + TF);
            //Kurang dari atau sama dengan
            x = 5;  y = 5;
            TF = (x <= y);
            System.out.println(x + "<=" + y + ":" + TF);
            //Lebih dari atau sama dengan
            x = 5; y = 5;
            TF = (x >= y);
            System.out.println(x + ">=" + y + ":" + TF);

    }
}