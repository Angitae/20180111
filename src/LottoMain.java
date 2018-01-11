import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1~45 ������ �ߺ����� ���� ���� 6���� �����Ͽ� �����Ͽ� ���
public class LottoMain {
	public static void main(String[] args) {
			Set<Integer> lottoSet = new HashSet<Integer>();
			Random random = new Random();
			
			while(true){
				lottoSet.add(random.nextInt(45)+1);
				if(lottoSet.size()== 6) break;
			}
			
			// toArray(�ν��Ͻ� �迭) : HashSet �ν��Ͻ��� ����� 
			Integer[] lotto = lottoSet.toArray(new Integer[0]);
			Arrays.sort(lotto);
			
			System.out.print("����� ���� >> ");
			for(Integer num : lotto){
				System.out.print(num + "  ");
			}
	}
}
