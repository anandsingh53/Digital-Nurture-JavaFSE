public class DecoratorPatternTest {

    public static void main(String[] args) {

        // Email only
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Welcome to our service!");

        System.out.println();

        // Email + SMS
        Notifier emailSMSNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        emailSMSNotifier.send("Your OTP is 123456");

        System.out.println();

        // Email + SMS + Slack
        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allNotifier.send("Server is down!");
    }
}