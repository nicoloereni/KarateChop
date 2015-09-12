

public class KarateChop {

    public int chop(int valueToFind, ChopArray arrayOfValues) {

        if (arrayOfValues.isArrayGreaterThanOne() || arrayOfValues.isMiddlePositionValueEqualsTo(valueToFind)) {

            if (arrayOfValues.isMiddlePositionValueEqualsTo(valueToFind)) {
                return arrayOfValues.getMiddlePosition();
            }

            if (arrayOfValues.isMiddlePositionValueGreaterThan(valueToFind))
            {
                return chop(valueToFind, arrayOfValues.getZeroToMiddleSubArray());

            } else
            {
                int valuePositionRightSide = chop(valueToFind, arrayOfValues.getMiddleToEndSubArray());
                return valuePositionRightSide == -1 ? -1 : valuePositionRightSide + arrayOfValues.getMiddlePosition();
            }
        }

        return -1;
    }

}
