import java.util.Scanner;
import java.util.Stack;

public class validParenthesis
{

    public static boolean isvalid(String str)
    {
        char[] ch = str.toCharArray();

        Stack<Character> stack1 = new Stack<>();

        for(char elem :ch)
        {
            if(elem == '[' || elem == '{' || elem == '(')
            {
               stack1.push(elem);

            }
            else
            {


            // no open brackets not valid
            if(stack1.empty())
            {
                return false;
            }

            char top  = stack1.pop();

            // there is no proper mapping
            if(top == '[' &&  elem!= ']')
            {
                return false;
            }else if(top == '{' && elem!= '}')
            {
                return false;
            }else if(top == '(' && elem != ')')
            {
                return false;
            }
        }

        }
        return (stack1.empty() == true);
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println("Is the String contains valid parenthesis?" + isvalid(str));


    }
}


