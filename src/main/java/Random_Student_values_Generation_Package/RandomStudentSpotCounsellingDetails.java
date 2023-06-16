package Random_Student_values_Generation_Package;
import com.github.javafaker.Faker;
public class RandomStudentSpotCounsellingDetails {
    Faker faker = new Faker();

 private String assign_Grade;
    public  String StudentFullName()
    {
        String firstName = faker.name().firstName().replaceAll("\\p{Punct}", "");
        String lastName = faker.name().lastName().replaceAll("\\p{Punct}", "");
        String fullName =firstName + " " + lastName;
        return fullName;
    }

    public   String StudentMobileNumber()
    {
        String mobileNumber = "+91" + faker.numerify("##########");
        return mobileNumber;
    }

    public  String StudentEmail()
    {
        String email = faker.internet().emailAddress();
        return email;
    }
    public int IeltsScore()
    {
        int Ielts_Score = (int) (Math.random() * 4) + 6;
        return Ielts_Score;
    }
    public String PreferedCountry()
    {
        String[] genders = {"USA","UK","AUSTRALIA","CANADA"};
        String Student_Country = genders[(int) Math.floor(Math.random() * genders.length)];
        return Student_Country;

    }
    public String studentScore()
    {

        if(assign_Grade.equals("PERCENTAGE"))
        {
            String[] percentage={"70","71","63","67","87"};
            return percentage[(int) Math.floor(Math.random()* percentage.length)];
        }
        String[] CGPA={"6.3","7.1","8.3","5.7","7.5"};
        return CGPA[(int) Math.floor((Math.random()*CGPA.length))];
    }
    public void studentGrade()
    {

        String[] grade_types = {"CGPA", "PERCENTAGE"};
         assign_Grade = grade_types[(int) Math.floor(Math.random() * grade_types.length)];


    }
}




