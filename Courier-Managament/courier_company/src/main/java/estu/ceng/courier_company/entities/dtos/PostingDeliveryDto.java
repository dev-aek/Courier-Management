package estu.ceng.courier_company.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostingDeliveryDto {

    private String delDesc;
    private Date delDate;
    private String delAdress;
    private int customerId;
    private int companyId;
    private int paymentId;
    private int courierId;

}
