package deneme;

import javax.swing.*; //s1
public class deneme {
 public static void main(String arg[]) {
 String name, lastname;
 Integer pass;
 name = JOptionPane.showInputDialog(null, "Lutfen isminizi giriniz: ");
 lastname = JOptionPane.showInputDialog(null, "Simdi de lastnameiniz giriniz: "); 
 pass= Integer.parseInt(JOptionPane.showInputDialog(null, "Simdi �ifrenizi giriniz: "));

 String rapor = "Adiniz: "+name+"Yasiniz: "+lastname;
 JOptionPane.showMessageDialog(null, rapor); 
 
 
 if (name=="suleyman"&& pass==1234) {
	 String rapor1 = "Adiniz: "+name+"Yasiniz: "+lastname + "ho�geldiniz" ; 
	 JOptionPane.showMessageDialog(null, rapor1); 
} else {
	rapor="kullan�c� giri�i yap�lamad�.�ifre Yanl��";
	 JOptionPane.showMessageDialog(null, rapor); 

}
 System.exit(0);
 }
} 