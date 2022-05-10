import java.io.File;

/*
* Task: Locate for file in both the ASSIGNED directory and sub directories and return the location of said file.
*/
class Locator {

    /*
    * Assume that param fileLocation always has the name of directory
    */
    public static String getFile(String fileLocation, String file) {
        String folderIn = fileLocation;
        File[] folder = new File(folderIn).listFiles();
        int index = 0;
        
        while(index < folder.length) {
            if(folder[index].isFile()) {
                if(file.equals(folder[index].getName())) {
                    return folderIn + "/" + file;
                }
            }else {
                folderIn = getFile(fileLocation + "/" + folder[index].getName(), file);

                if(folderIn == null) {
                    folderIn = fileLocation;
                }else {
                    return folderIn;
                }
            }

            index++;
        }

        return null;
    }
}