//Kacey Wheeler
//AP Computer Science: 3B
//12-7-19
//Nested Loops Labs Part 1
//Box Word

class BoxWord {

    //Method to create box pattern with word
    public String boxPattern(String word) {

        //Create variable for length
        int len = word.length();

        //New line and add word to output
        String output = "\n" + word ;
        
        //For each character in word
        for (int x = 1; x < len - 1; x++) {
            
            //Add character to output
            output += "\n" + word.charAt(x);
              
                //Creates white space in middle of box with spaces
                for (int s = 0; s < len - 2; s++) {
                    
                    output += " ";
                }

                //Adds character in opposite order from x
                output += word.charAt(len - 1 - x);
    }
    
    //Adds new line
    output += "\n";

    //Adds each character in the word but in reverse order
    for (int y = len - 1; y >= 0; y--) {
        output += word.charAt(y);
    }
    
    //Returns output
    return output;
}
}
