import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();

        AlphabetSubscriber alphabetSubscriber = new AlphabetSubscriber();
        NumberSubscriber numberSubscriber = new NumberSubscriber();
        SymbolSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        System.out.println("Please input your message (Press q to exit).");
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input Message: ");
            String inputMessage = scanner.nextLine();
            if(inputMessage.equals("q") || inputMessage.length()==0){
                break;
            }

            publisher.publish(inputMessage);
        }
        System.out.println("Program stopped");
    }
}
