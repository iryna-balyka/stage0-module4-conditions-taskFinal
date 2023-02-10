package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int res = 0;
        if ((firstSide > 0) && (secondSide > 0) && (thirdSide > 0)) {
        if ((firstSide + secondSide > thirdSide) && (secondSide +thirdSide > firstSide) && (firstSide + thirdSide > secondSide)){
            res = 1;
        }
}
        switch (res){
            case 1:
                System.out.println("this is a valid triangle");
                break;
            case 0:
                System.out.println("it's not a triangle");
        }

    }
}
