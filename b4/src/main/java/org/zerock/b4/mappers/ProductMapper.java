package org.zerock.b4.mappers;

import java.util.List;
import java.util.Map;

import org.zerock.b4.dto.PageRequestDTO;
import org.zerock.b4.dto.ProductListDTO;

public interface ProductMapper {
    
    List<ProductListDTO> getList(PageRequestDTO pageRequestDTO);

    int insertProduct(ProductListDTO productListDTO);

    int insertImages(List<Map<String,String>> imageMap);
}
