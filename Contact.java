package com.addressbook;

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
        return "Contact [fstname = " + fstname
                        + ",\n lstname = " + lstname
                        + ",\n address = " + address
                        + ",\n city = " + city
                        + ",\n state = " + state
                        + ",\n zip = " + zip
                        + ",\n ph_num = " + ph_num
                        + ",\n eml = " + eml + "]";
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
