package Prototype;

public
class Address
implements Cloneable
{
        private String streetName;
        private String houseNumber;
//        private String city;
//        private String State;
//        private String country;
//        private String postalCode;

    public
    Address(String streetName, String houseNumber)//, String city, String state, String country, String postalCode)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
//        this.city = city;
//        State = state;
//        this.country = country;
//        this.postalCode = postalCode;
    }

    public
    String getStreetName()
    {
        return streetName;
    }

    public
    void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

//    public
//    String getHouseNumber()
//    {
//        return houseNumber;
//    }
//
//    public
//    void setHouseNumber(String houseNumber)
//    {
//        this.houseNumber = houseNumber;
//    }
//
//    public
//    String getCity()
//    {
//        return city;
//    }
//
//    public
//    void setCity(String city)
//    {
//        this.city = city;
//    }
//
//    public
//    String getState()
//    {
//        return State;
//    }
//
//    public
//    void setState(String state)
//    {
//        State = state;
//    }
//
//    public
//    String getCountry()
//    {
//        return country;
//    }
//
//    public
//    void setCountry(String country)
//    {
//        this.country = country;
//    }
//
//    public
//    String getPostalCode()
//    {
//        return postalCode;
//    }
//
//    public
//    void setPostalCode(String postalCode)
//    {
//        this.postalCode = postalCode;
//    }


    @Override
    protected
    Address clone() throws
            CloneNotSupportedException
    {
        return new Address(streetName, houseNumber);
    }

    @Override
    public
    String toString()
    {
        return "Address{" +
               "streetName='" + streetName + '\'' +
               ", houseNumber='" + houseNumber + '\'' +
//               ", city='" + city + '\'' +
//               ", State='" + State + '\'' +
//               ", country='" + country + '\'' +
//               ", postalCode='" + postalCode + '\'' +
               '}';
    }
}
