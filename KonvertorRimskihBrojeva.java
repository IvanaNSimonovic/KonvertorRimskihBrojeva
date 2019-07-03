package konvertorRimskih;

import java.util.Scanner;

public class KonvertorRimskihBrojeva {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String rim=s.next();
		int zb=0;
		for(int i=0; i<rim.length(); i++) {
			char trenutni=rim.charAt(i);
			switch(trenutni) {
			case 'I':if(i+1<=rim.length() && i+2<=rim.length() && rim.charAt(i+1)=='I' && rim.charAt(i+2)=='I') {
				zb+=3;
				i+=2;
				break;
			} else if(i+1<=rim.length() && rim.charAt(i+1)=='I') {
				zb+=2;
				i++;
				break;
			}else if(i+1<=rim.length() && rim.charAt(i+1)=='V') {
				zb+=4;
				i++;
				break;
			}else if(i+1<=rim.length() && rim.charAt(i+1)=='X') {
				zb+=9;
				i++;
				break;
			}
			case 'V':zb+=5;break;
			case 'X':if(i+1<=rim.length() && rim.charAt(i+1)=='L') {
				zb+=40;
				i++;
				break;
			}else if(i+1<=rim.length() && rim.charAt(i+1)=='C') {
				zb+=90;
				i++;
				break;
			} else 
				zb+=10;break;
			case 'L':zb+=50;break;
			case 'C':if(i+1<=rim.length() && rim.charAt(i+1)=='D') {
				zb+=400;
				i++;
				break;
			}else if(i+1<=rim.length() && rim.charAt(i+1)=='M') {
				zb+=900;
				i++;
				break;
			} else 
				zb+=100;break;
			case 'D':zb+=500;break;
			case 'M':zb+=1000;break;
				
			}
		}
		System.out.println(zb);

	}
}
