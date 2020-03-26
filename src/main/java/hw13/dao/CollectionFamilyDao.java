package hw13.dao;

import hw13.entity.*;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements DAO<Family> {

    List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index < families.size()) {
            return families.get(index);
        }
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index < families.size()) {
            families.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (families.contains(family)) {
            families.remove(family);
            return true;
        }
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        if (families.contains(family)) {
            Family current = families.get(families.indexOf(family));
            current = family;
        } else {
            families.add(family);
        }
    }

    @Override
    public void loadData() {

        File file = new File("src/main/java/hw13/families.txt");

        try {
            new BufferedReader(new FileReader(file)).lines().collect(Collectors.toList());
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            for (Family family : families) {
                bw.write(family.familyToData());
                bw.write("\n");
            }

            bw.close();

        } catch (Exception e) {
            System.out.println("File does not found.");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                for (Family family : families) {
                    bw.write(family.familyToData());
                    bw.write("\n");
                }

                bw.close();

            } catch (Exception ex) {
                System.out.println("Something went wrong");
            }
        }
    }


}
