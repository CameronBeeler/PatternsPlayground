package OCP;

import java.util.List;

public class OCPDemo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> plist = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Filtered products (old)");
        pf
            .filterBySizeColor(plist, Color.GREEN, Size.LARGE)
            .forEach(p-> System.out.println(" - " + p.name + " is green and large"));
        pf.filterBySize(plist, Size.LARGE)
                .forEach(p-> System.out.println(" - " + p.name + " is Large"));
        pf.filterByColor(plist, Color.GREEN)
                .forEach(p-> System.out.println(" - " + p.name + " is Green"));

        System.out.println("Filtered products (new)");
        OCPFilter ocpFilter = new OCPFilter();
        ocpFilter.filter(plist, new ColorSpecification(Color.GREEN))
        .forEach(p-> System.out.println(" - " + p.name + " is Green"));

        ocpFilter.filter(plist, new SizeSpecification(Size.LARGE))
                .forEach(p-> System.out.println(" - " + p.name + " is Large"));
        ocpFilter.filter(plist, new JoinSpecifications<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
                 .forEach(p-> System.out.println(" - " + p.name + " is Large and Blue"));

    }
}
