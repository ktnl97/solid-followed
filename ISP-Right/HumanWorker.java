package Right;

public class HumanWorker implements IHumanWorker, IWorker {


    @Override
    public void teaBreak() {
        System.out.println("Hey I'm taking a tea break");
    }

    @Override
    public void lunch() {
        System.out.println("Hey I'm having lunch");
    }

    @Override
    public void signIn() {
        System.out.println("Hey I'm just signing in");
    }

    @Override
    public void startWork() {
        System.out.println("Hey I'm starting to work");
    }

    @Override
    public void continueWork() {
        System.out.println("Hey I'm working");
    }

    @Override
    public void signOut() {
        System.out.println("Hey I'm just signing out");
    }
}
