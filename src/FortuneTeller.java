import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FortuneTeller {
    private List<String> fortunes;

    public void initialize(String filePath){
        this.fortunes=new ArrayList<>();
        try(Scanner scanner=new Scanner(new File(filePath))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(!line.isEmpty()){
                    fortunes.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Fortune file not found: "+filePath,e);
        }
    }
    public String chooseFortune(){
        int size=this.fortunes.size();
        int rand=(int)(Math.random()*size);
        return fortunes.get(rand);
    }
}

