public class Employees {

    String name;
    int age;

        public static void main(String[] args) {
            Employees employee = new Employees();
            employee.name = "Serhii Bogdanovich Bondaruk";
            employee.age = 45;

            System.out.println("|----------------------------|\n" + "|      Trade Department      |\n" +
                    "|Name:                       |\n" + "|" + employee.name + " |\n" + "|Age: " + employee.age + "                     |\n" +
                    "|____________________________|");

        }

}
