import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher<String> {

    private Set<Flow.Subscriber> subscribers;

    StringPublisher(){
        subscribers = new HashSet<>();
    }

    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
       subscribers.add(subscriber);
    }

    public void publish(String message){
     for(Flow.Subscriber subscriber: this.subscribers){

         boolean containAlphabet = message.matches(".*[a-zA-Z].*");
         boolean containNumber = message.matches(".*\\d.*");
         boolean containSymbol = !message.matches("[a-zA-Z0-9]+");

         if(containAlphabet && subscriber instanceof AlphabetSubscriber){
             subscriber.onNext(message);
         }

         if(containNumber && subscriber instanceof NumberSubscriber){
             subscriber.onNext(message);
         }

         if(containSymbol && subscriber instanceof SymbolSubscriber){
             subscriber.onNext(message);
         }


     }
    }
}
