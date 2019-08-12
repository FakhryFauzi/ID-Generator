import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateID{
    
    //Fuunction to  generate the ID
    public String generateId(String name){
        String id  = "";
        
        //id will  be generated based on current date - this will give it some uniqueness while at the same have some logic behind it
        String timegenerated = new SimpleDateFormat("YYMMdd").format(new Date());

        //change all of the characters in name to lowercase
        name = name.toLowerCase();

        //Checks the name if there are multiple characters and take the first letter from each character into the id
        if(name.contains(" ")){
            String[] firstChar = name.split(" ");
            for(int i = 0; i<firstChar.length; i++){
                String s = firstChar[i];
                id = id + s.charAt(0);
            }
        }else{
            //if there is only one character it will use tthe first 2 letters as the id
            for(int i = 0; i<3; i++){
                id = id + name.charAt(i);
            }
        }

        id = timegenerated+id;
        System.out.println(id); //Double check what the id is

        return id;
    }

    //create a main class to run the program
    public static void main(String[] args){
        GenerateID g = new GenerateID();
        //input a  name/string into the function
        g.generateId("Fakhry Fauzi Saad");
    }

}
