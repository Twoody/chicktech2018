ChickTech 2018 Platt Colege Presentation

Authors:
	Tanner.L.Woody@gmail.com

Presenters:
	Tanner.L.Woody@gmail.com
	Dunia_Al_Raqeeb@windowslive.com

Date:
	20181111

Setup:
	MAC && Linux:
		brew and git
			https://github.com/monfresh/laptop
			bash <(curl -s https://raw.githubusercontent.com/monfresh/laptop/master/laptop)
		java
			brew cask install java

	Windows:
		install choco
			https://chocolatey.org/docs/installation
			1. Run cmd as admin (always do this throughout this seminar...)
			2. @"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
		Vim:
			choco install vim
			vim --version
		Git:
			choco install git.install
			choco upgrade git.install
			git --version
		Java:
			choco install jdk11 --version 11.0
			choco upgrade jdk11 --version 11.0
			java -version
	
	.vimrc:
		See `vimrc.txt` example;
		Copy `vimrc.txt` to `~/.vimrc`
			`cp vimrc.txt ~/.vimrc`
		"Plugins":
			- Pathogen
			-EasyMotion
			-CTRL-P
			-Snipmate
			-Emmet
			-Syntastic
			-Multiple cursor
			-NERD Tree

Index:
	0. What is Programming?
		A. Wedding Pamphlets and Grocery Lists
		B. Modern Day Applications: Web, Mobile, Businesses, Data
		C. Standards: Naming Conventions, 
		D. Tools: Bash, brew/chocolate, vim, git, Eclipse
	1. Grammar, Types, and ASCII
		A. ASCII && UTF8
		B. Strings
		C. Int
		D. Boolean
		E. HelloWorld.java
	2. What is logic? What are flags?
		A. Conditionals: if and else
		B. Naming Conventions: isThisGoodName && doesNeedComments
	3. DRY Principal
		A. Why DRY and not WET?
		B. Loops: For and While
		C. Keep It Simple Stupid (KISS)
	4. Hangman.java
		A. Key Words
		B. I.O. && Scanner
		C. Main


******************************************************************************************
******************************        Ch. 0        ***************************************
****************************  What is Programming?  **************************************
******************************                     ***************************************
******************************************************************************************
	0. What is Programming?
		A. Wedding Pamphlets and Grocery Lists
		B. Modern Day Applications: Web, Mobile, Businesses, Data
		C. Standards: Naming Conventions, 
		D. Tools: Bash, brew/chocolate, vim, git, Eclipse

Programming is Everywhere
	Our world has been structured by programming since the days of using sticks to make
	fires:
		Human is cold;
		Human wants fire;
		Human needs sticks && tinder;
		Human rubs sticks to light tinder;
		Human has fire;

	At any point, if one of our ancestors wanted fire, they could not switch up the steps
	to make fire. Our ancestor would not want a fire if the weather is 100 degrees and 
	humid that night. Our ancestor would find that using sea shells instead of sticks would
	lead to several failed attempts.

	We are surrounded by programs. Think musical programs, wedding programs, evacuation
	programs, College programs, etc. Everywhere we look, there are standards and expected
	behaviors for event/person/object under some form of want/desire/need/change.

	Take a wedding, for example. At a wedding, there is a wedding program placed on every
	chair. This program, often in the form of a pamphlet or fine parchment, tells the
	person sitting in that chair all of the people in the wedding. It gives the wedding
	audience context for the bride's family and bridesmaids. The wedding program provides 
	information on the person officiating the wedding, the venue, and the MC/musician.
	This wedding program then goes into the detailed events that will take place, and why
	these people are pouring sand into containers, why they are singing songs, and why 
	there are lanterns flying off into the sky later that night. 

	A wedding program also prevents people wondering around, looking for coffee. When they
	look at the program, they see that coffee will be served at 12pm. They can wait until
	then to have their coffee.

	Other types of programs are things like grocery lists. My role as a husband is to get
	my wife all of the ingredients and items on any list that she gives me. My other role
	as a husband is to not question my wife, as she is always right. So, if I have a
	grocery list, and a single character might be off, my grocery hunt can get quite
	confusing. Consider my experience at Costco last week where I was looking for `Urine`,
	when I should have been looking for `Brine`.

Modern Day Applications
	The modern day applications of programming stems from the web to mobile to John Deere.
	Software is in everything that we do. Software is in everything that we use. And 
	software will continue to dominate our lives. This is because, software's purpose, as
	seen above, is to ultimately make our lives easier. Software as a service is designed
	to save companies money, provide enjoyment, and to better communication throughout
	the world.

	Companies today need people to consult with for their Terabytes of data. Farmers need
	sensors in their tractors to stop their gears from turning when a rock gets knocked
	into them. Small businesses want to avoid Amazon's 30% cut of each sale they make.
	Small businesses want to have their own website, with their own product management
	layout. Artists do not want to pay $400 a month in server fees for their website. And
	this is just the tip of the iceberg.

Importance of Documentation (tl;dr)
	Say we go to Barnes and Noble in search for books on astrophysics.
	If we picked up a book, with no title, no summary on the back, no author, and no cover
	art, we will probably not open it up, as it is not what we are searching for.
	But say we do open it up. And we realize that there is no index, there are no chapters,
	and there are no paragraphs. We are taught to discredit this book as a professional
	source of information.

	As we learn about programming languages, we will see that there are continuous ways
	we could have done something differently in the past. Documenting the purpose of our
	code, our names and dates, and what we hope to accomplish will save heaps of time. 
	More importantly, it will save the next person to come along time.

Developers Environment && Tools: Bash, brew/chocolate, vim, git, Eclipse
	Before we can code, it is important to have a developers environment in place, which
	incorporates a stack in mind. We want to know why we are using a certain language.
	We want to know why we are using a certain tool over another tool. And we want to keep
	a file (i.e. `README.txt`) which documents the different versions of the tools we are
	using.

	For our project, I will be using stricly the terminal (bash), VIM, and git. This is to
	model the real world. More commonly, in the real world, developers are expected to 
	remote in to a server, change code on a black box (which has no display), and not 
	having a GUI for the first iterations of any project.

	At this point, we will stop and go through VIM, the terminal, and ensure that we all
	have a working environment for our project. 

******************************************************************************************
******************************        Ch. 1        ***************************************
****************************   Grammars and Types    *************************************
******************************                     ***************************************
******************************************************************************************
	1. Grammar, Types, and ASCII
		A. Naming Conventions
		B. Strings: ASCII && UTF8
		C. Other Types: Int and Boolean
		D. HelloWorld.java

Standards: Naming Conventions and all of those symbols
	'urine' a lot of trouble if a single character is off when writing code. 
	This will lead to some kind of `error` being `raised`. Before coding, it is important 
	to understand that there is a distinct difference with each letter that we type.

	For our project, we will utilize "camelCase" naming conventions. The most important
	take-away from naming conventions is that all "classes" must begin with a capital
	letter. And all methods of that parent class will then use camelCase. Futhermore,
	all variables will also use camelCase. Other options are to "seperate_each_word" with
	an underscore.

	Finally, when we create a Class, it must start with a Capital letter, and must match
	the filename specifically. For example, if we have `MyClass.java`, the file will have
	in it `class MyClass{` somwhere near the top of the file.

	Standards are important, as we will see in the jargon. We do not talk about driving
	bicycles. We do not talk about flying trains. And the definition of professionalism
	is to use the language others use in that field. In regards to a new computer language
	the first thing that developers will look up is a HelloWorld program.

	HelloWorld will simply print to console "Hello, World", or some variant as such.
	And moreover, it teachs the developer how compiling their code and executing their
	code are done. Is a `main` called? Are compiling and execution done at the same time?

	In the case of Java, we see that we have `javac` and `java` commands. We also see
	that we have a `.java` file extension. The "program" for a java file is as such:
		1.		Create a .java file
		2.		In the .java file, a `public static void main(String[] args)` MUST EXIST.
		2.a.	The "main" will tell us what the .java file is for.
		3.		We compile the .java file with the `javac` command as such:
					javac MyProg.java
		3.a.	The `javac` command will create a brand new .class file
		4.		We run the .class file by calling `java` as such:
					java MyProg
				Notice how there is no .class at the end.

Strings: ASCII && UTF8
	For our purpose, we will use strings. Strings are the bread and butter of why we love
	computers. They hold a message using an encoding set. This gets complicated real quick
	but the gist is that a string is ANY text between two quotations marks. And the 
	quotation marks should go on the same line.

	Strings are a really complex item through and through. We could talk about them being 
	immutable/mutable or how a string is a vector/array. We could talk about how each 
	character in a string is in fact a reference to some other piece of memory, telling 
	that character how to be represented. We could talk about how that piece of memory
	being referenced is in fact being allocated by a FAT32 File System and binary logic
	gates and hardware. 

	But at the end of the day, a string is a datatype to store some kind of end-user
	message, like, "Welcome to Facebook". "No results found for Foo". Etc. And these
	strings typically are of type ASCII, UTF8, or UTF16. If something comes up in VIM
	that is weird, and not fitting of ASCII, then it's probably a corrupted file, and
	things might need to be flushed out and started anew (i.e.  )).
	
	People also use strings for storing basic data, like a persons name, IP address,
	their website, and maybe their passwords.

