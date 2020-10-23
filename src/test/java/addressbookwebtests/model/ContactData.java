package addressbookwebtests.model;

public class ContactData {
    private final String firsname;
    private final String lastname;


    public ContactData(String firsname, String lastname) {
        this.firsname = firsname;
        this.lastname = lastname;

    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

}
