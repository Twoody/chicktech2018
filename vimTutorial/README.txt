Author:
	Tanner.L.Woody@gmail.com 20181111

Purpose:
	This is a quick, SIMPLE guide for the VIM Text Editor.

Further Reading and Weblinks:
	vimtutor
		In terminal type in the command:
			vimtutor
		Going through this tutorial will amply provide more information than
		this simple readme will accomplish. This readme is simply a cheat sheet
		and reference for commands that we will need for our project.
	Cheatsheet:
		https://devhints.io/vim
	File Extensions
		.doc .txt .sql .java .class .xcl --> These all mean something important!
	Why Vim?
		http://www.terminally-incoherent.com/blog/2012/03/21/why-vim/

Downfalls to avoid:
	** IF MAC (UNIX/LINUX) READ cntrl AS command **

	Touching the Mouse/Trackpad
		Try to avoid touching the mousepad, and remember that vim is purposed
		around all of the instances we as developers have to go through where
		a mouse is not available.
	cntrl+s		-- Save
	contrl+c		-- Copy
	contrl+v		-- Paste
	contrl+f		-- Find/search
	contrl+z		-- Undo
	contrl+y		-- Redo
	Home
	End
	x				-- DO NOT HIT THE X BUTTON TO CLOSE YOUR WINDOW!!!

Modes:
	For our purpose:
		Normal and Insert
	Other Modes:
		Replace, Record, Visual, Search

Basic Understanding:
	Vim can open anything. To open something:
		vim myfile.txt
	Vim begins in normal mode.
	Vim can be (q)uit
	Vim can (w)rite to disk. Writing to disk is AKA saving.
	Vim can undo changes.
	Vim can redo changes.
	To quit, write to disk, or enter an operating command, either a colon, esc,
		or a forward slash must be used.

Novice Understanding (Any why to use vim):
	Vim can repeat a process again and again.
	Vim can alter "blocks" of text.
	Vim can match parentheses and brackets.
	Vim can change a thousands/millions of lines in a data file.
		Think about data entry and having to add a new column with value `foo`.
	
Needed commands for this project:
	Normal Mode:
		/					--> Enter Search Mode
		i					--> Enter Insert Mode
		q					--> Enter (and exit) recording mode
		v					--> Enter Visual Mode
		cntrl+v			--> Enter Visual Block Mode

		:q					--> quit editing the file
		:q!				--> FORCE quit editing the file
		:w					--> write to disk

		dd  				--> delete the current line; Stores like `yy`; i.e. CUT;
		yy					--> yank (i.e. cp) the current line
		p					--> paste what is on the clipboard
		u					--> undo last change
		cntrl+r			--> redo last change
		esc				--> Exit **** mode

		:999				--> Go to line 999
		gg					--> Go to head of file
		G					--> Go to end of file
		%					--> Go to closing bracket
		$					--> Go to end of line
		0					--> Go to begining of line

		:%s!Foo!Bar!g	--> Replace (g)lobally all Foo with Bar
		:sp foo.tmp		--> Open `foo.tmp` file (sp)lit screen
		:set paste		--> Allow for normal pasting with no funny business
		:set nopaste	--> Turn pasting back off
		:set nu			--> Add line numbers
		:set nonu		--> Remove line numbers
	
	Search Mode:
		To enter search mode, type a forward slash (/).
		Say we are searching for "searchForThis".
		Type in `searchForThis` after our initial forward slash.
		Hit enter. We will be sent to the first instance of `searchForThis`.
		To go to the next instance, hit `n`.
		To go to the previous instance, hit `N`.
		To turn case sensitivity off, type `\c` after our first `/`.

	Insert Mode:
		Type, delete, text...
		`esc` will put you back in Normal Mode
	
	Visual Mode:
		`esc` will put you back in Normal Mode
		
		In visual mode, we are essentially acting like we are holding the
		mouse left-click down, and selecting text.
		This is important because we can `cut` selected text.
		We can also modify the specific text (make it all lowercase/uppercase).
		
		The bigger feat is done with visual block mode, where we can highlight
		and select text vertically, intead of horizontally.
		In this feature, we can insert columns, change data types, and more.

	Replace Mode:
		`esc` will put you back in Normal Mode
		
	Record Mode:
		`q` will put you back in Normal Mode
