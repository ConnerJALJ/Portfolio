/***********************************************************************************************************************
 * Class for a person with a name and dates for birth and death.
 * Class invariant: A Person always has a date of birth, and if the Person
 * has a date of death, then the date of death is equal to or later than the
 * date of birth.
***********************************************************************************************************************/

public class Person implements java.io.Serializable {
    private String name;
    private Date born;
    private Date died;


    public Person(String initialName, Date birthDate, Date deathDate){
        if(consistent(birthDate, deathDate)){
            name = initialName;
            born = new Date(birthDate);
            if(deathDate== null)
                died = null;
            else
                died = new Date(deathDate);
        }else{
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public Person(Person original){
        if(original == null){
            System.out.println("Fatal Error.");
            System.exit(0);
        }

        name = original.name;
        born = new Date(original.born);
        if(original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

    @Override
    public String toString() {
        String diedString;
        if(died == null)
            diedString = "";
        else
            diedString = died.toString();

        return(name + "; " + born + " - " + diedString);
    }

    public boolean equals(Person otherPerson){
        if(otherPerson == null)
            return false;
        else
            return ( name.equals(otherPerson.name)      &&
                     born.equals(otherPerson.born)      &&
                     datesMatch(died, otherPerson.died) );
    }

    private static boolean datesMatch(Date date1, Date date2){
        if(date1 == null)
            return (date2 == null);
        else if(date2 == null)
            return false;
        else
            return(date1.equals(date2));
    }

    public void setBirthDate(Date newDate){
        if(consistent(newDate, died))
            born = new Date (newDate);
        else{
            System.out.println("Inconsistent Dates. Aborting.");
            System.exit(0);
        }
    }
    public Date getBirthDate(){
        return new Date(born);
    }

    public void setBirthYear(int newYear){
        if(born == null){
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }

        born.setYear(newYear);
        if(!consistent(born, died)){
            System.out.println("Inconsistent Dates. Aborting.");
            System.exit(0);
        }
    }

    public void setDeathDate(Date newDate){
        if(!consistent(born, newDate)){
            System.out.println("Inconsistent Dates. Aborting.");
            System.exit(0);
        }

        if(newDate == null)
            died = null;
        else
            died = new Date(newDate);
    }
    public Date getDeathDate(){
        if (died == null)
            return null;
        else
            return new Date(died);
    }

    public void setDeathYear(int newYear){
        if(died == null){
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        died.setYear(newYear);
        if(!consistent(born, died)) {
            System.out.println("Inconsistent Dates. Aborting.");
            System.exit(0);
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    private static boolean consistent(Date birthDate, Date deathDate){
        if(birthDate == null)
            return false;
        else if(deathDate == null)
            return true;
        else
            return (birthDate.precedes(deathDate) ||
                    birthDate.equals(deathDate)   );
    }
}