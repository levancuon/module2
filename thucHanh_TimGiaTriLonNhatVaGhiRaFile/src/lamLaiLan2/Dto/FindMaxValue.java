package lamLaiLan2.Dto;


import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
    int max = numbers.get(0) ;
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile("thucHanh_TimGiaTriLonNhatVaGhiRaFile/src/lamLaiLan2/Text/Text2");
        int maxValue = findMax(list);
        readAndWriteFile.writeFile("thucHanh_TimGiaTriLonNhatVaGhiRaFile/src/lamLaiLan2/Text/Result2",maxValue);

    }
}
