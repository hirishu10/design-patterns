package FacadePattern.Concreate;

public class CustomMath {

    AddOperation addOperation;
    SubOperation subOperation;
    MultOperation multOperation;
    DivOperation divOperation;

    public CustomMath() {
        addOperation = new AddOperation();
        subOperation = new SubOperation();
        multOperation = new MultOperation();
        divOperation = new DivOperation();
    }

    public void add(int sumOne,int sumTwo){
        this.addOperation.operation(sumOne,sumTwo);
    }

    public void sub(int sumOne,int sumTwo){
        this.subOperation.operation(sumOne,sumTwo);
    }

    public void mul(int sumOne,int sumTwo){
        this.multOperation.operation(sumOne,sumTwo);
    }

    public void div(int sumOne,int sumTwo){
        this.divOperation.operation(sumOne,sumTwo);
    }
}
