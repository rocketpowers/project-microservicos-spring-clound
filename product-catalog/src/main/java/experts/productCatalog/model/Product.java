package experts.productCatalog.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "product", type = "catalog")
//@Document(indexName = "product")

public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
}
