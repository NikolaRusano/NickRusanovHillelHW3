package HW10;
/*Создать статический метод который принимает на вход три параметра:
 login, password и confirPassword.
2.Login :
Должен содержать знак подчеркивания.
Длина login должна быть меньше 20 символов.
Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
3.Password:
Должен содержать знак подчеркивания и !.
Длина password должна быть меньше 20 символов.
Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям
 необходимо выбросить WrongPasswordException. WrongPasswordException и WrongLoginException - пользовательские
 классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает
 его в конструктор класса Exception.
Обработка исключений проводится внутри нашего мейн метода.
Используем multi-catch block.
Метод возвращает true, если значения верны или false в другом случае.

 */

import java.util.Scanner;

public class Exceptions {


    public static void main(String[] args) throws WrongLoginException, WrongPasswordException{
        boolean isLoginContainUnderscore=false, isLoginContainMoreThan20Char=false, isPasswordContainExclamationPoint=false,
                isPasswordContainMoreThan20Char=false,isPasswordSameToConfPassw=false;


        System.out.println("Input Login:");
        Scanner scanner = new Scanner(System.in);
        String s = "The Login doesn't contain _ sign";
        try {
            String login = scanner.nextLine();
            System.out.println("Input Password:");
            String password = scanner.nextLine();
            System.out.println("Input confirmation Password:");
            String confirmPassword = scanner.nextLine();
            isLoginContainUnderscore(login);
            isLoginContainMoreThan20Char(login);

            isPasswordContainExclamationPoint(password);
            isPasswordContainMoreThan20Char(password);
            isPasswordSameToConfPassw(password,confirmPassword);

        }catch (WrongLoginException loginException) {
            System.out.println(loginException.getMessage());

        }catch (WrongPasswordException passwordException) {
            System.out.println(passwordException.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       /* System.out.println("The Login contain _ character: " + isLoginContainUnderscore+
                "\nand contain 20 or more 20 characters: " + isLoginContainMoreThan20Char+
                "\nPassword contain ! characters:" + isPasswordContainExclamationPoint +
                "\nand contain 20 or more than 20 characters " + isPasswordContainMoreThan20Char+
                "\nand password identical to confirmPassword: " + isPasswordSameToConfPassw);*/
    }



    public static boolean isLoginContainUnderscore(String login) throws WrongLoginException{
    if(login.contains("_") == false) {
            throw new WrongLoginException("Incorrect input - login doesn't contain _ sign");
    }else
    return login.contains("_");
    }
    public static boolean isLoginContainMoreThan20Char(String login) throws WrongLoginException {
        if((login.length() >= 20) == true) {
            throw new WrongLoginException("The Login doesn't contain 20 or more than 20 characters");
        }else
        return login.length() >= 20;
    }
    public static boolean isPasswordContainExclamationPoint(String password) throws WrongPasswordException{
        if(password.contains("!") == false) {
            throw new WrongPasswordException("The Password doesn't contain ! sign");
        }else
        return password.contains("!");
    }
    public static boolean isPasswordContainMoreThan20Char(String password) throws WrongPasswordException{
        if((password.length() >= 20) == true) {
            throw new WrongPasswordException("The Login doesn't contain 20 or more than 20 characters");
        }else
        return password.length()>=20;
    }
    public static boolean isPasswordSameToConfPassw(String password, String confirmPassword) throws WrongPasswordException{
        if((password == confirmPassword) == false) {
            throw new WrongPasswordException("The Login doesn't contain 20 or more than 20 characters");
        }else
        return (password == confirmPassword);
    }


}
