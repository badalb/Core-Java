package com.test.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	String name;
	double salary;
	int age;
	long cardNo;

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
		out.writeDouble(salary);

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
		salary = in.readDouble();

	}
}