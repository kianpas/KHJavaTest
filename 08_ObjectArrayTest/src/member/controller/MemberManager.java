package member.controller;

import java.util.Arrays;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	//배열객체 선언
	Silver[] sArr = new Silver[10];
	Gold[] gArr = new Gold[10];
	Vip[] vArr = new Vip[10];
	VVip[] vvArr = new VVip[10];
	//배열의 인덱스
	int sIndex = 0;
	int gIndex = 0;
	int vIndex = 0;
	int vvIndex = 0;
	
	public void silverInsert(Silver silver) {
		
		//메인메소드의 입력값 받도록함
		silver = new Silver(silver.getName(), silver.getGrade(), silver.getPoint());
		//sIndex는 값이 있을 때 증가하며 배열 길이 판단
		sArr[sIndex++] = silver;

	}
		
	public void goldInsert(Gold gold) {

		gold = new Gold(gold.getName(), gold.getGrade(), gold.getPoint());
		gArr[gIndex++] = gold;

	}
	
	public void vipInsert(Vip vip) {

		vip = new Vip(vip.getName(), vip.getGrade(), vip.getPoint());
		vArr[vIndex++] = vip;

	}
	
	public void vvipInsert(VVip vvip) {

		vvip = new VVip(vvip.getName(), vvip.getGrade(), vvip.getPoint());
		vvArr[vvIndex++] = vvip;

	}
	
	public void printData() {
		
		String info = "------------<<회원정보>>------------" + "\n이름\t 등급\t 포인트\t 이자포인트" 
					+ "\n----------------------------------";
		System.out.println(info);

		for (int i = 0; i < sIndex; i++) {
			
//			System.out.println(sArr[i].getName() + "\t" + sArr[i].getGrade() + "\t" + sArr[i].getPoint() + "\t"
//					+ sArr[i].getInterPoint());
			
			System.out.printf("%s \t %s  %d \t %.2f\n", sArr[i].getName(), sArr[i].getGrade(), sArr[i].getPoint()
					,(double)sArr[i].getInterPoint());
		}
		
		for (int i = 0; i < gIndex; i++)
			
//			System.out.println(gArr[i].getName() + "\t" + gArr[i].getGrade() + "\t" + gArr[i].getPoint() + "\t"
//					+ gArr[i].getInterPoint());
			
			System.out.printf("%s \t %s    %d \t %.2f\n", gArr[i].getName(), gArr[i].getGrade(), gArr[i].getPoint()
					,(double)gArr[i].getInterPoint());
	
		for (int i = 0; i < vIndex; i++)
			
//			System.out.println(vArr[i].getName() + "\t" + vArr[i].getGrade() + "\t" + vArr[i].getPoint() + "\t"
//					+ vArr[i].getInterPoint());
			
			System.out.printf("%s \t %s    %d \t %.2f\n", vArr[i].getName(), vArr[i].getGrade(), vArr[i].getPoint()
					,(double)vArr[i].getInterPoint());
			
			
		for (int i = 0; i < vvIndex; i++)
			
//			System.out.println(vvArr[i].getName() + "\t" + vvArr[i].getGrade() + "\t" + vvArr[i].getPoint() + "\t"
//					+ vvArr[i].getInterPoint());
			
			System.out.printf("%s \t %s  %d \t %.2f\n", vvArr[i].getName(), vvArr[i].getGrade(), vvArr[i].getPoint()
					,(double)vvArr[i].getInterPoint());

	}

}
