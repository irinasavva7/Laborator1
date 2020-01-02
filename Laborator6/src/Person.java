import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.*;

public class Person {
    String title;
    FullName name;
    Date birthDate;
    Address homeAdress;
    int phone;

    public Person(){

    }

    public Person(String title, String given, String middle, String family, Date birthDate, Address homeAddress, int phone) {
        this.title = title;
        name= new FullName(given, middle, family);
        this.birthDate = birthDate;
        this.homeAdress = homeAddress;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", name=" + name.toString() +
                ", birthDate=" + birthDate +
                ", homeAdress=" + homeAdress +
                ", phone=" + phone +
                '}';
    }
}