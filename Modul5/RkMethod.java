package Modul5;
import java.util.Scanner;

public class RkMethod {
	static Scanner input = new Scanner(System.in);
	static double fx(double a0, double b0, double bi) {
		return ((1 / 0.25) * (-(64 * a0 * bi) - (b0)));
	}
	
	public static void main(String[] args) {
		double b0 = 1.0, b1 = -8.0, a0 = 0, h;
		System.out.print("Masukkan Nilai h : ");
		h = input.nextDouble();
		
		double k1 = h * (fx(a0, b0, b1));
		double k2 = h * (fx(a0 + (1.0 / 2 * h), b0 + (1.0 / 2.0 * k1), b1 + (1/2 * k1)));
		double k3 = h * (fx(a0 + h, b0 - k1 + (2.0 * k2), b1 - k1 + (2.0 * k2)));
		System.out.println("\nHasil k1 = " + k1 + "\nHasil k2 = " + k2 + "\nHasil k3 = " + k3);
		double hasil = b0 + ((1.0 / 6) * (k1 + (4 * k2) + k3));
		System.out.println("Hasil PD tersebut dengan RK 3 adalah : " + hasil);
	}
}
