/**
a limited vocabulary with 1024 english words encoded as a 1D array of 

words

words source: https://gist.github.com/deekayen/4148741
-- from the above list of words have been kept only the words that have 

at least 3 letters
-- in addition, several words have been added so that there exist words 

that start with every letter of the english alphabet
*/

public class ValidWords{
	private String[] words = {
		"i",
		"a",
		"o",
		"e",
		"u",
		"z",
		"m",
		"n",
		"b",
		"d",
		"q",
		"r",
		"f",
		"y",
		"j",
		"g",
		"x",
		"go",
        "one",
		"able",
		"about",
		"above",
		"act",
		"tall",
		"teach",
		"team",
		"teeth",
		"tell",
		"temperature",
		"ten",
		"term",
		"test",
		"than",
		"thank",
		"that",
		"the",
		"their",
		"together",
		"told",
		"tone",
		"too",
		"two",
		"type",
		"under",
		"unit",
		"until",
		"use",
		"usual",
		"valley",
		"value",
		"vary",
		"verb",
		"very",
		"view",
		"village",
		"visit",
		"voice",
		"vowel",
		"wait",
		"walk",
		"wall",
		"want",
		"war",
		"warm",
		"was",
		"wash",
		"watch",
		"water",
		"wave",
		"way",
		"wear",
		"weather",
		"week",
		"weekend",
		"weight",
		"well",
		"went",
		"were",
		"west",
		"what",
		"wheel",
		"when",
		"where",
		"whether",
		"which",
		"while",
		"white",
		"who",
		"whole",
		"whose",
		"why",
		"wide",
		"wife",
		"wild",
		"will",
		"win",
		"zoologist"
    };  // here ends the 1D array of words
    
    public String[] getWords() {
        return this.words;
    }

  

}