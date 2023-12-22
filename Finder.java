import java.util.ArrayList;

public class Finder<T, R> {
    public T FindElement(ArrayList<T> elements, R element) {
        for (T el : elements) {
            if (el.equals(element)) {
                return el;
            }
        }
        return null;
    }

    public void SortByElementType(ArrayList<T> elements, R element) {
        for (int i = 0; i < elements.size(); i++) {
            T el = elements.get(i);
            if (el.getClass().getName().equals(element.getClass().getName())) {
                elements.remove(i);
                elements.addFirst(el);
            }
        }
    }
}
