package messenger;

public class UserService {
    private User[] usersArray = new User[4];

    public void create4Users(){

        usersArray[0] = new User("Roman", "ChikageBB", "qwerttyy", "89271311324" );
        usersArray[1] = new User("Ildar", "wolf464", "1031415151", "89321414511");
        usersArray[2] = new User("Ilnaz", "Swaaag356", "iadjaigizlox", "89271488131");
        usersArray[3] = new User("Arxыz", "Dyrache", "adniaodadada", "89321341431");
    }

    public User[] getUsersArray() {
        return usersArray;
    }

    public void printUsers() {
        for (User user: usersArray){
            System.out.println(user);
        }
    }
}
