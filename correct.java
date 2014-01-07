public class correct {
	public static void main(String[] args) {
		
	}
	//WORDSCRAMBLER
	public static String recombine(String str1, String str2){
		return str1.substring(0, (str1.length()/2)) + str2.substring(str2.length()/2, str2.length());
	}
	public static String[] mixedWords(String[] words){
		for (int i = 0; i<words.length; i+=2) {
			String temp1 = words[i];
			String temp2 = words[i+1];
			words[i].equals(recombine(temp1, temp2));
			words[i+1].equals(recombine(temp2, temp1));
		}
		return words;
	}
	//
	
	//MOUNTAIN
	public static boolean isIncreasing(int[] array, int stop){
		return true;
	}
	public static boolean isDecreasing(int[] array, int start){
		return true;
	}
	public static int getPeakIndex(int[] array){
		for (int i = 1; i<array.length; i++) {
			if (array[i] > array[i-1] && array[i] < array[i+1]) {
				return i;
			}

		}
		return -1;
	}
	public static boolean isMountain(int[] array){
		if (isIncreasing(array, array.length/2) && isDecreasing(array, array.length/2)) {
			return true;
		} else {
			return false;

		}
	}



}