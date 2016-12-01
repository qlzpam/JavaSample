import java.io.*;
public class ProductApp{
	// ��ǰ���� �ؽ�Ʈ �� ���� ���޹޾Ƽ�
	// �� �߶� Product�� ��Ƽ� ��ȯ�ϴ� �޼ҵ�
	public static Product parseData(String text){
		String[] arr1 = text.split(",");
		Product pro = new Product(arr1[0], arr1[1], Integer.parseInt(arr1[2]), Double.parseDouble(arr1[3]));
		return pro;
	}
	public static void main(String[] args) throws Exception{
		Product[] products = new Product[4];
		BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
			products[0] = parseData(reader.readLine());
			products[1] = parseData(reader.readLine());
			products[2] = parseData(reader.readLine());
			products[3] = parseData(reader.readLine());
			
			for (Product product : products){
				System.out.println(product);
			}
	}
}