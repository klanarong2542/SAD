import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber{

    private String workDir;

    SymbolSubscriber(){
        this.workDir = "src/resources/symbol.txt";
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {
        System.out.print("Symbol subscriber received message: " + item);

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
