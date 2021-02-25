package design.patterns.structural.adapter;

public class FileManagerImpl extends FileManagerUtils implements FileManager {
    @Override
    public String close() {
        return new Boolean(closeFile()).toString();
    }
    @Override
    public  String open(String s) {
        return new Boolean(openFile(s)).toString();
    }
    @Override
    public String write(int pos, int amount, byte[] data){
        return new Boolean(writeToFile(new String(data),pos,amount)).toString();
    }

    @Override
    public String read(int pos, int amount, byte[] data){
        return readFromFile(pos,amount);
    }
}
