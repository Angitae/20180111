import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1~45 범위의 중복되지 않은 난수 6개를 생성하여 정렬하여 출력
public class LottoMain {
	public static void main(String[] args) {
			Set<Integer> lottoSet = new HashSet<Integer>();
			Random random = new Random();
			
			while(true){
				lottoSet.add(random.nextInt(45)+1);
				if(lottoSet.size()== 6) break;
			}
			
			// toArray(인스턴스 배열) : HashSet 인스턴스에 저장된 
			Integer[] lotto = lottoSet.toArray(new Integer[0]);
			Arrays.sort(lotto);
			
			System.out.print("행운의 숫자 >> ");
			for(Integer num : lotto){
				System.out.print(num + "  ");
			}
	}
}
