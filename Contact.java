class Contact {
    public String fstname;
    public String lstname;
    public String address;
    public String city;
    public String state;
    public int zip;
    public long ph_num;
    public String eml;


    @Override
    public String toString() {
        return "Contact [fstname =" + fstname + ", lstname =" + lstname + ", address =" + address + ", city =" + city
                + ", state =" + state + ", zip =" + zip + ", ph_num =" + ph_num + ", eml = " + eml + "]";
    }


    public Contact(String fstname, String lstname, String address, String city,
                   String state, int zip, long ph_num, String eml) {

        this.fstname = fstname;
        this.lstname = lstname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ph_num = ph_num;
        this.eml = eml;
    }
}
