package addressbookwebtests.model;

public class ContactData {
    private final String firsname;
    private final String lastname;
    private String group;


    public ContactData(String firsname, String lastname, String group) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.group = group;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }
}
