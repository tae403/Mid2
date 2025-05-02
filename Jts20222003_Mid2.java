import java.util.Scanner;
public class Lab05_07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String myHand, comHand;
		String[] hands = {"가위", "바위", "보"};
		String[] oddEven = {"홀", "짝"};
		
		while (true) {
			int rnd = (int) (Math.random()*hands.length);
			comHand = hands[rnd];
		
			System.out.print("나의 가위/바위/보 (종료하려면 '그만' 입력)>");
			myHand=s.next();			
			if (myHand.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			System.out.println("컴퓨터의 가위/바위/보>"+ comHand);
			boolean didWin = false;
			
			if (myHand.equals("가위")) {
				if (comHand.equals("가위"))
					System.out.println("비겼습니다");
				else if (comHand.equals("바위"))
					System.out.println("졌습니다");
				else if (comHand.equals("보")) {
					System.out.println("이겼습니다!");
					didWin = true;
				}
			} else if (myHand.equals("바위")) {
				if (comHand.equals("가위")) {
					System.out.println("이겼습니다!!");
					didWin = true;
				} else if (comHand.equals("바위"))
					System.out.println("비겼습니다");
				else if (comHand.equals("보"))
					System.out.println("졌습니다");		
			}
			else if (myHand.equals("보")) {
				if (comHand.equals("가위"))
					System.out.println("졌습니다");
				else if (comHand.equals("바위")) {
					System.out.println("이겼습니다!!");
					didWin = true;
				} else if (comHand.equals("보"))
					System.out.println("비겼습니다");		
			}
			else {
				System.out.println("가위/바위/보 중 하나 선택하세요!!");
				continue ;
			}
			
			if (didWin) {
				int oddEvenIdx = (int) (Math.random()*2);
				String comOddEven = oddEven[oddEvenIdx];
				
				System.out.print("컴퓨터의 홀,짝을 맞춰보세요>");
				String myGuess = s.next();
				
				System.out.println("컴퓨터의 선택:"+ comOddEven);
				if (myGuess.equals(comOddEven)) {
					System.out.println("맞췄습니다!");
				} else {
					System.out.println("틀렸습니다!");
				}
			}
		}
		
		s.close();
	}
}
