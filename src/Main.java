public class Main {
    public static void main(String[] args) {
        /// task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        ///task2
        String firstName1 = "Ivan";
        String middleNam1 = "Ivanovich";
        String lastName1 = "Ivanov";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleNam1;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1.toUpperCase());

        ///task3
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        firstName2 = firstName2.replace("ё", "е");
        middleName2 = middleName2.replace("ё", "е");
        String fullName2 = lastName2 + " " + firstName2 + " " + middleName2;
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}