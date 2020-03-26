package hw12.dao;

import java.util.List;

interface DAO<T> {
    List<T> getAllFamilies();
    T getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(T family);
    void saveFamily(T family);


}
