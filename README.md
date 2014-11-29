# Search Tool - Proof of Concept :
## Program Features :
   * Gives a GUI for a Search Tool.
   * Browse using a File Chooser to select the required Directory.
   * Search Preferences based on User Choice.
   * Output Window to Display Details.

![Image](/img/mainWindow.png "GUI Interface")

## Program Details :
   * Program is written in Java.
   * Search Based on the following options:
      * Pattern Contained at the end of the Filename.
      * Pattern Contained in the Filename.
      * Pattern Matched using the Input Regular Expression.
   * Output Window displays the Filename along with the Absolute Path.
   * If Directory Path not specified, Current Directory is Utilised.
  
## Program Execution :
```
  > cd SearchTool/dist
  > java -jar SearchTool.jar
```

## Working :
  * Browse Functionality 
![Image](/img/browse.png "Browse Functionality")
  * Search Functionality
![Image](/img/output.png "Search Functionality")

## To Do :
  * Search in Directories Present in the Specified Directory.
  * Additional Functionality in Searching.
  * Formatted Display in Output Window.