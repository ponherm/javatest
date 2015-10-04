package user;

public class Main {

	private static final String[] hand ={
			"グー",
			"チョキ",
			"パー",
			"おわり"
	};
	
	// コメント追加
	
	private static final char g = 'g';
	private static final char c = 'c';
	private static final char p = 'p';
	private static final char e = 'e';
	
	public static void main(String[] args) {
		//
		System.out.println("じゃんけんゲーム");
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.Random rand = new java.util.Random();
		{
			final char[] key = {
				g,
				c,
				p,
				e
			};
			for( int i = 0; i < hand.length; i++ )
			{
				System.out.println( hand[i] + ":" + key[i] );
			}
		}
		int total = 0;
		int win = 0;
		int lose = 0;
		do
		{
			System.out.println("じゃん けん ぽん！");
			
			String line = in.nextLine();
			
			if( line.length() != 1 )
			{
				System.out.println("一文字だけ入力してね！");
				System.out.println("もう一度！");
				continue;
			}
			
			int player = -1;
			
			switch( line.toLowerCase().charAt(0) )
			{
			case g:
				player = 0;
				break;
			case c:
				player = 1;
				break;
			case p:
				player = 2; 
				break;
			case e:
				System.out.println("残念～");
				break;
			default:
				System.out.println("その手は反則だよ！");
				continue;
			}
			if( player < 0 )
			{
				break;
			}
			else
			{
				System.out.println("あなたの手は" + hand[player] );
			}
			
			int program = rand.nextInt(3);
			
			System.out.println( "コンピュータの手は" + hand[program]  );
			
			total++;
			
			switch( (player - program + 3) % 3 )
			{
			case 0:
				System.out.println( "あいこでしょ！" );
				break;
			case 1:
				lose++;
				System.out.println( "あなたの負け！" );
				break;
			case 2:
				win++;
				System.out.println( "あなたの勝ち！" );
				break;
			}
		}
		while( rand != null );
		
		in.close();
		in = null;
		
		System.out.println("勝ち"+ win + "回｜負け" + lose+ "回｜引き分け" +(total - win - lose)+ "回");		
		System.out.println("また遊んでね。");		
	}

}
