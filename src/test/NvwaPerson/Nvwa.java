//工厂类：Nvwa（女娲）类
public class Nvwa {
    public static Person getPerson(String person) throws Exception {
        if (person.equalsIgnoreCase("M")){
            return new Man();
        }else if (person.equalsIgnoreCase("W")){
            return new Woman();
        }else if (person.equalsIgnoreCase("R")){
            return new Robot();
        }else {
            throw new Exception("对不起，不能造该类人");
        }
    }
}