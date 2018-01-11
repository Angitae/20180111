import java.util.Calendar;

// �ý����� ���� ����� �ش��ϴ� �޷� ���
public class CurrentCalendar {
	public static void main(String[] args) {
		//�ý����� ���� ��¥ �� �ð������� ����� �ν��Ͻ��� ��ȯ�޾� ����
		Calendar calendar = Calendar.getInstance();
		
		// Calendar �ν��Ͻ��� ����� ��¥ ���� �� ���� 1�Ϸ� ����
		// => ����� ���� 1���� ���� ������ ������ ���� ����
		calendar.set(Calendar.DATE, 1);
		
		// ����� Calendar �ν��Ͻ��� ���� ������ ��ȯ�޾� ���� 
		int week = calendar.get(Calendar.DAY_OF_WEEK); // 1( �� ) ~ 7( �� )�� �����Ǿ� �ִ�.
		
		// �� ,�� ���...
		System.out.println("      "+ calendar.get(Calendar.YEAR)+ " ��"   +"       " + (calendar.get(Calendar.MONTH)+1)+ " ��" );
		
		// ���� ���
		System.out.println("==================================");
		System.out.println("       ��      ��       ȭ      ��       ��       ��       ��  ");
		System.out.println("==================================");
		
		//1�� �� ���ϱ��� ���� ���
		for(int i =1; i<week; i++){
			System.out.print("    ");
		}
		// ��¥ ���
		// getActualMaximum(field) : ���ϴ� ��¥ �Ǵ� �ð������� �ִ밪�� 
		for(int i =1; i<= calendar.getActualMaximum(Calendar.DATE); i++){
			if( i < 10){
				System.out.print("   "+ i);
			}
			else{
				System.out.print("  "+i);
			}
			week++;
			if(week %7 == 1){
				System.out.println(" ");
			}
		}
		if(week %7 != 1){
			System.out.println(" ");
		} // ������ ������� ����������� ~~~ 
		System.out.println("=================================");
	}
}
