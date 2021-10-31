import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String>{

    abstract public void onSubscribe(Flow.Subscription subscription);

    abstract public void onNext(String item);

    @Override
    public void onError(Throwable throwable) {
       throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
