/***********************************************************************************************************************
 * Change the definition of the class Person in Display 5.19 to be serializable.
 * Note that this requires that you also change the class Date.
 * Then write a program to maintain a binary file of records of people
 * (records of type Person ).
 * Allow commands to delete a record specified by the person’s name,
 * to add a record, to retrieve and display a record, and to obtain all
 * records of people within a specified age range.
 * To obtain the age of a person, you need the current date.
 * Your program will ask the user for the current date when the program begins.
 * You can do this with random access files, but do not use random access files
 * for this exercise. Use a file or files that record records with the
 * method writeObject of the class ObjectOutputStream.
***********************************************************************************************************************/
import java.io.*;
import java.util.*;

public class proj6_test {
    public static void main(String args[]) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        int command = 0;

        System.out.println("Enter current date: ");
        Date currentDate = new Date();
        currentDate.readInput();

        while(command != -1){
            System.out.println("1.) Add Record to file");
            System.out.println("2.) Display a specified Record");
            System.out.println("3.) Obtain Records within a range of ages");
            System.out.println("9.) Delete a specified Record");
            System.out.println("-1.) Exit");
            System.out.println("Enter Choice: ");

            command = keyboard.nextInt();
            keyboard.nextLine();

            ObjectInputStream oIS = null;
            ObjectOutputStream oOS = null;

            switch (command){
                case 1: /** Adding a Person to records **/
                    try{
                        oOS = new ObjectOutputStream(new FileOutputStream("peopleTemp.dat"));
                        oIS = new ObjectInputStream(new FileInputStream("people.dat"));
                        while(true){
                            Person current = (Person) oIS.readObject();
                            oOS.writeObject(current);
                        }
                    }
                    catch (IOException e){}
                    try{
                        oOS = new ObjectOutputStream(new FileOutputStream("people.dat"));
                        oIS = new ObjectInputStream(new FileInputStream("peopleTemp.dat"));
                        while(true){
                            Person current = (Person) oIS.readObject();
                            oOS.writeObject(current);
                        }
                    }
                    catch(IOException e){}

                    System.out.println("Enter name of person: ");
                    String name = keyboard.nextLine();

                    System.out.println("Enter birth date: ");
                    Date birthDate = new Date();
                    birthDate.readInput();

                    System.out.println("Is the person still alive? (y/n)");
                    Date deathDate = new Date();
                    String alive = keyboard.nextLine();
                    if(alive.equalsIgnoreCase("y"))
                        deathDate = null;
                    else{
                        System.out.println("Enter death date: ");
                        deathDate.readInput();
                    }
                    oOS.writeObject(new Person(name, birthDate, deathDate));
                    System.out.println();
                    break;

                case 2:  /** Displaying a specified record **/
                    try{
                        System.out.println("Enter name of person to read their record: ");
                        String personToDisplay = keyboard.nextLine();
                        oIS = new ObjectInputStream(new FileInputStream("people.dat"));
                        while(true){
                            Person current = (Person) oIS.readObject();
                            if(current.getName().equalsIgnoreCase(personToDisplay))
                                System.out.println(current.toString());
                        }
                    }
                    catch (ClassNotFoundException e){
                        System.out.println("Error: person not found.");
                    }
                    catch(IOException e){}

                    System.out.println();
                    break;

                case 3: /** Obtain Records within a range of ages **/
                    System.out.println("Enter first number of the age range: ");
                    int age1 = keyboard.nextInt();
                    System.out.println("Enter second number: ");
                    int age2 = keyboard.nextInt();
                    try{
                        oIS = new ObjectInputStream(new FileInputStream("people.dat"));
                        while(true){
                            Person current = (Person) oIS.readObject();
                            Date birth = current.getBirthDate();
                            Date death = current.getDeathDate();
                            int age;

                            if(death != null){
                                age = death.getYear() - birth.getYear();
                                if(death.precedes(birth))
                                    age--;
                            }else{
                                age = currentDate.getYear() - birth.getYear();
                                if(currentDate.precedes(birth))
                                    age--;
                            }

                            if(age >= age1 || age <= age2)
                                System.out.println(current.toString());
                        }
                    }
                    catch (ClassNotFoundException e){
                        System.out.println("Error: person not found.");
                    }
                    catch (IOException e){}

                    System.out.println();
                    break;

                case 9: /** Deleting a specified person from the records **/
                    try{
                        System.out.println("Enter the name of the person to be removed from the records: ");
                        String nameToRemove = keyboard.nextLine();

                        oOS = new ObjectOutputStream(new FileOutputStream("peopleTemp.dat"));
                        oIS = new ObjectInputStream(new FileInputStream("people.dat"));

                        while(true){
                            Person current = (Person) oIS.readObject();
                            if(!current.getName().equalsIgnoreCase(nameToRemove))
                                oOS.writeObject(current);
                        }
                    }
                    catch (ClassNotFoundException e){
                        System.out.println("Error: person not found.");
                    }
                    catch (IOException e){}
                    try{
                        oOS = new ObjectOutputStream(new FileOutputStream("people.dat"));
                        oIS = new ObjectInputStream(new FileInputStream("peopleTemp.dat"));

                        while (true){
                            oOS.writeObject(oIS.readObject());
                        }
                    }
                    catch (ClassNotFoundException e){
                        System.out.println("Error: person not found.");
                    }
                    catch (IOException e){
                        System.out.println("Successfully removed person from the records");
                    }
                    System.out.println();
                    break;

                case -1:
                    break;

                default:
                    System.out.println("Invalid choice.");
                    System.out.println();
                    break;
            }

            if(oIS != null){
                try{
                    oIS.close();
                }
                catch (IOException e){}
            }
            if( oOS != null){
                try{
                    oOS.close();
                }
                catch (IOException e){}
            }
        }
    }
}
