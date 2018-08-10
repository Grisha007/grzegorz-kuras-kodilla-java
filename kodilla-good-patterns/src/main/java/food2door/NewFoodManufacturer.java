package food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewFoodManufacturer {
    private String companyName;
    private String addressStreet;
    private String addressCity;
    private List<String> newManufacturerProductsList = new ArrayList<>();

    public NewFoodManufacturer(String companyName, String addressStreet, String addressCity) {
        this.companyName = companyName;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
    }

    public void addProductToTheList(NewFoodManufacturer newFoodManufacturer, String productName) {
        newManufacturerProductsList.add(productName);
    }

    public void printNewManufacturerProductsList() {
        String productsStream = newManufacturerProductsList.stream()
                .collect(Collectors.joining("\n"));
        System.out.println(companyName + ": " + "\n" + productsStream);
        System.out.println();
    }

    public List<String> getNewManufacturerProductsList() {
        return newManufacturerProductsList;
    }

    public String getCompanyName() {
        return companyName;
    }
}
