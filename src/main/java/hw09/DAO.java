package hw09;

import java.util.List;

interface DAO<T> {
    List<T> getAllFamilies();
    T getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);


}
