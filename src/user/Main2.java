package user;

import java.util.Scanner;
import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		
		// 数字読み取り。
		System.out.println("0：グー 1：チョキ 2：パー");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		switch( input )
		{
		case 0:
			System.out.println("you の手は ぐー");
			break;
		case 1:
			System.out.println("you の手は ちょき");
			break;
		case 2:
			System.out.println("you の手は ぱー");
			break;
		}
		// 乱数発生
		Random rand = new Random();
		int com = rand.nextInt(3);
		switch( com )
		{
		case 0:
			System.out.println("com の手は ぐー");
			break;
		case 1:
			System.out.println("com の手は ちょき");
			break;
		case 2:
			System.out.println("com の手は ぱー");
			break;
		}
		// 勝敗を確定
		// 結果を表示
		if( input == com )
		{
			System.out.println("あいこ");
		}
		else
		{
			switch( input )
			{
			// グー
			case 0:
				if( com == 1 )
				{
					System.out.println("勝ち");
				}
				else
				{
					System.out.println("負け");
				}
				
				break;
			// ちょき
			case 1: 
				if( com == 2 )
				{
					System.out.println("勝ち");
				}
				else
				{
					System.out.println("負け");
				}
				break;
			// ぱー
			case 2:
				if( com == 0 )
				{
					System.out.println("勝ち");
				}
				else
				{
					System.out.println("負け");
				}
				break;
			}		
		}
		// 終了
		System.out.println("おしまい");
	}
}
