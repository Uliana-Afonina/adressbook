package addressbookwebtests.model;

public class ContactData {
    private final String firsname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String notes;
    private String group;

    public ContactData(String firsname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String notes, String group) {
        this.firsname = firsname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.notes = notes;
        this.group = group;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getNotes() {
        return notes;
    }

    public String getGroup() {
        return group;
    }
}
