import java.io.File;

public class GetFileExt {
        public static void main(String[] args) {
            File file = new File("C:/JavaTest/text.txt");
            System.out.println("Расширение файла: " + getFileExtension(file));

            file = new File("C:/JavaTest/qwerty.pdf");
            System.out.println("Расширение файла: " + getFileExtension(file));

            file = new File("C:/JavaTest/abcd");
            System.out.println("Расширение файла: " + getFileExtension(file));

            file = new File("C:/JavaTest/1234.jpg");
            System.out.println("Расширение файла: " + getFileExtension(file));

            file = new File("C:/JavaTest/12.34.jpg");
            System.out.println("Расширение файла: " + getFileExtension(file));
        }
        
        private static String getFileExtension(File file) {
            String fileName = file.getName();
            if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
            else return "";
    }
}
