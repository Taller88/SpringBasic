# SpringBasic
유튜브 NewLecture 수업 정리
NEW Lecture 

Spring Framework란 
	spring.io -> nav->Project
	
	* 스프링 프레임워크의 핵심 기술 
		1. dependency Injection
		2. transaction management(ex-DB Tranaction 관리) 
			-> DAO, Service 계층 단위를 사용할 때 
			jdbc에서 제공하는 서비스를 이용하는데 제한이 있을 수 있다. 
	

	Java EE (Enterprise Edition) 이거 대신 Spring 
		Java SE+ Spring
	

	MVC2(이것 보다 Spring이 편함)+ 트랜잭션 + 인증(사용자) 과 권한 
	MVC ->  DI
	트랜잭션 -> AOP 
	인증과 권한 -> Servelet Filter

	----> 이것들을 이해하기 위한 느슨한 결합력과 인터페이스 
 


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
느슨한 결합력과 인터페이스 
	사용자 UI -> Service -> Dao(Data Access Object) -> DB

	객체 생성과 조립을 위한 외부 설정 
	
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
****DI(Dependency Injection) 의존주입= 부품 조립
	: 프로그램은 객체들의 조립해서 모아둔것	
-Dependency (부품)
	A를 생성할 때 B를 생성 -> A라는 녀석이 B를 사용하기 위해 A가 B를 일체해서 가졌다. <-->  조립형
	B를 A의 부품이라고 말할 수 있다 -> Dependency 
	
A에서 생성하지 않고 외부에서 생성하여 조립하여 사용 
	장점 1. 객체 안에서 부품(Dependency)을 바꿔 끼기 좋다 (Injection)
	장점 2. 
	단점 1. 조립하기 귀찬..

부품을 조립하는 방법 
	1. Setter Injection
	2. Construction Injection

Spring은 조립을 해주는 Service
객체를 조립해주기 위해서는 Container가 필요한데 Spring에서는 그것을 IoC 컨테이너라고 한다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
IoC(Inversion Of Control) Control

	부품 컨테이너 

	IoC 컨테이너는 작은 부품 만들고 큰 부품 만들어서 결합 
	
	일체형의 경우 
	A라는 큰 객체를 먼저 만들고 생성될때 B,C,D,E를 생성 
	IoC컨테이너 
	작은 객체 D를 먼저 만들고 C,B,A순으로 만듬 -> 그래서 '역순'

	그 부품을 결합
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
코드 스테이트 

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

스프링을 지원하는 Plugin 
sts  Boot를 지원 아직 이클립스 기반 Spring을 사용 


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

지시서는 XML파일을 통해 만들어준다. 
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
Spring IoC  컨테이너 이용하기 

DI, 지시서를 읽어서 그녀석을 생성하고 조립해주는 구체적인 객체이름은  ApplicationContext (인터페이스) 이것을 구체화하는 객체들은 여러개중에 대표적으로 ClassPathXmlApplicationContext가 있음

ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");	
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

setter를 통해 직접 값으로 지정하는 방법 
	<bean id="exam" class="com......NewlecExam">
		<property name="kor" ref="객체용" value="20"> 
		<propery name="eng">
			<value>50</value>
		</property>
	</bean>

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

생성자 DI 
nameSpace의 역할 : module을 가지고 있는데 길

