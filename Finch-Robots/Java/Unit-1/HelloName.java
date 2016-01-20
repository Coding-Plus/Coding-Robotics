/*
Unit 1-Lesson 2
You just did the HelloWorld.java program and saw how it can print something.
In this lesson, you will see and implement the use of arguments so the computer "communicates" with the human.
Let's go!
*/

public class HelloName
{
    public static void main(String[] args)
    {
        System.out.print("Hello, ");
        System.out.print(args[0]); //prompts for your name
        System.out.println(". How are you?");
    }
}
