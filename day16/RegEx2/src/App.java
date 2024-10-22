public class App {
    public static void main(String[] args) throws Exception {

        // Find username and domain name from email
        // Find if the email id is on gmail

        String str = "programmer@hotmail.com";
        // username: programmer
        // domain: gmail.com
        // true

        int i = str.indexOf("@");
        System.out.println(i);
        String userName = str.substring(0, i);
        String domain = str.substring(i + 1);

        System.out.println(userName);
        System.out.println(domain);

        System.out.println(domain.startsWith("gmail"));

    }
}
