
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/** "ClipPlay" class:  Find out the source and play WAV file. 
 * 
 * @author Leshanshui YANG
 * @date 2017.04.05
 * @version 1.0  
 */ 

public class ClipPlay extends Thread {
	
	//Clip Choosing for SwitchStyle
	private AudioStream currentClip;
	private int clipNo;
	private int btnNo;
	private InputStream soundFile;
	
	//CONSTRUCTOR
	public ClipPlay(){
		this.clipNo = 1;
		this.btnNo = 1;
	}
	
	/**
	 * getBtnNo(): Get the Physic-Code of the button
	 *
	 * @param int ButtonID
	 * @return int ButtonID
	 */
	public int getBtnNo(int btnNoFromView){
		 this.btnNo = btnNoFromView; //get btn >> 1=1;Q=5;W=6;
		 System.out.println("ButtonID =" + btnNo); // 
		 return btnNo;	
	}

	/**
	 * getBtnNo(): Get Logic-Code of the piece to play.
	 * the Logic-Code equals to AAB with AA=1~16=ButtonID, B=1~3=StyleID
	 *
	 * @param int styleID
	 * @return int clipID
	 */
	public int codageClip(int stylenb){
		 clipNo = stylenb; //get style >> EleRtm=1;   clipNo = clipInput.styleOutput(); 
		 clipNo = clipNo + btnNo*10; //get code >> EleRtm1=11;EleRtmQ=51; 
		 System.out.println("ClipID =" + clipNo);
		 return clipNo;	
	}
	
	/**
	 * locateClip(): Get Logic-Code of the piece to play.
	 * put the WAV file into a temp file "is".
	 *
	 * @param int clipID
	 * @return AutoStream clipWAV 
	 */
	public AudioStream locateClip(int tmpClip) throws IOException {
		
		switch(tmpClip){
		
			//**
			//EleRtm	
			case 11:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmKick.wav");
						soundFile=is;} 
			break;      
			case 21:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmSnarecl.wav"); 
						soundFile=is;}
			break;                                                         
			case 31:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmSnare.wav"); 
						soundFile=is;}
			break;                                                           
			case 41:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmClap.wav"); 
						soundFile=is;}
			break;                                                        
			case 51:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmCrash.wav"); 
						soundFile=is;}
			break;                                                    
			case 61:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmCrash.wav"); 
						soundFile=is;}
			break;                                                          
			case 71:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmHihatOpen.wav"); 
						soundFile=is;}
			break;                                                           
			case 81:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmHihatClosed.wav"); 
						soundFile=is;}
			break;                                                          
			case 91:{   InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmExplo.wav"); //EleRtmTomhi.wav  >>  /MusicaTrial/src/pool/EleRtmClap.wav
						soundFile=is;}
			break;      
			case 101:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmFadeIn.wav"); 
						soundFile=is;}
			break;                                                              
			case 111:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmDown.wav");
						soundFile=is;}
			break;                                                             
			case 121:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmUp.wav"); 
						soundFile=is;}
			break;                                                             
			case 131:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmKick.wav"); 
						soundFile=is;} 
			break;                                                          
			case 141:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmTomlo.wav"); 
						soundFile=is;}
			break;                                                             
			case 151:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmTommi.wav"); 
						soundFile=is;}
			break;                                                              
			case 161:{     InputStream is = this.getClass().getResourceAsStream("/pool/EleRtmTomhi.wav"); 
						soundFile=is;}
			break;         
			
			case 12:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrB.wav");
						soundFile=is;} 
			break;      
			case 22:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrC.wav"); 
						soundFile=is;}
			break;                                                         
			case 32:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrF.wav"); 
						soundFile=is;}
			break;                                                           
			case 42:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaFlo.wav"); 
						soundFile=is;}
			break;                                                        
			case 52:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrA.wav"); 
						soundFile=is;}
			break;                                                    
			case 62:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrD.wav"); 
						soundFile=is;}
			break;                                                          
			case 72:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaDdorian.wav"); 
						soundFile=is;}
			break;                                                           
			case 82:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaG.wav"); 
						soundFile=is;}
			break;                                                          
			case 92:{   InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrG.wav"); //EleRtmTomhi.wav  >>  /MusicaTrial/src/pool/EleRtmClap.wav
						soundFile=is;}
			break;      
			case 102:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrDdorian.wav"); 
						soundFile=is;}
			break;                                                              
			case 112:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaD.wav");
						soundFile=is;}
			break;                                                             
			case 122:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaA.wav"); 
						soundFile=is;}
			break;                                                             
			case 132:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordGtrFlo.wav"); 
						soundFile=is;} 
			break;                                                          
			case 142:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaF.wav"); 
						soundFile=is;}
			break;                                                             
			case 152:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaC.wav"); 
						soundFile=is;}
			break;                                                              
			case 162:{     InputStream is = this.getClass().getResourceAsStream("/pool/ChordPiaB.wav"); 
						soundFile=is;}
			break;       
						
			case 13:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynKit1.wav");
						soundFile=is;} 
			break;      
			case 23:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynKit2.wav"); 
						soundFile=is;}
			break;                                                         
			case 33:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynKit4.wav"); 
						soundFile=is;}
			break;                                                           
			case 43:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynKit3.wav"); 
						soundFile=is;}
			break;                                                        
			case 53:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynBas1.wav"); 
						soundFile=is;}
			break;                                                    
			case 63:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynBas2.wav"); 
						soundFile=is;}
			break;                                                          
			case 73:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynBas4.wav"); 
						soundFile=is;}
			break;                                                           
			case 83:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynGtr1.wav"); 
						soundFile=is;}
			break;                                                          
			case 93:{   InputStream is = this.getClass().getResourceAsStream("/pool/SynPad1.wav"); //EleRtmTomhi.wav  >>  /MusicaTrial/src/pool/EleRtmClap.wav
						soundFile=is;}
			break;      
			case 103:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynPad2.wav"); 
						soundFile=is;}
			break;                                                              
			case 113:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynPad4.wav");
						soundFile=is;}
			break;                                                             
			case 123:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynGtr2.wav"); 
						soundFile=is;}
			break;                                                             
			case 133:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynLead1.wav"); 
						soundFile=is;} 
			break;                                                          
			case 143:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynLead2.wav"); 
						soundFile=is;}
			break;                                                             
			case 153:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynLead4.wav"); 
						soundFile=is;}
			break;                                                              
			case 163:{     InputStream is = this.getClass().getResourceAsStream("/pool/SynSyn1.wav"); 
						soundFile=is;}
			break;   
			default:{}
			break;
		}
		
		System.out.println("ClipSource =" + soundFile);
		AudioStream tmp = new AudioStream(soundFile);

		return tmp; 
	}
	
	
	/**
	 * playClip(): Play the clip.
	 *
	 * @param AudioStream is
	 * @return  
	 */
	public void playClip(AudioStream clipReady) {
		
		AudioPlayer.player.start(clipReady);
		System.out.println("played");
	}
	
	/**
	 * hong(): Excuter all the other fonctions.
	 * actived by activeBtn() from VIEW.
	 * @param 
	 * @return  
	 */
	public void hong(int stylenb) throws IOException{ //Array of commands
		codageClip(stylenb);
		this.currentClip=locateClip(clipNo);
		playClip(this.currentClip);
	}
	
}
