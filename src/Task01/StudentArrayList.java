package Task01;


public class StudentArrayList {

    private Student[] elementData;
    private int size;

    public StudentArrayList() {
        elementData = new Student[3];
    }

    //获取地index个元素；
    public Student get(int index) {
        if (index < size) {
            return elementData[index];
        } else {
            throw new IndexOutOfBoundsException("index");
        }
    }

    //获取现存的元素的数量；
    public int Size() {
        return size;
    }

    //添加元素；
    public void add(Student element) {
        //如果元素已经满了；
        if (size >= elementData.length) {
            //构造一个更大的数组；
            Student[] newElementData = new Student[size = size / 2 + 1];
            //从旧的数组里复制元素到新数组中；
            for (int i = 0; i < size; i++) {
                newElementData[i] = elementData[i];
            }
            //用新数组替换旧数组；
            elementData = newElementData;
        }
        //将元素（参数）添加到数组中；
        elementData[size++] = element;
    }
}