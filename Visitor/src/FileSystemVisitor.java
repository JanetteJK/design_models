public interface FileSystemVisitor {
    public void visit(File file);
    void visit(Directory directory);
}
