package CarRentalCompany;

public class Customer {
    private String name;
    private Role rol;

    public Customer() {
    }

    public Customer(String name, Role rol) {
        this.name = name;
        this.rol = rol;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Role getRol() {

        return rol;
    }

    public void setRol(Role rol) {

        this.rol = rol;
    }
}
