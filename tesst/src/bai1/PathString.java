package bai1;

/**
 * Created by bui on 07-Jun-17.
 */
public class PathString {
    static  String coverPathString(String path){
        String result = "";
        String stringdot = ".";

          result = path.replace(stringdot,"");
          while (result.contains("//")){
              result = result.replace("//","/");
          }
          while (result.contains("/x/")){
              result = result.replace("/x/","/");
          }
        return  result ;
    }

    public static void main(String[] args) {
        String path = "/hom//x/..x./sdfd....////d./sdf/";
        System.out.printf("ket qua "+ coverPathString(path));
    }
}
