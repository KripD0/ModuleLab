package rus;

public class positions {
    private String name_position;
    private workers worker;

    public String getName_position() {
        return name_position;
    }

    public void setName_position(String name_position) {
        this.name_position = name_position;
    }

    public positions(String name_position, workers worker) {
        this.name_position = name_position;
        this.worker = worker;
    }
    public positions(){
    }

    @Override
    public String toString() {
        return worker + " Должность:" + name_position;
    }
}
