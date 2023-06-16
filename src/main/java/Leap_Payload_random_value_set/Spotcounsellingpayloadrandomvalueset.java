package Leap_Payload_random_value_set;
import org.json.JSONException;
import org.json.JSONObject;
import Random_Student_values_Generation_Package.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Spotcounsellingpayloadrandomvalueset {
    public static void main(String[] args)
    {
        String filePath = "src/main/java/Payload_For_Leap_Api/Spot_counselling_Form_Leap_Api.json";
        try {
            RandomStudentSpotCounsellingDetails details=new RandomStudentSpotCounsellingDetails();
            // Read the JSON file content as a string
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));

            // Parse the JSON string to a JSONObject
            JSONObject jsonObject = new JSONObject(jsonContent);
            jsonObject.put("name", details.StudentFullName());
            jsonObject.put("email",details.StudentEmail());
            jsonObject.put("phone",details.StudentMobileNumber());
            jsonObject.put("ieltsScore",details.IeltsScore());
            jsonObject.put("preferredCountry",details.PreferedCountry());
            jsonObject.put("gradeMetric",details.assign_Grade);

            jsonObject.put("grades",details.studentScore());

            // Save the modified JSON back to the file
            Files.write(Paths.get(filePath), jsonObject.toString().getBytes());

            System.out.println("JSON file modified successfully.");
        }
        catch (IOException | JSONException e)
        {
            e.printStackTrace();
        }
    }}
