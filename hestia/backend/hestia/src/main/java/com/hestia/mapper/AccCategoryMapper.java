package com.hestia.mapper;

import com.hestia.dto.AccCategoryDTO;
import com.hestia.model.AccCategory;

public class AccCategoryMapper {
    
    public static AccCategoryDTO mapToAccCategoryDTO (AccCategory accCategory) {
        
        return new AccCategoryDTO(
            
            accCategory.getId(),
            accCategory.getName(),
            accCategory.getDescription(),
            accCategory.getQuantity(),
            accCategory.isActive(),
            accCategory.isAcceptingChildren(), 
            accCategory.getMaxNumberOfChildren()

        );
    }
}
