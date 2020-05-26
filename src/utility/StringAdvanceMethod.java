package utility;

import java.util.Arrays;

public class StringAdvanceMethod {
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String concat(String input1, String input2) {
		String output = input1 + input2;
		return output;
	}

	public String split (String input1, String input2) {
		String output[] = input1.split(input2);
		String outp = null;
		for(int i=0; i< output.length ; i++)
		{
			outp = Arrays.deepToString(output);
		}
		return outp;
	}

	public String indexOf(String input1, String input2) {
		String output = String.valueOf(input1.indexOf(input2));
		System.out.println(input1.indexOf(input2));
		return output;
	}

}
