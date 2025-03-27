package tad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // Đọc danh sách số nguyên từ tệp
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println(" Lỗi: Tệp không tồn tại!");
            return numbers;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    numbers.add(Integer.parseInt(line.trim())); // Tránh lỗi nếu có khoảng trắng
                } catch (NumberFormatException e) {
                    System.out.println(" Cảnh báo: Dòng không hợp lệ -> " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
        return numbers;
    }

    // Ghi giá trị lớn nhất vào tệp
    public void writeFile(String filePath, int max) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.newLine(); // Xuống dòng trước khi ghi
            bw.write("Giá trị lớn nhất là: " + max);
            System.out.println(" Ghi file thành công!");
        } catch (IOException e) {
            System.out.println(" Lỗi khi ghi file: " + e.getMessage());
        }
    }

    // Tìm giá trị lớn nhất trong danh sách
    public static int findMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException(" Danh sách rỗng, không thể tìm giá trị lớn nhất!");
        }
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Chương trình chính
    public static void main(String[] args) {
        ReadAndWriteFile rw = new ReadAndWriteFile();
        String filePath = "numbers.txt";

        List<Integer> numbers = rw.readFile(filePath);

        if (!numbers.isEmpty()) {
            int maxValue = findMax(numbers);
            rw.writeFile(filePath, maxValue);
        } else {
            System.out.println(" Không có số nào trong tệp để xử lý!");
        }
    }
}

