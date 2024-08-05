package com.aurionpro.behavioural.stratergy.test;

import com.aurionpro.behavioural.stratergy.model.AddOperation;
import com.aurionpro.behavioural.stratergy.model.MultiplyOperation;
import com.aurionpro.behavioural.stratergy.model.OperationStratergy;
import com.sun.corba.se.spi.orb.Operation;

public class OperationStratergyTest {
public static void main(String[] args) {
	OperationStratergy op =new OperationStratergy(new AddOperation());
	int add = op.doOperation(2, 3);
	
	System.out.println("Addition : "+op.doOperation(2, 3));
	op.setOperation(new MultiplyOperation());
	System.out.println("Multiplication : "+op.doOperation(2, 3));
}
}
