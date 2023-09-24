package challenges;

public  class DefangIP {

public static String defangIPaddr(String address) {
        String defangIP=null;
        defangIP=address.replace(".", "[.]");
        
        return defangIP;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "255.100.50.0";
		System.out.println(defangIPaddr(address));
	}

}
