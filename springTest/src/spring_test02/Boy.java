package spring_test02;

public class Boy {

    @Override
    public String toString() {
        return "Boy{" +
                "hobbies='" + hobbies + '\'' +
                '}';
    }

    private  String hobbies;



    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }


}
