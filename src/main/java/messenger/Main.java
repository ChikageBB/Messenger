package messenger;

public class Main {
    public static void main(String[] args) {

        UserService uservice = new UserService();
        MessageService mservice = new MessageService();

        uservice.create4Users();

        User[] users = uservice.getUsersArray();

        mservice.create4Message(users[0], users[1], users[2], users[3]);
        Message[] messages = mservice.getMessages();

        uservice.printUsers();
        System.out.println();
        mservice.printMessages();



    }
}
