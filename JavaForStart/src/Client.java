public class Client {

    String name;
    int age;

    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        client1.name = "Nazaruk Bohdan";
        client2.name = "Sofia Kolomiets";
        client1.age = 20;
        client2.age = 25;

        System.out.println("|----------------------------|\n" + "|           Client      Id=1 |\n" +
                "|Name:                       |\n" + "|" + client1.name + "              |\n" + "|Age: " + client1.age + "                     |\n" +
                "|____________________________|\n");

        System.out.println("|----------------------------|\n" + "|           Client      Id=2 |\n" +
                "|Name:                       |\n" + "|" + client2.name + "             |\n" + "|Age: " + client2.age + "                     |\n" +
                "|____________________________|");

    }
}
