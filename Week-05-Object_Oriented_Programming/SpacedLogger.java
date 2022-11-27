
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
			String newstring = "";
			for (int i = 0; i < log.length(); i++) {
				if (i < log.length() - 1) {
				newstring += log.charAt(i) + " ";
				} else {
					newstring += log.charAt(i);
				}
			}
			System.out.println(newstring);
		}
		

	@Override
	public void error(String error) {
		
			String newstring = error.toUpperCase() + ":";
			System.out.println(newstring);
		}
	}
	
	
	
	


