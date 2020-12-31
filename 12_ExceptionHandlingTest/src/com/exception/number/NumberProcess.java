package com.exception.number;

public class NumberProcess {
		
	public NumberProcess() {
		
	}

	public boolean checkDouble(int a, int b) throws NumberRangerException{

		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			if (a % b == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new NumberRangerException("1부터 100사이의 값이 아닙니다.");
		}

	}

}
