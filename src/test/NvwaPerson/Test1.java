import java.util.Scanner;

import static java.lang.System.*;
public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner type = new Scanner(in);
        out.print("请输入参数： ");
        String s = type.nextLine();
        Person person = Nvwa.getPerson(s);
        person.create();
        type.close();
    }
}