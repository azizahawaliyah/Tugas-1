/* NIM : 13020210090
   Nama : Azizah Awaliyah
   Hari/Tanggal : Selasa, 07 Maret 2023
   Waktu pengerjaan : 15.21 */

/*Casting menggunakan tipe data Class*/
public class Casting2 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a=8,b=9;
	float d=2.f,e=3.2f;
	char g='5';
	double k=3.14;
	String n="67",m="45", l="100";

	a = Integer.parseInt(n); /*Konversi String ke Integer*/
	k = Double.parseDouble(m); /*Konversi String ke Double*/ 
	d = Float.parseFloat(l); /*Konversi String ke Float*/ 
	System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);
	n = String.valueOf(b); /*Konversi Integer ke String*/ 
	m = String.valueOf(g); /*Konversi Karakter ke String*/ 
	l = String.valueOf(e); /*Konversi Float ke String*/ 
	System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
	k = Double.valueOf(a).intValue(); 
	/*Konversi Integer ke Double*/
	double c = Integer.valueOf(b).doubleValue(); 

	System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);
}
}
