package com.teamwiski.wildskills.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teamwiski.wildskills.Entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    List<CategoryEntity> findByCategoryId (int categoryId);

    @Query(value = "SELECT COUNT(*) FROM tblcategory", nativeQuery = true)
    int searchTotalCategories();
}
