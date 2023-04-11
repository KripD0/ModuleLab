package rus;

public class company{
    private String name_company;
    private positions pos;
    private String adres_company;

    public String getName() {
        return name_company;
    }

    public void setName(String name_company) {
        this.name_company = name_company;
    }

    public String getAdres() {
        return adres_company;
    }

    public void setAdres(String adres_company) {
        this.adres_company = adres_company;
    }

    public String getname_position(){
        return pos.getName_position();
    }

    public company(String name_company, String adres_company, positions pos) {
        this.name_company = name_company;
        this.adres_company = adres_company;
        this.pos = pos;
    }
    public company (){
    }

    @Override
    public String toString() {
        return  pos +
                " Название компании:" + name_company +
                " Адрес компании:" + adres_company;
    }
}
