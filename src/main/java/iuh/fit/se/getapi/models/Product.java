package iuh.fit.se.getapi.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private String name;
    private double price;
}
