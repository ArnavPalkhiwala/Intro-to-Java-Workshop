package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell cheetah");
		// 2. Catch the user's answer in a String
String word=JOptionPane.showInputDialog("Type the word here...");
		// 3. If the user spelled the word correctly, speak "correct"
if(word.equals("cheetah"))
speak("correct, you are a genius and should go to Stanford, not!! Goteeee");

		// 4. Otherwise say "wrong"
 else{
speak("weirdo, you need to go to kindergarden");
if(word.equals("cheetah"))
speak("+1 Point");
else{
speak("0 Points");
}
 }

 
 
		// 5. repeat the process for other words
		speak("spell python");
		String word1=JOptionPane.showInputDialog("Type the word here...");
	if(word1.equals("python"))
speak("correct");	
	else{
speak("incorrect");	
if(word1.equals("python"))
speak("+1 point");
else{
speak("0 Points");
} 
}
	
		
		
		
		
	
	
	
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