Other Types: Int
	Int stands for integer. An integer is basically a number between 0 and Psy's
	views for Gangam Style.
	
	We use integers to keep count of iterations, data entries, and to provide
	weight to data values for algorithm purposes. Integers can also be negative!
	
	Integers can also be used to index a list. We will get to that later.

Other Types: Booleans and Conditionals
	Booleans are a fundamental block on how we think about computers. A boolean can either
	be "true" or "false". And this represents the binary nature of computers far-and-large.
	In my personal take, I think there are some fundamental issues with booleans that have
	not yet been addressed, academically. Particularly that in our idea of "programs",
	instances do not particularly have to be true or false. In some cases, a statement
	might be "maybe". For example, in our wedding setup, if we looked at our pamphlet and
	asked "Is the flower girl going to be a flower-dog?", this might and might not be true.
	We will not know unti we are introduced to the flower girl, and in fact see that she is
	a human.

	But I digress. Booleans. Think coin flips. Think single purpose questions. Think bank
	accounts and cars. We either have money for a new car, or we do not have money for a 
	new car. The amount of money in out account is not representative of anything else. We
	could even have money for a car, but not money for a house:
		if canBuyNewCar == True && canBuyHouse == False:
			print('point proven')

	A boolean is typically a factual representation of something we know exists and are
	actively recording in our program. Take a variable `isPlayerOnesTurn`. By the naming
	convention, we see that this variable is asking a straight forward, binary question.
	Is it player one's turn? IF it is player one's turn, then `isPlayerOnesTurn` is equall
	to true. Otherwise (ELSE), `isPlayerOnesTurn` is equall to false.

	Booleans take part in our conditionals. A conditional is a fancy way to say "A
	statement that is going to make our code do something different."

	For example, in our wedding, a conditional `if` and `else` could be:
		if (isRaining == true){
			getUmbrellas();
		}
		else{ //Automatically false
			//keep Umbrellas In Car
		}
	
	Conditionals are also used in For-Loops and While-Loops, which we will get to later.

******************************************************************************************
**************************            Ch. 2           ************************************
************************  Logic, Flags, Conditionsals   **********************************
**************************                            ************************************
******************************************************************************************
Conditionals: Logic comparisons
	

Naming Conventions: isThisGoodName && doesNeedComments
	a


******************************************************************************************
******************************        Ch. 3        ***************************************
***************************  Programming Principals  **************************************
******************************                     ***************************************
******************************************************************************************
	3. DRY Principal
		A. Why DRY and not WET?
		B. Loops: For and While
		C. Keep It Simple Stupid (KISS)


******************************************************************************************
******************************        Ch. 4       ****************************************
****************************      Hangman.java      **************************************
******************************                    ****************************************
******************************************************************************************
	4. Hangman.java
		A. Key Words
		B. I.O. && Scanner
		C. Main




