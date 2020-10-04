import java.util.*;
public class MyArrayList<E> 
{
  private static int size;
  private  E[] data;
  private int MAX_ELEMENTS = 100;
  
  public MyArrayList() 
  {
	   data = (E[])new Object[MAX_ELEMENTS];
       size = 0;
  }
  
  public void add(int index, E e) 
  {   
    if (index < 0 || index > size)
	{
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size); 
	}
    for (int i = size - 1; i >= index; i--)
	{
      data[i + 1] = data[i];
	}
    data[index] = e;
    size++;
  }

  public boolean contains(Object e) 
  {
    for (int i = 0; i < size; i++)
	{
      if (e.equals(data[i])) 
	  {
		  return true;
	  }
	}
    return false;
  }

  public E get(int index) 
  {
    if (index < 0 || index >= size)
	{
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	}
    return data[index];
  }
  
  public E remove(int index) 
  {
	if (index < 0 || index >= size)
	{
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	}
    E e = data[index];
	
    for (int j = index; j < size - 1; j++)
	{
      data[j] = data[j + 1];
	}
    data[size - 1] = null;
    size--;
    return e;
  }
  
	public Integer binarySearch(E key)
	{
		if (size() == 0)
		{
			return null;
		}
		
		Integer low = 0;
		Integer high = (Integer)size() - 1;
		
		return binarySearch(key, low, high);
	}
	
	public Integer binarySearch(E key,Integer low,Integer high)
	{
		Integer mid = new Integer(0);
		
		if (low > high)
		{
			return (-low - 1);
		}
		
		mid = (low + high)/2;
		
		if (((Comparable)data[mid]).compareTo(key) > 0)
		{
			return binarySearch(key, low, mid - 1);
		}
		else if (((Comparable)data[mid]).compareTo(key) == 0)
		{
			return mid;
		}
		else
		{
			return binarySearch(key, mid + 1, high);
		}
	}

  public String toString() 
  {
    String result="[";
    for (int i = 0; i < size; i++) 
	{
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }

  
  public int size() 
  {
    return size;
  }
  
 public boolean sortList() 
 {
    E hold;
	for (int i = 0; i < size-1; i++)
	{
		for (int j = 0; j<size-1; j++)
		{  	 
			if(((Comparable)data[j]).compareTo(data[j+1]) > 0)
			{
				hold= data[j+1];
				data[j+1]=data[j];
				data[j]=hold;
			}       
		}
	} 
	return true;	  	
  }
  
	public void insertionSort()
	{
		 E currentElement;
		
		for(int i =1; (((Comparable)i).compareTo(size)<0);i++)
		{
			 currentElement = data[i];
			 int k;
			for( k = i - 1; k>=0 && (((Comparable)data[k]).compareTo(currentElement)>0) ;k--)
			{
				data[k+1] = data[k];
			}
			
			data[k+1] = currentElement;
		}
		
	}

  public void InsertSorted(E a)
  {
	int b = 0;
	boolean flag = true;
	  
	if (size > 0)
	{
		while (flag)
		{
			if (((Comparable)data[b]).compareTo(a) >= 0)
			{
				for (int j = size;j >= b; j--)
				{
					data[j + 1] = data[j];
					flag = false;
				}
				data[b] = (E)a;
			}
			else
			{
				data[size] = (E)a;
			}
			b++;
		}
	}
	else
	{
		throw new IndexOutOfBoundsException("Size: " + size);
	}
	size++;
  }
}