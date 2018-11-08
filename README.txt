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
	have a working environment for our project. For che

******************************************************************************************
******************************        Ch. 1        ***************************************
****************************   Grammars and Types    *************************************
******************************                     ***************************************
******************************************************************************************
	1. Grammar, Types, and ASCII
		A. ASCII && UTF8
		B. Strings
		C. Int
		D. Boolean
		E. HelloWorld.java

Standards: Naming Conventions and all of those symbols
	Before coding, it is important to understand that there is a distinct difference with
	each letter that we type. 

******************************************************************************************
**************************            Ch. 2           ************************************
************************  Logic, Flags, Conditionsals   *************************************
**************************                            ************************************
******************************************************************************************
	2. What is logic? What are flags?
		A. Conditionals: if and else
		B. Naming Conventions: isThisGoodName && doesNeedComments


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




