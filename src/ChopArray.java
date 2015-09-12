
public class ChopArray
{

    private int[] values;

    public ChopArray(int[] values)
    {
        this.values = values;
    }

    public int getMiddlePosition()
    {
        return getSize()/2;
    }

    public boolean isArrayGreaterThanOne() {
        return getSize() >1;
    }

    public boolean isArrayEmpty() {
        return getSize() == 0;
    }

    private int getMiddlePositionValue()
    {
        return values[getMiddlePosition()];
    }

    private int getSize() {
        return values.length;
    }

    public boolean isMiddlePositionValueGreaterThan(int valueToFind) {
        return getMiddlePositionValue() > valueToFind;
    }

    public ChopArray getZeroToMiddleSubArray(){
        return getArrayFromStartPositionToLastPosition(0, getMiddlePosition());
    }

    public ChopArray getMiddleToEndSubArray(){
        return getArrayFromStartPositionToLastPosition(getMiddlePosition(), getSize() );
    }

    private ChopArray getArrayFromStartPositionToLastPosition(int startPosition, int endPosition) {
        ChopArray result = new ChopArray(new int[endPosition - startPosition]);
        int newIndex = 0;
        for(int index = startPosition; index<endPosition; index++)
        {
            result.values[newIndex++] = values[index];
        }
        return result;
    }

    public boolean isMiddlePositionValueEqualsTo(int valueToFind) {

        if(isArrayEmpty())
        {
            return false;
        }

        return getMiddlePositionValue() == valueToFind;
    }
}
