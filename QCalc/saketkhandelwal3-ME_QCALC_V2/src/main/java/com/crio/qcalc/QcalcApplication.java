package com.crio.qcalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {

		
	LogicCalculator calc = new LogicCalculator();
	calc.OR(8, 6);
	calc.printResult();
	
	
	}
}


