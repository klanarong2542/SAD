import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Flow;

public class AlphabetSubscriber extends StringSubscriber{

    private String workDir;

    AlphabetSubscriber(){
        this.workDir = "src/resources/alphabet.txt";
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {
        System.out.print("Alphabet subscriber received message: " + item);

        try {
            FileWriter fw = new FileWriter(this.workDir, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(item);
            bw.newLine();
            bw.close();
            System.out.println(" and has been saved to " + this.workDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
