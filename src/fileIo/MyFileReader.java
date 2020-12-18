package fileIo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFileReader {

    //properties for this class
    // goal : rad in a file and parse through it
    private String directoryName; // the data folder (in parent directory already), src/fileIo
    private String fileName;      // the "day18.txt", "jolts.txt"
    private String logFileName;   // store any logging info, what went right / wrong
    private Path directoryPath;   // Path representation of the parent directory for our files
    private Path filePath;        // actual file itself, data/day18.txt
    private Path logFilePath;      // Path representation of the log file // file for reading the file(?)
    private List<String> fileLines;    // the lines of the file line by line, holding spot for the content from data file
    private List<String> logFileLines;  // Holding spot for the content inside of the log file


    // Constructor
    //      want to send in a directory path name, and a logFile name a file name, and generate EVERYTHING from just those two values

    public MyFileReader(String directoryName, String fileName, String logFileName) throws IOException {
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        // Instantiating Path values
        this.directoryPath = Paths.get(directoryName); // Paths.get( " data " )
        this.filePath = Paths.get(directoryName, fileName); // the directoryName is the path to where you are placing the file in
        this.logFilePath = Paths.get(directoryName, logFileName);

        // check if the files exist and create them if they do not
        // create a log file to have your error catching log to in case of a program crash

        //Log file
        if (Files.notExists(this.logFilePath)){
            try{
                //try to create the file as it apparently does not exist
                Files.createFile(this.logFilePath);

            }catch (IOException e) { // generated from the more options of the createFile method above
                //Store this exception in the log file ( but it does not exist yet )
                // if there is an issue creating the log file, crash the party and throw an IOException
                throw new IOException("Unable to create the logfile (" + this.logFileName + ")!");

            }
        }

        // Directory for data file ( "data" ), ("src/fileIo")
        if(Files.notExists(this.directoryPath)){
            try{
                Files.createDirectories(this.directoryPath);// createDirector i e s plural to then create any or all possible directories needed for path
            } catch (IOException e){
                //Add this error e to the log, it is created as this is happening after the first if above to create the log path
                // files.write ( path object, list < string > of message(s) for file, appendOption (add stuff to the file rather than overwrite))
                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);

                // stop the process, crash the party
                throw new IOException("Unable to create the data directory (" + this.directoryName + ")!");
            }
        }

        // Data file (day18.txt)
        if(Files.notExists(this.filePath)){
            try{
                Files.createFile(this.filePath); // src/day18.txt
            } catch(IOException e){
                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND); // append the error

                throw new IOException("Unable to create the data file (" + this.fileName+ ")!");
            }
        }

        // see what we did here with some souts => test if the instantiation works
        System.out.println(filePath); // display the file path for the passed in arguments
        this.fileLines = Files.readAllLines(this.filePath); // this will give every line in the day18.txt, for example,
        // as a String in a List<String>
        // can then use the getter on the newly created object and thisFileReader.getFileLines() to return it
    }









    //PSVM ( you can think of this as being 20 files away from this file - it is STATIC )
    public static void main(String[] args) throws IOException {
        // instantiate a file reader object, and see if it works

        MyFileReader thisFileReader = new MyFileReader("src/data", "day18.txt", "day18Log.txt");

        thisFileReader.writeToLog("Successfully read the " + thisFileReader.getFileName() + " file!"); //using the new method to easily write to the log

        System.out.println("day18 file, here is the first line from the list");
        System.out.println(thisFileReader.getFileLines().get(0));

        // set up a new file reader object with different values to access the "jolts.txt" file
        MyFileReader joltsReader = new MyFileReader("src/fileIo", "jolts.txt", "joltsLog.txt");



    }






    // CUSTOM METHODS
    // to be able to easily write a message to the log without all this nested method calling

    public void writeToLog(String message) throws IOException {
        try{
            //write the string message to the log file of This Instance of the File reader object that is instantiated
            Files.write(this.logFilePath, Arrays.asList(message), StandardOpenOption.APPEND);
        }catch(IOException e){
            Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
             throw new IOException("Unable to write custom message " + message+ " to log file");
        }
    }






    // Getters and Setters
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogFileLines() {
        return logFileLines;
    }

    public void setLogFileLines(List<String> logFileLines) {
        this.logFileLines = logFileLines;
    }
}
