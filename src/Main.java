public class Main {


    public static void main(String[] args) {
        goCreateUser();
        System.out.println();
        goCreateUsers();

    }

    private static void goCreateUsers() {
        System.out.println("Сотрудникам за 40:");
        Сollaborator[] persArray = new Сollaborator[5];
        persArray[0] = new Сollaborator("Ivanov Ivan", "Водитель", "ivivan@mailbox.com", 892312312, 30000, 34);
        persArray[1] = new Сollaborator("Петров Петрович", "Бухгалтер", "petr@mailbox.com", 110, 30000, 54);
        persArray[2] = new Сollaborator("Василий Иванович", "Директор", "vasiliy@mailbox.com", 122, 30000, 62);
        persArray[3] = new Сollaborator("Кирилл Дзю", "Программист", "kiril@mailbox.com", 333, 30000, 22);
        persArray[4] = new Сollaborator("Николай Петрович", "Программист", "nikola@mailbox.com", 12, 30000, 18);

        for (int i = 0; i <persArray.length ; i++) {
            if (persArray[i].getAge()>40){
                persArray[i].info();
            }
        }
    }

    private static void goCreateUser() {
        Сollaborator popov = new Сollaborator("Попов Пупкин","Программист","popov@mail.ru",
                112,20000,30);
        popov.info();
    }
}
