public abstract class Widget implements IDisplayComponent, IKeyEventHandler {

    protected IKeyEventHandler nextHandler ;

    @Override
    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

    @Override
    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next ;
    }
}
