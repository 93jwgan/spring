package test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main (String[] args){
		//TransportationWalk tw = new TransportationWalk();
		//tw.move();
		
		
		/* 컨테이너에 접근하기 위한 데이터 타입 */
		GenericXmlApplicationContext ctx =                        /*파일이름*/
				new GenericXmlApplicationContext("classpath:applicationContext.xml");

												/* getBean: 컨테이너에 있는 Bean을 가져옴 */
		TransportationWalk transportationWalk = ctx.getBean("tWalk",TransportationWalk.class);
		transportationWalk.move();
			
		/* 외부 리소스 사용 후 반환 */
		ctx.close();
	}
}
