package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		/*스프링에게 지시하는 방법으로 코드를 변경
		Exam exam=new NewlecExam();
		Exam exam=new NewlecExam(10,10,10);
//		ExamConsole console=new InlineExamConsole(exam);//exam을 통해 DI
//		ExamConsole console=[] ?;-> 이부분 끼워 넣는 부분을 Spring을 통해 구현할 것이다. 
		ExamConsole console=new GridExamConsole();// 생성자를 통한 injection 
		console.setExam(exam);// setter를 통한 injection
		*/

		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam=context.getBean(Exam.class);
		System.out.println(exam.toString());
				//ExamConsole console=(ExamConsole)context.getBean("console");
		ExamConsole console=context.getBean(ExamConsole.class);
		
		console.print();
	}

}
