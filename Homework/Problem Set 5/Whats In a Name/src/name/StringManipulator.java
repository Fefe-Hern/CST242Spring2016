package name;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
class StringManipulator {
    private String firstName;
    private String lastName;

    public StringManipulator(String name) {
        try {
            if (name.contains(",")) {
                lastName = name.substring(0, name.indexOf(","));
                firstName = name.substring(name.indexOf(",") + 1).trim();
            } else if (name.contains(" ")) {
                firstName = name.substring(0, name.indexOf(" "));
                lastName = name.substring(name.indexOf(" ") + 1).trim();
            } else {
                firstName = name;
                lastName = "";
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error, first and last name not properly seperated.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
}
