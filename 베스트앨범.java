https://yoloaeee.tistory.com/330

================================================
  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution
{
    static class music
	{
		ArrayList<int[]> playlist = new ArrayList<int[]>();
		String genre;
		int play;
		
		music(int index, String genre, int play)
		{
			this.playlist.add(new int[] {index, play});
			this.genre = genre;
			this.play = play;
		}
	}
    public Object[] solution(String[] genres, int[] plays)
    {
        ArrayList<music> m = new ArrayList<music>();
		
		for(int i=0; i<genres.length; i++)
		{
			boolean flag = true;
			
			for(music temp : m)
			{
				if(temp.genre.equals(genres[i]))
				{
					temp.play += plays[i];
					temp.playlist.add(new int[] {i, plays[i]});
					flag = false;
					break;
				}
			}
			if(flag)
			{
				music temp = new music(i, genres[i], plays[i]);
				m.add(temp);
			}
		}
		for(music temp : m)
		{
			Collections.sort(temp.playlist, new Comparator<int[]>()
			{
				@Override
				public int compare(int[] a, int[] b)
				{
					if(a[1]==b[1])
					{
						return a[0]-b[0];
					}
					else
					{
						return b[1]-a[1];
					}
				}
				
			});
		}
		
		Collections.sort(m, new Comparator<music>()
		{
			@Override
			public int compare(music m1, music m2)
			{
				return m2.play-m1.play;
			}
		});
		
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for(music temp : m)
		{
			if(temp.playlist.size()==1)
			{
				answer.add(temp.playlist.get(0)[0]);
			}
			else
			{
				answer.add(temp.playlist.get(0)[0]);
				answer.add(temp.playlist.get(1)[0]);
			}
		}
		
		return answer.toArray();
    }
}
