import java.util.Map;
import java.util.Assert;
import java.util.Association;




public class atinLay {
	public static void main(String[] args) {
		Association dict[] = new Association[9];

		dict[0] = new Association("a", "aay");
		dict[1] = new Association("had", "adhay");
		dict[2] = new Association("dad", "adday");
		dict[3] = new Association("day", "ayday");
		dict[4] = new Association("hop", "ophay");
		dict[5] = new Association("on", "onay");
		dict[6] = new Association("pop", "oppay");
		dict[7] = new Association("sad", "adsay");
		dict[8] = new Association("bad", "adbay");

		for(int argn = 0; argn < args.length; argn++) {
			for(int dictn = 0; dictn < dict.length; dictn++) {
				if(dict[dictn].getKey().equals(args[argn])) 
					System.out.println(dict[dictn].getValue());
			}
		}
	}
}