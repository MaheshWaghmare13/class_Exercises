
public class PigLatin {

	
	public static void main(String[] args) {
		
		String instr="Night";
		
		char out=instr.charAt(0);
		
		//System.out.println(out);
		
		String outstr= instr .substring(1);
		//System.out.println(outstr);
		
		outstr=outstr+"ay";
		
		System.out.println("Input:"+ instr);
		
		System.out.println("Output:" +outstr);

	}

}
