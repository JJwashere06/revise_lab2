package logic.unit;

public class FlyingUnit extends BaseUnit{
    public FlyingUnit(int startColumn,int startRow,boolean isWhite,String name){
        super(startColumn,startRow,isWhite,name);
        this.setHp(2);
        this.isFlying=true;
    }
}
