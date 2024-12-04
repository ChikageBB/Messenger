package messenger;

public class MessageService {
    private Message[] messageArray = new Message[4];

    public void create4Message(User user1, User user2, User user3, User user4) {
        messageArray[0] = new Message(user1, user2, "privet", "12:22");
        messageArray[1] = new Message(user2, user3, "bonjor", "12:23");
        messageArray[2] = new Message(user3, user4, "Good morning", "13:43");
        messageArray[3] = new Message(user4, user1, "Hello", "07:08");

    }

    public Message[] getMessages() {
        return messageArray;
    }

    public void printMessages() {
        for (Message message: messageArray) {
            System.out.println(message);
        }
    }

}
