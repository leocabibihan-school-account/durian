
import com.csb.appadvc2122.model.Address;

import javax.persistence.Column;

public class CustomerDTO {

    private Long id;

    private Long user;

    private String firstName;

    private String lastName;

    private int telephone;

    public CustomerDTO() {}

    public CustomerDTO(Customer customer) {
        this.id = customer.getId();
        this.user = customer.getUser().getId();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.telephone = address.getTelephone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return user;
    }

    public void setUserId(Long user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}