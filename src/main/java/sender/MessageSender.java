package sender;

public class MessageSender {
    public void send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            System.out.println("User got message:"+text);
        }
    }
}
