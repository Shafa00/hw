package hw09;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements DAO<Family> {

    private List<Family> families=new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index<families.size()){
        return families.get(index);}
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index<families.size()){
        families.remove(index);
        return true;}
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (families.contains(family)){
            families.remove(family);
            return true;
        }
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        if (families.contains(family)){
            Family current = families.get(families.indexOf(family));
            current = family;
        }
        else{
            families.add(family);
        }
    }
}
