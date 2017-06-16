

import java.util.Properties;
public class prober extends Thread {
    public static void main(String[] args)
    
    {  
    	
    	 String s1  = System.getProperty("os.name");
    	
        Properties props = System.getProperties();
        System.out.println(props.getProperty("os.name"));
        System.out.println(props.getProperty("os.version"));
   if (s1.equals("Windows")) 
   		{ System.out.println ("You are Runnung Windows!!");}
   
   		else if (s1.equals("Mac OS")) 
   		{ System.out.println ("You are Runnung Mac!!");}
   		
   		else if (s1.equals("Linux")) 
   		{ System.out.println ("You are Runnung Linux!!");};
        
    }
   
}

/*

Welcome to Prettydesk Flatpak installer, affectionately known as PFI 
This is being developed on Eclipse
Version: Oxygen Release Candidate 3 (4.7.0 RC3)
Build id: 20170608-2000

This Java code runs on Mac , Windows, and linux without any changes 
The goal of this project is to create a  graphical package installer
Assuming the the file is on one's computer
for instance a program called solitaire.flatpak in /home/Evelyn
a Drag and drop interface us what is needed. 

The command line to install an app should be:
pfi install /home/Evelyn/solitaire.flatpak, this will run the flatpak command for install

If this can be done, then we can move on to other formats such as snaps and appimage. 
the idea is for one tool that seamlessly handles popular package formats . 
test comment

Development path:
create some code to determine wich OS the Prettydesk Package Installer is on  Mac, Windows, Linux.
If Linux, input exact path of file to install 
determine if file is flatpak for linux64 (.flatpak and .flatpakref will be handled the same from the perspective of the end user. 

It is understood that flatpak is already existent for Linux, and is in the works for mac.
thus entire software program is built on the assumption that there will one day be flatpak apps avaialable for Linux, Mac, and Windows. 
initially, the project will focus on flatpak for linux, and then Appimage will be added. 
Mac support will be added later, at such a time that .flatpak exists for Mac. 


**/