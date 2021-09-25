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
        try {
            String login = scanner.nextLine();
            System.out.println("Input Password:");
            String password = scanner.nextLine();
            System.out.println("Input confirmation Password:");
            String confirPassword = scanner.nextLine();
            isLoginContainUnderscore = login.contains("_");
            isLoginContainMoreThan20Char = login.length() >= 20;
            isPasswordContainExclamationPoint = password.contains("!");
            isPasswordContainMoreThan20Char = password.length()>=20;
            isPasswordSameToConfPassw = (password == confirPassword);
            if (isLoginContainUnderscore) {
                throw new WrongLoginException("The Login doesn't contain _ sign");
            } else if (isLoginContainMoreThan20Char) {
                throw new WrongLoginException("The Login doesn't contain 20 or more than 20 characters");
            }else if(isPasswordContainExclamationPoint){
                throw new WrongPasswordException("The Password doesn't contain ! sign");
            }else if(isPasswordContainMoreThan20Char){
                throw new WrongPasswordException("The Password doesn't contain 20 or more than 20 characters");
            }else  if(isPasswordSameToConfPassw){
                throw new WrongPasswordException("The Password doesn't corresponds to confirmPassword");
            }
                System.out.println("The login contain correct input format");
        }catch (Exception e){
            e.getMessage();
        }
        System.out.println("The Login contain _ character: " + isLoginContainUnderscore+
                "\nand contain 20 or more 20 characters: " + isLoginContainMoreThan20Char+
                "\nPassword contain ! characters:" + isPasswordContainExclamationPoint +
                "\nand contain 20 or more than 20 characters " + isPasswordContainMoreThan20Char+
                "\nand password identical to confirmPassword: " + isPasswordSameToConfPassw);
    }


}
