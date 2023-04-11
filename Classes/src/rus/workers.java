package rus;

public class workers {
    private int ID;
    private static int count;
    private String Surname;
    private String name;
    private String second_name;
    private String date;
    private String adres;
    private String number;

    @Override
    public String toString() {
        return "Работник: " +
                "ID:" + ID +
                " Фамилия:" + Surname +
                " Имя:" + name +
                " Отчество:" + second_name +
                " Дата рождения:" + date +
                " Адрес прописки:" + adres +
                " Номер телефона:" + number;
    }

    public workers(String surname, String name, String second_name, String date, String adres, String number) {
        this.count ++;
        this.Surname = surname;
        this.name = name;
        this.second_name = second_name;
        this.date = date;
        this.adres = adres;
        this.number = number;
        this.ID = count;
    }

    public workers() {}

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        workers.count = count;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
