package blox.json_to_object;

import com.fasterxml.jackson.databind.ObjectMapper;


/*Q. Write a function to parse any valid json string into a corresponding Object, List, or Map
object. You can use C,C++, Java, Scala, Kotlin, Python, Node. Note that the integer and
floating point should be arbitrary precision.*/

public class JsonParserAssessment1 {
	public static Object parseJson(String jsonString) {
        try {
            
            ObjectMapper objectMapper = new ObjectMapper();

            
            Object result = objectMapper.readValue(jsonString, Object.class);

            
            if (result instanceof String) {
                return result; 
            } else {
                return result; 
            }
        } catch (Exception e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
            return null; 
        }
    }

    public static void main(String[] args) {       
        String jsonObject = "{\"name\":\"Yash\", \"age\":24}";
        String jsonArray = "[\"Java\", \"Spring\"]";
        String jsonString = "\"Simple JSON String\"";
        
        System.out.println("Parsed Object: " + parseJson(jsonObject));
        System.out.println("Parsed List: " + parseJson(jsonArray));
        System.out.println("Parsed String: " + parseJson(jsonString));
    }

}
