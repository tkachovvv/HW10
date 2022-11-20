public class Main {
    public static void main(String[] args) throws Exception {
        String phone = "+995-593-763-817";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length()==9) {
            phone = "+995" + phone;
        } else if (phone.length() > 13) {
            throw new RuntimeException("Телефон слишком длинный!");
        } else if (phone.length() < 9) {
            throw new RuntimeException("Телефон слишком короткий!");
        }else if (phone.length()== 10 && phone.charAt(0) != '+'){
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "593763817";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача!");
        }
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    }
}