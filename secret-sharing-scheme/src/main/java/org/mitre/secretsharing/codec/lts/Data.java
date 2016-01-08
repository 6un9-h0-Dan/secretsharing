package org.mitre.secretsharing.codec.lts;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public interface Data {
	public Data seal();
	public boolean isSealed();
	
	public void write(DataOutput output) throws PartfileException, IOException;
	public void read(DataInput input) throws PartfileException, IOException;
}
