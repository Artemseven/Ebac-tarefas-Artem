package modulo11;

public class ExemploArrayListPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String StringValue = "Jane-F, Paul-M, Ferenc-M, David-M, Robert-M, Julia-F";
		String regex = ",";
		String[]output = StringValue.split(regex);

		System.out.println();
		System.out.println("Masculino:"+output[1]+output[2]+output[3]+output[4]);
		System.out.println("Femenino:"+output[0]+output[5]);
        System.out.println();

}

}