public class Decorator extends Widget {

    private Widget component;

    public Decorator(Widget c) {
        component = c;
    }

    @Override
    public String display() {
        return component.display();
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {
        component.addSubComponent(c);
    }

    @Override
    public void key(String ch, int cnt) {
        component.key(ch, cnt);
    }

    @Override
    public void setNext(IKeyEventHandler next) {
        component.setNext(next);
    }
}
