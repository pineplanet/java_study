package EDU.E8;

public class E8_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        //path -> split fullPath & fullPath 0,1,2
        //file name ->split fullPath & fullPath -1
        String[] splitPath = fullPath.split("\\\\");
        //path = path+splitPath[0]+"\\"+splitPath[1]+"\\"+splitPath[2];

        for (int i = 0; i < splitPath.length-1; i++) {
            path += splitPath[i];
            if( i <splitPath.length-2)
                path +="\\";
        }


        fileName +=splitPath[splitPath.length -1];
        System.out.println(fullPath);
        System.out.println(path);
        System.out.println(fileName);
    }
}
