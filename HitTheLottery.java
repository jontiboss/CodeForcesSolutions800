import java.util.Scanner;

public class HitTheLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem https://codeforces.com/problemset/problem/996/A
		int money,papers = 0;

		Scanner scan = new Scanner(System.in);
//		System.out.println("How much money do you have?");
		money = scan.nextInt();
		scan.close();
		//Removes 100 as many times as possible and adds how many money papers u will get of this quantity.
		if(money>=100) {
			papers = papers +  money/100;
			money = money%100;

		}
		//Removes 20 as many times as possible and adds how many money papers u will get of this quantity.
		if(money>=20) {
			papers = papers +  money/20;
			money = money%20;

		}
		//Removes 10 as many times as possible and adds how many money papers u will get of this quantity.
		if(money>=10) {
			papers = papers +  money/10;
			money = money%10;

		}
		//Removes 5 as many times as possible and adds how many money papers u will get of this quantity.
		if(money>=5) {
			papers = papers +  money/5;
			money = money%5;

		}
		//Removes 1 as many times as possible and adds how many money papers u will get of this quantity.
		if(money>=1) {
			papers = papers +  money/1;
			money = money%1;
		}


		System.out.println(papers);


	}

}
