/* NIM : 13020210090
   Nama : Azizah Awaliyah
   Hari/Tanggal : Selasa, 07 Maret 2023
   Waktu pengerjaan : 15.20 */

import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
 public class BacaData {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	int a;
	Scanner masukan;
	/* Program */
	System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
	masukan = new Scanner(System.in);
	a = masukan.nextInt(); /* coba ketik :
	masukan.nextInt();
Apa akibatnya ?*/
/*jika fungsi masukan.nextInt(); tidak diketik maka program eror,sebab perintah ini untuk memasukkan nilai yang bertype integer */

	System.out.print ("Nilai yang dibaca : "+ a);
}
 }