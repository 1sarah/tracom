package quiz01;

import java.io.File;
import java.nio.file.Path;

public class PathExists {
    File pathname;
    public PathExists (File pathname) {
        this.pathname = pathname;
    }

    boolean pathExists () {
        return pathname.exists();
    }

    public static void main(String[] args) {
        String filepath = "C:\\\\Users\\\\jmulongo\\\\Desktop\\\\";
        File pathname = new File(filepath+"quiz");

        PathExists p = new PathExists(pathname);

        System.out.println(p.pathExists());

    }

}

