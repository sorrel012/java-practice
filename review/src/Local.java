import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Local {

    public static void main(String[] args) {

	LocalDateTime nowDateTime = LocalDateTime.now()	;
	System.out.println("date & time = " + nowDateTime);

	LocalTime nowTime = LocalTime.now();
	System.out.println("time = " + nowTime);

	LocalDate nowDate = LocalDate.now();
	System.out.println("date = " + nowDate);
	System.out.println("올해는 = " + nowDate.getYear());
	System.out.println("오늘의 요일은 = " + nowDate.getDayOfWeek());
	System.out.println("오늘의 날짜는 = " + nowDate.getDayOfMonth());
	System.out.println("오늘은 1년 중 몇 번째 날인가요? = " + nowDate.getDayOfYear());
	System.out.println("이번 달은 = " + nowDate.getMonth());
	System.out.println("이번 달은 = " + nowDate.getMonthValue());
	System.out.println("이번 연도는 윤년인가요? = " + nowDate.isLeapYear());
	System.out.println("이번 달은 총 며칠인가요? = " + nowDate.lengthOfMonth());
	System.out.println("이번 연도는 총 며칠인가요? = " + nowDate.lengthOfYear());
	System.out.println("오늘로부터 100일 후의 날짜는 ? = " + nowDate.plusDays(100));
	System.out.println("오늘로부터 3달 후의 날짜는? = " + nowDate.plusMonths(3));
	System.out.println("오늘로부터 10년 후의 날짜는? = " + nowDate.plusYears(10));
	System.out.println("오늘로부터 10년 전의 날짜는? = " + nowDate.minusYears(10));
	System.out.println("연도만 작년으로 바꾼다면? = " + nowDate.withYear(2022));
	System.out.println("날짜만 10일로 바꾼다면? = " + nowDate.withDayOfMonth(10));
	System.out.println("달만 1월로 바꾼다면? = " + nowDate.withMonth(1));
	System.out.println("올해의 100일째 되는 날은? = " + nowDate.withDayOfYear(100));
	System.out.println();

	LocalDate birth = LocalDate.of(1998,01,17);
	System.out.println("태어난 날 = " + birth );
	System.out.println();

	System.out.println("오늘 날짜는 태어난 날 이전인가요? = " + nowDate.isBefore(birth));
	System.out.println("오늘 날짜는 태어난 날 이후인가요? = " + nowDate.isAfter(birth));
    }

}
