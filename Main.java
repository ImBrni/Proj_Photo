import java.nio.file.*;
import java.util.stream.Stream;

public class Main {

    public static boolean clear_directory(Path dir) {
        return true;
    }
    
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("""
                               
                               No arguments received, here's the help guide:

                               Proj_Photos is a CLI program, that creates .html files in a target directory, to view all pictures within it, in a web browser

                               Usage: java -jar Proj_Photosjar [Directory] [Option] [...]

                               Directory: The directory in which the operations should be made

                               Option:
                               -c, --clear : To only clear previously created .html files, without adding new ones
                               """);
            System.exit(0);
        }

        var dir = Paths.get(args[0]);

        if (!Files.isDirectory(dir)) {
            System.out.println(args[0] +" is not a directory");
            System.exit(0);
        }

        if (args.length > 1 && ( args[1].equals("-c") || args[1].equals("--clear") )) {
            System.out.println(clear_directory(dir) ? "Successfully deleted previous files" : "Failed to delete previous files");
            System.exit(0);
        }

        
        
        System.out.println("Args:");
        Stream.of(args).forEach(System.out::println);
    }
}
