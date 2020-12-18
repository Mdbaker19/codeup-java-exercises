package fileIo;

import java.nio.file.Path;
import java.util.ArrayList;
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








    //PSVM







    // CUSTOM METHODS






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
