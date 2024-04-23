public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		a = new ArrayList<String>();
		String []b = getSingleLetters(str);
		for (int i =0; i<b.length; i++){
			a.add(b[i]);
		}
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}

