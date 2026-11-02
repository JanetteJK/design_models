public class Main {
    public static void main(String[]args) {
        Directory images = new Directory("Images");
        Directory epsteinFiles = new Directory("Epstein Files");

        File jpg1 = new File("Cat_picture.jpg", 1);
        File jpg2 = new File("Dog_picture.jpg", 1);
        File jpg3 = new File("Snake_picture.jpg", 1);

        File pdf1 = new File("Report.txt", 2);
        File pdf2 = new File("Presentation.pdf", 2);
        File pdf3 = new File("Contract.txt", 3);

        images.add(jpg1);
        images.add(jpg2);
        images.add(jpg3);
        epsteinFiles.add(pdf1);
        epsteinFiles.add(pdf2);
        epsteinFiles.add(pdf3);

        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        images.accept(sizeCalculator);
        System.out.println("Total size is " + sizeCalculator.getTotalSize() + " MB");

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        epsteinFiles.accept(searchVisitor);

        System.out.println("Files found: ");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }
    }
}
