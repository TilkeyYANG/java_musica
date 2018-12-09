/** "StyleSwitch" class:  Change the instrument and mode.  
 * 
 * @author Leshanshui YANG
 * @date 2017.04.05
 * @version 1.0  
 */ 
public class StyleSwitch {
	
	private int styleSet = 1;

	/**
	 * style1() to change the mode to "DRUMS".
	 * style2() to change the mode to "CHORD".
	 * style3() to change the mode to "SYNTH".
	 * Fonctions actived by goStyle1();goStyle2();goStyle3(); from class MusicaTrialView.
	 *
	 * @param 
	 * @return styleSet 
	 */
	public int style1() {
		styleSet = 1;
		System.out.println("Style=1");
		return styleSet; 
	}
	
	public int style2() {
		styleSet = 2;
		System.out.println("Style=2");
		return styleSet; 
	}
	
	public int style3() {
		styleSet = 3;
		System.out.println("Style=3");
		return styleSet; 
	}
}
