import java.util.ArrayList;
public class triplets 
{
	public static void main(String [] args) 
	{
		//VARIABLE DECLARATIONS AND INITIALIZATIONS
		String noun = null, noun2= null, verb1 = null, verb2 = null, verb3 = null, rhymingNoun1 = null, rhymingNoun2 = null, rhymingNoun3 = null;
		int randomNum = 0;
		ArrayList<String> nouns = new ArrayList<String>();
		ArrayList<String> verbs = new ArrayList<String>();
		ArrayList<String> rhymingNouns = new ArrayList<String>();
		ArrayList<String> lineTwo = new ArrayList<String>();
		nouns.add("elephant");
		nouns.add("boy");
		nouns.add("girl");
		nouns.add("bear");
		nouns.add("penguin");
		nouns.add("monkey");
		nouns.add("clown");
		verbs.add("walked");
		verbs.add("sat");
		verbs.add("drew");
		verbs.add("jogged");
		verbs.add("skated");
		verbs.add("swam");
		verbs.add("studied");
		verbs.add("sung");
		rhymingNouns.add("cat");
		rhymingNouns.add("bat");
		rhymingNouns.add("hat");
		rhymingNouns.add("mat");
		rhymingNouns.add("acrobat");
		rhymingNouns.add("tomcat");
		rhymingNouns.add("doormat");
		rhymingNouns.add("brat");
		lineTwo.add("habitat");
		lineTwo.add("house");
		//get a random noun from the nouns array
		//use .size() to get the # of elements
		randomNum = (int) (Math.random() * nouns.size());
		noun = nouns.get(randomNum);
		nouns.remove(randomNum);
		
		randomNum = (int) (Math.random() * nouns.size());
		noun2 = nouns.get(randomNum);
		nouns.remove(randomNum);

		//get the first random verb from the verbs array &
		// remove from ArrayList
		randomNum = (int) (Math.random() * verbs.size());
		verb1 = verbs.get(randomNum);
		verbs.remove(randomNum);

		//get the second random verb from verbs array and remove it
		randomNum = (int) (Math.random() * verbs.size());
		verb2 = verbs.get(randomNum);
		verbs.remove(randomNum);
		
		randomNum = (int) (Math.random() * verbs.size());
		verb3 = verbs.get(randomNum);
		verbs.remove(randomNum);

		//get the first rhyming noun and remove it
		randomNum = (int) (Math.random() * rhymingNouns.size());
		rhymingNoun1 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);

		//get the second rhyming noun and remove it
		randomNum = (int) (Math.random() * rhymingNouns.size());
		rhymingNoun2 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);
		
		randomNum = (int) (Math.random() * rhymingNouns.size());
		rhymingNoun3 = rhymingNouns.get(randomNum);
		rhymingNouns.remove(randomNum);

		System.out.println("The " + noun + " " + verb1 + " around a " + 
				rhymingNoun1 + "\n" + "And then " + verb2 + 
				" on the " + rhymingNoun2 + "\nSince a " + noun2 + " " + verb3 +
				" around the " + rhymingNoun3);
	}
}
