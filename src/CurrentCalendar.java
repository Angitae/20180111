import java.util.Calendar;

// 시스템의 현재 년월에 해당하는 달력 출력
public class CurrentCalendar {
	public static void main(String[] args) {
		//시스템의 현재 날짜 및 시간정보가 저장된 인스턴스를 반환받아 저장
		Calendar calendar = Calendar.getInstance();
		
		// Calendar 인스턴스에 저장된 날짜 정보 중 일을 1일로 변경
		// => 년월에 대한 1일의 요일 정보를 얻어오기 위해 변경
		calendar.set(Calendar.DATE, 1);
		
		// 변경된 Calendar 인스턴스의 요일 정보를 반환받아 저장 
		int week = calendar.get(Calendar.DAY_OF_WEEK); // 1( 일 ) ~ 7( 토 )로 설정되어 있다.
		
		// 년 ,월 출력...
		System.out.println("      "+ calendar.get(Calendar.YEAR)+ " 년"   +"       " + (calendar.get(Calendar.MONTH)+1)+ " 월" );
		
		// 요일 출력
		System.out.println("==================================");
		System.out.println("       일      월       화      수       목       금       토  ");
		System.out.println("==================================");
		
		//1일 전 요일까지 공백 출력
		for(int i =1; i<week; i++){
			System.out.print("    ");
		}
		// 날짜 출력
		// getActualMaximum(field) : 원하는 날짜 또는 시간정보의 최대값을 
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
		} // 공백이 출력됬으면 출력하지말고 ~~~ 
		System.out.println("=================================");
	}
}
