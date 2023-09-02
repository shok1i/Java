public class Author {
    private String name, inbox;
    private char gender;

    public Author(String name, String inbox, char gender){
        this.name = name;
        this.inbox = inbox;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getInbox (){
        return this.inbox;
    }

    public String setInbox (String inbox){
        Inbox = inbox;
    }

    

}
