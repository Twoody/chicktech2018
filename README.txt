ChickTech 2018 Platt Colege Presentation

Authors:
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
		A. Wedding Pamphlet
		B. Modern Day Applications
		C. Naming Conventions
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
