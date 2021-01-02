/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * ----
 * 
 * This class contains 100 computer related words. Only those words are valid
 * for the game. These validity of those word are checked in the GameController
 * class. If the entered word matches one of the words in he string array, the
 * validation will be approved (Validation rule Nr2). This is one of the
 * validarion rules for the user to get points.
 * 
 */

// the name of the class
public class ValidWords {

	// default constructor. It does not take any parameters as the valus will be
	// accessed via getter (getWords() method.)
	ValidWords() {
	}

	// !!!!!!!!!!!!!!!!!!!!!!!! ISIMTI NEREIKALINGUS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	/**
	 * This is the array of valid words. The entered word (input) will be compared
	 * with each of the values ( via loop in the GameContoller class. ) The array is
	 * marked as private access modifier. The values can be access getWords method.
	 */

	private String[] words = { "i", "a", "o", "e", "u", "z", "m", "n", "b", "d", "q", "r", "f", "y", "j", "g", "x",
			"go", "one", "algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug",
			"binary", "browser", "bus", "cache", "command", "computer", "cookie", "compiler", "cyberspace", "compress",
			"configure", "database", "digital", "data", "debug", "desktop", "disk", "domain", "decompress",
			"development", "download", "dynamic", "email", "encryption", "firewall", "flowchart", "file", "folder",
			"graphics", "hyperlink", "host", "hardware", "icon", "inbox", "internet", "kernel", "keyword", "keyboard",
			"laptop", "login", "logic", "malware", "motherboard", "mouse", "mainframe", "memory", "monitor",
			"multimedia", "network", "node", "offline", "online", "path", "process", "protocol", "password", "phishing",
			"platform", "program", "portal", "privacy", "programmer", "queue", "resolution", "root", "restore",
			"router", "reboot", "runtime", "screen", "security", "shell", "snapshot", "spam", "screenshot", "server",
			"script", "software", "spreadsheet", "storage", "site", "syntax", "table", "template", "thread", "terminal",
			"username", "virtual", "virus", "web", "website", "window", "wireless"

	}; // the end of the array

	/**
	 * This is the getter method. It was the public access modifier. The values can
	 * be accessed via this method in another class if the instance of this class is
	 * created.
	 * 
	 */
	public String[] getWords() {
		return this.words;
	}

	/**This is the setter method.It was the public access modifier. The values can
	 * be set via this method in another class if the instance of this class is
	 * created.  */

	public void setWords(String[] words) {
		this.words = words;
	}


	// the end of the insta class
}