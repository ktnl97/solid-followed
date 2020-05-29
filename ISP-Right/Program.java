package Right;

public class Program {
    public static void main(String[] args){
        IWorker human = new HumanWorker();
        human.signIn();
        IWorker robot = new Robot();
        robot.signIn();
    }
}
