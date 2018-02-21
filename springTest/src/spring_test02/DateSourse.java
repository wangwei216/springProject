package spring_test02;

import java.util.Properties;

public class DateSourse {

    private Properties properties;


    @Override
    public String toString() {
        return "DateSourse{" +
                "properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    public DateSourse(Properties properties) {
        this.properties = properties;
    }
}
