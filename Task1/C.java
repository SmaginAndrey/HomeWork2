package Task1;

import java.util.Date;
import java.util.UUID;

public class C extends A {
    protected UUID varC1;

    public UUID getVarC1() {
        return varC1;
    }

    public void setVarC1(UUID varC1) {
        this.varC1 = varC1;
    }

    @Override
    public int foo(Date date) {
        return 0;
    }

    @Override
    public void buzz() {

    }
}
