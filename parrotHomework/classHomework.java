package parrotHomework;

public class classHomework {

	public static boolean getUp(boolean squawking, int currentHour) {
		if(currentHour >= 0 && currentHour < 6 || currentHour > 22 && currentHour < 23)
	{
		return true;
	}
	else {
		return false;
	}
	}

	public static void main(String[] args) {
		System.out.println(getUp(false, 1));

	}
}


