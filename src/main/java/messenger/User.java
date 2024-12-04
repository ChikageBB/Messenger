package messenger;

public class User {
    private String nickname;
    private String name;
    private String number;
    private String password;

    public User() {

    }

    public User(String name, String nickname, String password, String number) {
        this.password = password;
        this.number = number;
        this.nickname = nickname;
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String toString() {
        return "Имя пользователя: " + name + " под ником " + nickname + " Номер: " + number;
    }

}
