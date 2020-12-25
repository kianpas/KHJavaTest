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
		
		sArr[sIndex++] = silver;

	}
		
	public void goldInsert(Gold gold) {

		gArr[gIndex++] = gold;

	}
	
	public void vipInsert(Vip vip) {

		vArr[vIndex++] = vip;

	}
	
	public void vvipInsert(VVip vvip) {

		vvArr[vvIndex++] = vvip;

	}
	
	public void printData() {
		
		System.out.printf("------------<<회원정보>>------------\n%-15s %-15s %-15s %-15s\n----------------------------------\n"
							, "이름", "등급", "포인트", "이자포인트");
		
		
		for (int i = 0; i < sIndex; i++) 
			
			System.out.printf("%-10s %-10s %-10d %-10.2f\n", sArr[i].getName(), sArr[i].getGrade(), sArr[i].getPoint()
					,sArr[i].getInterPoint());
		
		
		for (int i = 0; i < gIndex; i++)
			
			System.out.printf("%-10s %-10s %-10d %-10.2f\n", gArr[i].getName(), gArr[i].getGrade(), gArr[i].getPoint()
					,gArr[i].getInterPoint());
	
		for (int i = 0; i < vIndex; i++)
			
			System.out.printf("%-10s %-10s %-10d %-10.2f\n", vArr[i].getName(), vArr[i].getGrade(), vArr[i].getPoint()
					,vArr[i].getInterPoint());
			
			
		for (int i = 0; i < vvIndex; i++)
					
			System.out.printf("%-10s %-10s %-10d %-10.2f\n", vvArr[i].getName(), vvArr[i].getGrade(), vvArr[i].getPoint()
					,vvArr[i].getInterPoint());

	}

}
