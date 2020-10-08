import java.util.*;

class GenericStack <T> 
{
	private ArrayList<T> stack = new ArrayList<>();
	private int top=0;

	public T top()
	{
		return stack.get(stack.size() -1);
	}

	public int size() 
	{
		return top;
	}

	public void push(T item)
	{
		stack.add(top++, item);
	}

	public T pop()
{
		return stack.remove(--top);
	}

	public static void main(String[] args)
	{
		GenericStack<Integer> s = new GenericStack<>();
		s.push(17);
		s.push(29);

		System.out.println(s.top());
	}
}
