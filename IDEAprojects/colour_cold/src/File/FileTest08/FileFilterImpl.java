package File.FileTest08;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory() || pathname.getName().endsWith(".txt")) {//如果是文件夹或者是.txt结尾的文件则返回true
            return true;
        }
        return false;
    }
}
