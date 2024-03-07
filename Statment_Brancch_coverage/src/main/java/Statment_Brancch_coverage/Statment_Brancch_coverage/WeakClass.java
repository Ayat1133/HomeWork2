package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {

	public static int weakMethod1(int a, int b) {
	    int result;
	    if (b == 0||a>9) {
	        result = a / b;
	    } else {
	        result=a+3;
	    }
	    return result;
	}

    public static int weakMethod2(int a, int b) {
        int result;

        if (b != 0) {
            if (a > 11) {
                result = a / b;
            } else {
                result = a / b;
            }
        } else {
            result = 0; 
        }

        return result;
    }


    public static int weakMethod3(int a, int b) {
        int result;
        if ((b > a) && (a != 0)) {
            b = b - a;
            result = b;
        } else if ((a > b) && (a == 0)) {
            b = a - b;
            result = b;
        } else {
            b = b / a;
            result = b;
        }
        return result;
    }

    	

    public static int weakMethod4(int a, int b) {
        int c;

        if (b != 0) {
            c = a / b;
        } else {
            c = -1;
        }

        return c;
    }

    
}

