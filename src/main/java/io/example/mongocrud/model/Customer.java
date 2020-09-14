package io.example.mongocrud.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

/**
 * @author Lakitha Prabudh on 9/14/20
 */
@Document("customer")
public class Customer {
    @Id
    private String _id;
    //    @Indexed(name = "customerName")
    private String uuid;
    private String customerName;
    private String address;

    public Customer() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id='" + _id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", description='" + address + '\'' +
                '}';
    }
}
