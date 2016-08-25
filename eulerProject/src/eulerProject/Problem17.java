package eulerProject;

public class Problem17 {

	public static String writeNum(int n) {
		String retVal = "";
		int[] a = new int[n+1];
		
		for(int i = 1; i <= n; i++){
			a[i] = i;
		}

		while (n >= 1) {
			while (a[n] > 0) {
				switch (a[n]) {
				case 1:
					retVal += "one";
					a[n] -= 1;
					break;
				case 2:
					retVal += "two";
					a[n] -= 2;
					break;
				case 3:
					retVal += "three";
					a[n] -= 3;
					break;
				case 4:
					retVal += "four";
					a[n] -= 4;
					break;
				case 5:
					retVal += "five";
					a[n] -= 5;
					break;
				case 6:
					retVal += "six";
					a[n] -= 6;
					break;
				case 7:
					retVal += "seven";
					a[n] -= 7;
					break;
				case 8:
					retVal += "eight";
					a[n] -= 8;
					break;
				case 9:
					retVal += "nine";
					a[n] -= 9;
					break;
				case 10:
					retVal += "ten";
					a[n] -= 10;
					break;
				case 11:
					retVal += "eleven";
					a[n] -= 11;
					break;
				case 12:
					retVal += "twelve";
					a[n] -= 12;
					break;
				case 13:
					retVal += "thirteen";
					a[n] -= 13;
					break;
				case 14:
					retVal += "fourteen";
					a[n] -= 14;
					break;
				case 15:
					retVal += "fifteen";
					a[n] -= 15;
					break;
				case 16:
					retVal += "sixteen";
					a[n] -= 16;
					break;
				case 17:
					retVal += "seventeen";
					a[n] -= 17;
					break;
				case 18:
					retVal += "eighteen";
					a[n] -= 18;
					break;
				case 19:
					retVal += "nineteen";
					a[n] -= 19;
					break;
				case 100:
					retVal += "onehundred";
					a[n] -= 100;
					break;
				case 200:
					retVal += "twohundred";
					a[n] -= 200;
					break;
				case 300:
					retVal += "threehundred";
					a[n] -= 300;
					break;
				case 400:
					retVal += "fourhundred";
					a[n] -= 400;
					break;
				case 500:
					retVal += "fivehundred";
					a[n] -= 500;
					break;
				case 600:
					retVal += "sixhundred";
					a[n] -= 600;
					break;
				case 700:
					retVal += "sevenhundred";
					a[n] -= 700;
					break;
				case 800:
					retVal += "eighthundred";
					a[n] -= 800;
					break;
				case 900:
					retVal += "ninehundred";
					a[n] -= 900;
					break;
				case 1000:
					retVal += "onethousand";
					a[n] -= 1000;
					break;
				default:
					break;
				}
				if(a[n] >= 20 && a[n] < 30){
					retVal += "twenty";
					a[n] -= 20;
				}
				else if(a[n] >= 30 && a[n] < 40){
					retVal += "thirty";
					a[n] -= 30;
				}
				else if(a[n] >= 40 && a[n] < 50){
					retVal += "forty";
					a[n] -= 40;
				}
				else if(a[n] >= 50 && a[n] < 60){
					retVal += "fifty";
					a[n] -= 50;
				}
				else if(a[n] >= 60 && a[n] < 70){
					retVal += "sixty";
					a[n] -= 60;
				}
				else if(a[n] >= 70 && a[n] < 80){
					retVal += "seventy";
					a[n] -= 70;
				}
				else if(a[n] >= 80 && a[n] < 90){
					retVal += "eighty";
					a[n] -= 80;
				}
				else if(a[n] >= 90 && a[n] < 100){
					retVal += "ninety";
					a[n] -= 90;
				}
				else if(a[n] > 100 && a[n] < 200){
					retVal += "onehundredand";
					a[n] -= 100;
				}
				else if(a[n] > 200 && a[n] < 300){
					retVal += "twohundredand";
					a[n] -= 200;
				}
				else if(a[n] > 300 && a[n] < 400){
					retVal += "threehundredand";
					a[n] -= 300;
				}
				else if(a[n] > 400 && a[n] < 500){
					retVal += "fourhundredand";
					a[n] -= 400;
				}
				else if(a[n] > 500 && a[n] < 600){
					retVal += "fivehundredand";
					a[n] -= 500;
				}
				else if(a[n] > 600 && a[n] < 700){
					retVal += "sixhundredand";
					a[n] -= 600;
				}
				else if(a[n] > 700 && a[n] < 800){
					retVal += "sevenhundredand";
					a[n] -= 700;
				}
				else if(a[n] > 800 && a[n] < 900){
					retVal += "eighthundredand";
					a[n] -= 800;
				}
				else if(a[n] > 900 && a[n] < 1000){
					retVal += "ninehundredand";
					a[n] -= 900;
				}
			}
			n--;
		}
		return retVal;
	}

	public static void main(String[] args) {

		System.out.println(writeNum(1000).length());
	}

}
